package uz.elmurodov.trelloetm.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.elmurodov.trelloetm.domain.project.Project;
import uz.elmurodov.trelloetm.dto.organization.OrganizationUpdateDto;
import uz.elmurodov.trelloetm.dto.project.ProjectCreateDto;
import uz.elmurodov.trelloetm.dto.project.ProjectDto;
import uz.elmurodov.trelloetm.dto.project.ProjectUpdateDto;

@Component
@Mapper(componentModel = "spring")
public interface ProjectMapper extends GenericMapper<Project, ProjectDto, ProjectCreateDto, ProjectUpdateDto>{
}
