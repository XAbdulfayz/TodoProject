package uz.elmurodov.trelloetm.domain.auth;


import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import uz.elmurodov.trelloetm.domain.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "auth_permissions")
public class Permission extends Auditable implements GrantedAuthority {

    @Column(name = "name")
    private String name;

    @Column(name = "code_name")
    private String codeName;

    @Column(name = "is_for_system_admin", columnDefinition = "boolean default false")
    private boolean forSystemAdmin;

    @Override
    public String getAuthority() {
        return getCodeName();
    }

}