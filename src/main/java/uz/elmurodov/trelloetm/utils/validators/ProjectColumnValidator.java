package uz.elmurodov.trelloetm.utils.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.elmurodov.trelloetm.dto.projectColumn.ProjectColumnCreateDto;
import uz.elmurodov.trelloetm.dto.projectColumn.ProjectColumnDto;
import uz.elmurodov.trelloetm.exceptions.ValidationException;
import uz.elmurodov.trelloetm.utils.BaseUtils;

@Component
public class ProjectColumnValidator extends AbstractValidator<ProjectColumnCreateDto, ProjectColumnDto, Long> {

    @Autowired
    protected ProjectColumnValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(ProjectColumnCreateDto projectColumnCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(ProjectColumnDto cd) throws ValidationException {

    }
}
