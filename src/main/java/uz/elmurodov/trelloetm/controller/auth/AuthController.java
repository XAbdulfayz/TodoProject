package uz.elmurodov.trelloetm.controller.auth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Objects;

@Controller
@RequestMapping("/auth/*")
public class AuthController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage(Model model, @RequestParam(name = "logout", required = false) String logoutParam) {
        if (Objects.nonNull(logoutParam))
            model.addAttribute("message", "You have signed out");
        return "auth/login";
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logoutPage() {
        return "auth/logout";
    }

    @RequestMapping(value = "reset-password", method = RequestMethod.GET)
    public String resetPasswordPage(Model model) {
        return "auth/reset-password";
    }

    @RequestMapping(value = "reset-password", method = RequestMethod.POST)
    public String resetPassword(Model model) {
        model.addAttribute("email", "john.lgd65@gamil.com");
        return "auth/reset-password-sent";
    }

}
