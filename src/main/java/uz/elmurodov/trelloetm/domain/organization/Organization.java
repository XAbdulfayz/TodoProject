package uz.elmurodov.trelloetm.domain.organization;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.IndexColumn;
import uz.elmurodov.trelloetm.domain.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;


@Getter
@Setter
@Entity
public class Organization extends Auditable {

    @Column(name = "organization_name", unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String registerNumber;

    @Column(unique = true)
    private String email;

    private boolean blocked;

    @Column(name = "file_id")
    private Long fileId;

    private String website;


}
