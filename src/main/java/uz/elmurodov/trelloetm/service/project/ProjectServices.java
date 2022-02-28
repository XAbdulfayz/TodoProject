package uz.elmurodov.trelloetm.service.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.elmurodov.trelloetm.criteria.GenericCriteria;
import uz.elmurodov.trelloetm.dto.project.ProjectCreateDto;
import uz.elmurodov.trelloetm.dto.project.ProjectDto;
import uz.elmurodov.trelloetm.dto.project.ProjectUpdateDto;
import uz.elmurodov.trelloetm.mapper.ProjectMapper;
import uz.elmurodov.trelloetm.repository.project.ProjectRepository;
import uz.elmurodov.trelloetm.service.AbstractService;
import uz.elmurodov.trelloetm.service.GenericCrudService;
import uz.elmurodov.trelloetm.utils.validators.ProjectValidator;
import uz.elmurodov.trelloetm.utils.BaseUtils;

import java.io.IOException;
import java.util.List;


@Service
public class ProjectServices extends AbstractService<ProjectRepository, ProjectMapper, ProjectValidator> implements GenericCrudService
        <ProjectDto, ProjectCreateDto, ProjectUpdateDto, GenericCriteria, Long> {



    protected ProjectServices(ProjectRepository repository, ProjectMapper mapper, ProjectValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(ProjectCreateDto createDto) throws IOException {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(ProjectUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<ProjectDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public ProjectDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
