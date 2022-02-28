package uz.elmurodov.trelloetm.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.trelloetm.domain.auth.Role;

public interface AuthRoleRepository extends JpaRepository<Role, Long> {

}
