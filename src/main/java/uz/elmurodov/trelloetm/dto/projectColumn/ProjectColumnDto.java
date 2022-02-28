package uz.elmurodov.trelloetm.dto.projectColumn;

import lombok.*;
import uz.elmurodov.trelloetm.domain.project.Project;
import uz.elmurodov.trelloetm.dto.GenericDto;
import uz.elmurodov.trelloetm.dto.organization.OrganizationDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectColumnDto extends GenericDto {

    private String name;
    private Project project;


    public ProjectColumnDto(Long id, String name, Project project) {
        super(id);
        this.name = name;
        this.project = project;
    }

}
