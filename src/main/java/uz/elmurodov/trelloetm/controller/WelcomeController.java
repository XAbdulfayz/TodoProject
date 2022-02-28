package uz.elmurodov.trelloetm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("")
    public String indexPage() {
        return "main";
    }
}
