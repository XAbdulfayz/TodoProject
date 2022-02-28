package uz.elmurodov.trelloetm.controller.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.elmurodov.trelloetm.controller.AbstractController;
import uz.elmurodov.trelloetm.service.project.ProjectServices;

@Controller
@RequestMapping("/project/*")
public class ProjectController extends AbstractController<ProjectServices> {

    protected ProjectController(ProjectServices service) {
        super(service);
    }

    @RequestMapping(value = "projects", method = RequestMethod.GET)
    public void getProjects() {

    }

}
