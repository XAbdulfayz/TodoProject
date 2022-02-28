package uz.elmurodov.trelloetm.dto.project;

import lombok.*;
import uz.elmurodov.trelloetm.domain.organization.Organization;
import uz.elmurodov.trelloetm.dto.Dto;
import uz.elmurodov.trelloetm.dto.GenericDto;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectCreateDto extends GenericDto {

    private String name;
    private Organization organization;


    public ProjectCreateDto(Long id, String name, Organization organization) {
        super(id);
        this.name = name;
        this.organization = organization;
    }
}
