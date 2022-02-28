package uz.elmurodov.trelloetm.service.file;

import org.springframework.stereotype.Service;
import uz.elmurodov.trelloetm.domain.file.Uploads;
import uz.elmurodov.trelloetm.dto.file.UploadCreateDto;
import uz.elmurodov.trelloetm.mapper.FileStorageMapper;
import uz.elmurodov.trelloetm.repository.file.FileStorageRepository;
import uz.elmurodov.trelloetm.service.AbstractService;
import uz.elmurodov.trelloetm.utils.BaseUtils;
import uz.elmurodov.trelloetm.utils.validators.Validator;

@Service
public class FileStorageService extends AbstractService<FileStorageRepository, FileStorageMapper, Validator> {

    protected FileStorageService(FileStorageRepository repository, FileStorageMapper mapper, Validator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    public Long save(UploadCreateDto dto) {
        Uploads uploads = mapper.fromCreateDto(dto);
        repository.save(uploads);
        return uploads.getId();
    }

}
