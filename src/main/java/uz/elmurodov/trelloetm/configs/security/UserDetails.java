package uz.elmurodov.trelloetm.configs.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import uz.elmurodov.trelloetm.domain.auth.Permission;
import uz.elmurodov.trelloetm.domain.auth.Role;
import uz.elmurodov.trelloetm.domain.auth.User;
import uz.elmurodov.trelloetm.enums.UserStateType;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
public class UserDetails implements org.springframework.security.core.userdetails.UserDetails {

    private final Long id;

    private final String username;

    private final String password;

    private final boolean enabled;

    private final UserStateType status;

    private final String email;

    private final String chatId;

    private final Long organizationId;

    private final boolean systemAdmin;

    private Set<SimpleGrantedAuthority> authorities;

    public UserDetails(User user) {
        this.id = user.getId();
        this.username = user.getUserName();
        this.password = user.getPassword();
        this.status = user.getState();
        this.email = user.getEmail();
        this.chatId = user.getChatId();
        this.organizationId = user.getOrganizationId();
        this.systemAdmin = user.isSystemAdmin();
        this.enabled = !user.isDeleted();
        this.authorities = new HashSet<>();
        processAuthorities(user.getRole());
    }

    private void processAuthorities(Role role) {
        if (Objects.nonNull(role)) authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
        Collection<Permission> permissions = role.getPermissions();
        if (Objects.nonNull(permissions))
            authorities.addAll(permissions.stream().map(permission -> new SimpleGrantedAuthority(permission.getAuthority())).collect(Collectors.toSet()));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.status == UserStateType.ACTIVE;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }


}
