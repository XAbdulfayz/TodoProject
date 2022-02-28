package uz.elmurodov.trelloetm.repository.organization;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.trelloetm.domain.organization.Organization;
import uz.elmurodov.trelloetm.repository.AbstractRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long>, AbstractRepository {
}
