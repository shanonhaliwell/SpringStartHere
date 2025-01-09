package springstarthere.ch9_ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springstarthere.ch9_ex2.services.LoggedUserManagementService;

@Controller
public class MainController {

    // instance variable
    private final LoggedUserManagementService loggedUserManagementService;

    // constructor
    public MainController (LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping(path = "/main")
    public String home (@RequestParam(required = false) String logout, Model model) {

        // 
        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }

        // take the username value, which should be different than null if someone logged in
        String username = this.loggedUserManagementService.getUsername();

        // if user is not logged in, redirect the user to the login page
        if (username == null) {
            return "redirect:/";
        }

        // if username != null
        model.addAttribute("username", username);

        // if the user is logged in, return the view for the main page
        return "main.html";

    }

}