package uz.elmurodov.trelloetm.service.organization;

import org.springframework.stereotype.Service;
import uz.elmurodov.trelloetm.criteria.GenericCriteria;
import uz.elmurodov.trelloetm.domain.organization.Organization;
import uz.elmurodov.trelloetm.dto.file.UploadDto;
import uz.elmurodov.trelloetm.dto.organization.OrganizationCreateDto;
import uz.elmurodov.trelloetm.dto.organization.OrganizationDto;
import uz.elmurodov.trelloetm.dto.organization.OrganizationUpdateDto;
import uz.elmurodov.trelloetm.mapper.OrganizationMapper;
import uz.elmurodov.trelloetm.repository.organization.OrganizationRepository;
import uz.elmurodov.trelloetm.service.AbstractService;
import uz.elmurodov.trelloetm.service.GenericCrudService;
import uz.elmurodov.trelloetm.service.file.StorageService;
import uz.elmurodov.trelloetm.utils.BaseUtils;
import uz.elmurodov.trelloetm.utils.validators.OrganizationValidator;

import javax.validation.ValidationException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class OrganizationService extends AbstractService<OrganizationRepository, OrganizationMapper, OrganizationValidator> implements GenericCrudService
        <OrganizationDto, OrganizationCreateDto, OrganizationUpdateDto, GenericCriteria, Long> {

    private final StorageService storageService;

    protected OrganizationService(OrganizationRepository repository, OrganizationMapper mapper, OrganizationValidator validator, BaseUtils baseUtils, StorageService storageService) {
        super(repository, mapper, validator, baseUtils);
        this.storageService = storageService;
    }


    @Override
    public Long create(OrganizationCreateDto createDto) throws IOException {
        Organization organization = mapper.fromCreateDto(createDto);
        Long fileId;
        if (!Objects.isNull(createDto.getLogo())) {
            fileId = storageService.save(createDto.getLogo());
        } else {
            fileId = null;
        }
        organization.setFileId(fileId);
        repository.save(organization);
        return fileId;
    }

    @Override
    public Void delete(Long id) {
        Organization byId = repository.findById(id).orElseThrow(() -> new ValidationException("Organization not found"));
        repository.deleteById(id);
        return null;

    }

    @Override
    public Void update(OrganizationUpdateDto updateDto) throws IOException {

        Organization organization = mapper.fromUpdateDto(updateDto);

        Long fileId =null;
        if (!Objects.isNull(updateDto.getLogo())) fileId = storageService.save(updateDto.getLogo());
        organization.setFileId(fileId);
        organization.setUpdatedAt(LocalDateTime.now());

        repository.save(organization);

        return null;
    }

    @Override
    public List<OrganizationDto> getAll(GenericCriteria criteria) {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public OrganizationDto get(Long id) {
        return mapper.toDto(repository.findById();
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
