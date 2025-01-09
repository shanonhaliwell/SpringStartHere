package springstarthere.ch8_ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(@RequestParam(required = false) String color, Model page) {
    //public String home(@RequestParam String color, Model page) {
    // Model parameter to send data from the cotroller to the view

        page.addAttribute("username", "John");
        page.addAttribute("color", "yellow");

        return "home.html";
    }

    // http://localhost:8080/home?color=yellow
    // http://localhost:8080/home?color=blue
    // http://localhost:8080/home?color=blue&name=Jan
    // http://localhost:8080/home?name=Jan&color=blue
    // http://localhost:8080/home?name=Jan

}