package uz.elmurodov.trelloetm.dto.projectColumn;


import lombok.*;
import uz.elmurodov.trelloetm.domain.project.Project;
import uz.elmurodov.trelloetm.dto.Dto;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectColumnCreateDto implements Dto {

    private String name;
    private Project project;



}
