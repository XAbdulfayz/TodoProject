package uz.elmurodov.trelloetm.mapper;


import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.elmurodov.trelloetm.domain.file.Uploads;
import uz.elmurodov.trelloetm.dto.GenericDto;
import uz.elmurodov.trelloetm.dto.file.UploadCreateDto;
import uz.elmurodov.trelloetm.dto.file.UploadDto;

@Mapper(componentModel = "spring")
@Component
public interface FileStorageMapper extends GenericMapper<Uploads, UploadDto, UploadCreateDto, GenericDto> {
}
