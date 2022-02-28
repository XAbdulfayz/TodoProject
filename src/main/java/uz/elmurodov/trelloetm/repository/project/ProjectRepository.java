package uz.elmurodov.trelloetm.repository.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.trelloetm.domain.project.Project;
import uz.elmurodov.trelloetm.repository.AbstractRepository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>, AbstractRepository {


}
