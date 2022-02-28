package uz.elmurodov.trelloetm.dto.project;

import lombok.*;
import uz.elmurodov.trelloetm.domain.organization.Organization;
import uz.elmurodov.trelloetm.dto.GenericDto;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectUpdateDto extends GenericDto {

    private String name;
    private boolean isClosed;
    private Organization organization;


    public ProjectUpdateDto(Long id, String name, boolean isClosed, Organization organization) {
        super(id);
        this.name = name;
        this.isClosed = isClosed;
        this.organization = organization;
    }
}
