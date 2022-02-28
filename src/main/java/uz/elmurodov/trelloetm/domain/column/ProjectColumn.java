package uz.elmurodov.trelloetm.domain.column;

import lombok.Getter;
import lombok.Setter;
import uz.elmurodov.trelloetm.domain.Auditable;
import uz.elmurodov.trelloetm.domain.project.Project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class ProjectColumn  extends Auditable {


    @Column(nullable=false)
    private String name;

    @Column(name="project_id")
    @ManyToOne
    private Project project;
}
