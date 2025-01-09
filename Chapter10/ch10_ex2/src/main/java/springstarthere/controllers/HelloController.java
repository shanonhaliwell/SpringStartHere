package springstarthere.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    //@ResponseBody
    public String hello() {
        return "hello shanonhaliwell";
    }

    @GetMapping(path = "/home")
    //@ResponseBody
    public String home() {
        return "home of shanonhaliwell";
    }
}