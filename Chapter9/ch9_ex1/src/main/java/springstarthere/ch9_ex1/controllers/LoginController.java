package springstarthere.ch9_ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springstarthere.ch9_ex1.model.LoginProcessor;

@Controller
public class LoginController {

    // instance variable
    private final LoginProcessor loginProcessor;

    
    // constructor
    public LoginController() {
        this.loginProcessor = new LoginProcessor();
    }
    public LoginController (LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }
    

    @PostMapping(path="/")
    public String loginPost (@RequestParam String inputUsername, @RequestParam String inputPassword, Model model) {

        loginProcessor.setUsername(inputUsername);
        loginProcessor.setPassword(inputPassword);

        // implementation the login logic later, loggedIn variable will store the login request result
        boolean loggedIn = loginProcessor.credentialLoginValidation();

        if (loggedIn) {
            model.addAttribute("message", "You are now logged in.");
        } else {
            model.addAttribute("message", "Login failed!");
        }

        return "login.html";

    }


    @GetMapping(path="/")  // map the controller's action to the root ("/") path of the application
    public String loginGet() {
        return "login.html";
    }

}