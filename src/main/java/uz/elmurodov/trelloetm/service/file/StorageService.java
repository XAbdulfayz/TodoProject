package uz.elmurodov.trelloetm.service.file;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import uz.elmurodov.trelloetm.dto.file.UploadCreateDto;
import uz.elmurodov.trelloetm.utils.BaseUtils;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

@Service
public class StorageService {


    @Value("${file.uploads.root.path}")
    private String rootLocationPath;

    private final Path rootLocation;

    private final BaseUtils utils;
    private final FileStorageService fileStorageService;

    public StorageService(BaseUtils utils, FileStorageService fileStorageService) {
        this.utils = utils;
        this.fileStorageService = fileStorageService;
        this.rootLocation = Paths.get(rootLocationPath);
    }

    @PostConstruct
    private void init() {
        if (!Files.exists(rootLocation)) {
            try {
                Files.createDirectories(rootLocation);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public Long save(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String generatedName = utils.encodeToMd5(Objects.requireNonNull(originalFilename)) + System.nanoTime() + "." + StringUtils.getFilenameExtension(originalFilename);
        Files.copy(file.getInputStream(), Paths.get(rootLocationPath, generatedName), StandardCopyOption.REPLACE_EXISTING);
        UploadCreateDto createDto = UploadCreateDto.builder().originalName(originalFilename).mimeType(file.getContentType()).size(file.getSize()).path("/uploads/" + generatedName).generatedName(generatedName).build();
        return fileStorageService.save(createDto);
    }

}
