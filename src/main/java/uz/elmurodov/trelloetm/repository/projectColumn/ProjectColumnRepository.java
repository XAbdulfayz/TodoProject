package uz.elmurodov.trelloetm.repository.projectColumn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.trelloetm.domain.column.ProjectColumn;
import uz.elmurodov.trelloetm.repository.AbstractRepository;

@Repository
public interface ProjectColumnRepository  extends JpaRepository<ProjectColumn, Long>, AbstractRepository {

}
