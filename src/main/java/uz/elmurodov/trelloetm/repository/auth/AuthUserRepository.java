package uz.elmurodov.trelloetm.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.trelloetm.domain.auth.User;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);
}
