package uz.elmurodov.trelloetm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.elmurodov.trelloetm.domain.auth.Role;
import uz.elmurodov.trelloetm.domain.auth.User;
import uz.elmurodov.trelloetm.enums.UserStateType;
import uz.elmurodov.trelloetm.repository.auth.AuthRoleRepository;
import uz.elmurodov.trelloetm.repository.auth.AuthUserRepository;

@EnableJpaAuditing
@SpringBootApplication
public class TrelloEtmApplication /*implements CommandLineRunner*/ {


    private final AuthUserRepository authUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthRoleRepository authRoleRepository;

    public TrelloEtmApplication(AuthUserRepository authUserRepository, PasswordEncoder passwordEncoder, AuthRoleRepository authRoleRepository) {
        this.authUserRepository = authUserRepository;
        this.passwordEncoder = passwordEncoder;
        this.authRoleRepository = authRoleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TrelloEtmApplication.class, args);
    }



    public void run(String... args) throws Exception {
        Role admin = authRoleRepository.getById(1L);
        User user = new User();
        user.setUserName("admin");
        user.setPassword(passwordEncoder.encode("admin"));
        user.setState(UserStateType.ACTIVE);
        user.setSystemAdmin(true);
        user.setRole(admin);
        authUserRepository.save(user);
    }
}
