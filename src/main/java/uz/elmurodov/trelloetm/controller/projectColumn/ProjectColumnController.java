package uz.elmurodov.trelloetm.controller.projectColumn;

import uz.elmurodov.trelloetm.controller.AbstractController;
import uz.elmurodov.trelloetm.service.projectColumn.ProjectColumnService;

public class ProjectColumnController extends AbstractController<ProjectColumnService> {
    protected ProjectColumnController(ProjectColumnService service) {
        super(service);
    }
}
