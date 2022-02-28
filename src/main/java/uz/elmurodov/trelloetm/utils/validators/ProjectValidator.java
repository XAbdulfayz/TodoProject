package uz.elmurodov.trelloetm.utils.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.elmurodov.trelloetm.dto.project.ProjectCreateDto;
import uz.elmurodov.trelloetm.dto.project.ProjectUpdateDto;
import uz.elmurodov.trelloetm.exceptions.ValidationException;
import uz.elmurodov.trelloetm.utils.BaseUtils;
import uz.elmurodov.trelloetm.utils.validators.AbstractValidator;

@Component
public class ProjectValidator extends AbstractValidator<ProjectCreateDto, ProjectUpdateDto, Long> {

    @Autowired
    protected ProjectValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(ProjectCreateDto projectCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(ProjectUpdateDto cd) throws ValidationException {

    }
}
