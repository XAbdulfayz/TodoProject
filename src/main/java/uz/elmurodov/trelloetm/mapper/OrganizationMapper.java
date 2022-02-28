package uz.elmurodov.trelloetm.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.elmurodov.trelloetm.domain.organization.Organization;
import uz.elmurodov.trelloetm.dto.organization.OrganizationCreateDto;
import uz.elmurodov.trelloetm.dto.organization.OrganizationDto;
import uz.elmurodov.trelloetm.dto.organization.OrganizationUpdateDto;

@Component
@Mapper(componentModel = "spring")
public interface OrganizationMapper extends GenericMapper<Organization, OrganizationDto, OrganizationCreateDto, OrganizationUpdateDto> {
}
