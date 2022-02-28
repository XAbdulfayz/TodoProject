package uz.elmurodov.trelloetm.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.trelloetm.domain.auth.Permission;

public interface AuthPermissionRepository extends JpaRepository<Permission, Long> {
}
