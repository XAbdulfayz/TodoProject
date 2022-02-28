package uz.elmurodov.trelloetm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.elmurodov.trelloetm.dto.organization.OrganizationCreateDto;
import uz.elmurodov.trelloetm.service.organization.OrganizationService;

import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping("/organization/*")
public class OrganizationController extends AbstractController<OrganizationService> {

    protected OrganizationController(OrganizationService service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String createPage(Model model) {
        model.addAttribute("dto", new OrganizationCreateDto());
        return "organization/create";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String updatePage(@Valid @ModelAttribute(name = "dto") OrganizationCreateDto dto) throws IOException {
        service.create(dto);
        return "redirect:/";
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public String deletePage(@PathVariable Long id){
        service.delete(id);
        return "Successfully deleted";
    }

    //
//    @RequestMapping(value = "create/{id}", method = RequestMethod.POST)
//    public String delete(@PathVariable Long id) {
//        return "organization/delete";
//    }
//

//
//    @RequestMapping(value = "create", method = RequestMethod.GET)
//    public String listPage() {
//        return "organization/create";
//    }


}
