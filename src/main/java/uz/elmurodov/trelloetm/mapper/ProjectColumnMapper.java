package uz.elmurodov.trelloetm.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.elmurodov.trelloetm.domain.column.ProjectColumn;
import uz.elmurodov.trelloetm.dto.projectColumn.ProjectColumnCreateDto;
import uz.elmurodov.trelloetm.dto.projectColumn.ProjectColumnDto;

@Component
@Mapper(componentModel = "spring")
public interface ProjectColumnMapper extends GenericMapper<ProjectColumn, ProjectColumnDto, ProjectColumnCreateDto, ProjectColumnDto>{
}
