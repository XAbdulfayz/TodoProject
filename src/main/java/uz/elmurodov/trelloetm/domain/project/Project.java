package uz.elmurodov.trelloetm.domain.project;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import uz.elmurodov.trelloetm.domain.Auditable;
import uz.elmurodov.trelloetm.domain.organization.Organization;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Project extends Auditable {

    @Column(nullable=false)
    private String name;

    @Column(name = "is_closed", columnDefinition = "NUMERIC default 0")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isClosed;


    @OneToOne
    private Organization organization;
}
