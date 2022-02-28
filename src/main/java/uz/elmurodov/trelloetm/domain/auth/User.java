package uz.elmurodov.trelloetm.domain.auth;

import lombok.Getter;
import lombok.Setter;
import uz.elmurodov.trelloetm.domain.Auditable;
import uz.elmurodov.trelloetm.enums.UserStateType;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "auth_user")
public class User extends Auditable {

    @Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    private String email;

    private String chatId;

    @Column(name = "organization_id")
    private Long organizationId;

    @Column(name = "is_system_admin", columnDefinition = "boolean default false")
    private boolean systemAdmin;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "type_state")
    @Enumerated(EnumType.ORDINAL)
    protected UserStateType state;

}

