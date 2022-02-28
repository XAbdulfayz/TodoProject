package uz.elmurodov.trelloetm.configs.security;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uz.elmurodov.trelloetm.domain.auth.User;
import uz.elmurodov.trelloetm.repository.auth.AuthUserRepository;


@Service
public class CustomUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final AuthUserRepository authUserRepository;

    public CustomUserDetailsService(AuthUserRepository authUserRepository) {
        this.authUserRepository = authUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = authUserRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException(
                        "User with name '%s' not found".formatted(username)
                ));
        return new UserDetails(user);
    }
}
