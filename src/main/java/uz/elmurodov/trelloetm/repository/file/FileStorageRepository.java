package uz.elmurodov.trelloetm.repository.file;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.trelloetm.domain.file.Uploads;
import uz.elmurodov.trelloetm.repository.AbstractRepository;

public interface FileStorageRepository extends JpaRepository<Uploads, Long>, AbstractRepository {
}
