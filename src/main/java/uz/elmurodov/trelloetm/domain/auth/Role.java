package uz.elmurodov.trelloetm.domain.auth;

import lombok.*;
import org.hibernate.annotations.Where;
import org.springframework.security.core.GrantedAuthority;
import uz.elmurodov.trelloetm.domain.Auditable;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "auth_roles")
public class Role extends Auditable implements GrantedAuthority {
    @Column(name = "role_name")
    private String roleName;

    @Column(name = "code_name")
    private String codeName;

    @Column(name = "organization_id")
    private Long organizationId;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "auth_roles_permissions",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id")})
    @Where(clause = "is_deleted = 0")
    private Collection<Permission> permissions;


    @Override
    public String getAuthority() {
        return "ROLE_" + getCodeName();
    }
}
