package uz.elmurodov.trelloetm.service.projectColumn;

import org.springframework.beans.factory.annotation.Autowired;
import uz.elmurodov.trelloetm.criteria.GenericCriteria;
import uz.elmurodov.trelloetm.dto.projectColumn.ProjectColumnCreateDto;
import uz.elmurodov.trelloetm.dto.projectColumn.ProjectColumnDto;
import uz.elmurodov.trelloetm.mapper.ProjectColumnMapper;
import uz.elmurodov.trelloetm.repository.projectColumn.ProjectColumnRepository;
import uz.elmurodov.trelloetm.service.AbstractService;
import uz.elmurodov.trelloetm.service.GenericCrudService;
import uz.elmurodov.trelloetm.utils.BaseUtils;
import uz.elmurodov.trelloetm.utils.validators.ProjectColumnValidator;

import java.io.IOException;
import java.util.List;

public class ProjectColumnService extends AbstractService<ProjectColumnRepository, ProjectColumnMapper, ProjectColumnValidator> implements GenericCrudService
        <ProjectColumnDto, ProjectColumnCreateDto, ProjectColumnDto, GenericCriteria, Long> {


    @Autowired
    protected ProjectColumnService(ProjectColumnRepository repository, ProjectColumnMapper mapper, ProjectColumnValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(ProjectColumnCreateDto createDto) throws IOException {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(ProjectColumnDto updateDto) {
        return null;
    }

    @Override
    public List<ProjectColumnDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public ProjectColumnDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
