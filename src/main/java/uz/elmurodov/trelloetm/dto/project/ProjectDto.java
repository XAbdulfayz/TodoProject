package uz.elmurodov.trelloetm.dto.project;

import org.hibernate.annotations.Type;
import uz.elmurodov.trelloetm.domain.organization.Organization;
import uz.elmurodov.trelloetm.dto.GenericDto;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;


public class ProjectDto extends GenericDto {

    private String name;
    private boolean isClosed;
    private Organization organization;


    public ProjectDto(Long id, String name, boolean isClosed, Organization organization) {
        super(id);
        this.name = name;
        this.isClosed = isClosed;
        this.organization = organization;
    }
}
