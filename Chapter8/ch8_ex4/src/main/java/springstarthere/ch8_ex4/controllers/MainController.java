package springstarthere.ch8_ex4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home/{color}")
    public String home(@PathVariable String color, Model page) {
    //public String home(@RequestParam String name, @RequestParam(required = false) String color, Model page) {
    // Model parameter to send data from the cotroller to the view

        page.addAttribute("username", "John");
        page.addAttribute("color", color);

        return "home.html";
    }

    // http://localhost:8080/home?color=yellow
    // http://localhost:8080/home?color=blue
    // http://localhost:8080/home?color=blue&name=Jan
    // http://localhost:8080/home?name=Jan&color=blue
    // http://localhost:8080/home?name=Jan

}