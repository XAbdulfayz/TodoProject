package uz.elmurodov.trelloetm.utils.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.elmurodov.trelloetm.dto.organization.OrganizationCreateDto;
import uz.elmurodov.trelloetm.dto.organization.OrganizationUpdateDto;
import uz.elmurodov.trelloetm.exceptions.ValidationException;
import uz.elmurodov.trelloetm.utils.BaseUtils;

@Component
public class OrganizationValidator extends AbstractValidator<OrganizationCreateDto, OrganizationUpdateDto, Long> {


    @Autowired
    protected OrganizationValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(OrganizationCreateDto organizationCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(OrganizationUpdateDto cd) throws ValidationException {



    }
}
