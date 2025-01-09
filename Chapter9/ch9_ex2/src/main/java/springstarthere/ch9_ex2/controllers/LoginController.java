package springstarthere.ch9_ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springstarthere.ch9_ex2.model.LoginProcessor;

@Controller
public class LoginController {

    // instance variable
    private final LoginProcessor loginProcessor;

    // constructor
    public LoginController (LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @PostMapping
    public String loginPost (@RequestParam String inputUsername, @RequestParam String inputPassword, Model model) {

        this.loginProcessor.setUsername(inputUsername);
        this.loginProcessor.setPassword(inputPassword);

        boolean loggedIn = loginProcessor.loginCredentialValidation();

        if (loggedIn) {
            return "redirect:/main";
        }

        // if loggedIn = false
        model.addAttribute("message", "Login failed!");

        return "login.html";

    }


    @GetMapping(path = "/")
    public String loginGet() {
        return "login.html";
    }


}
