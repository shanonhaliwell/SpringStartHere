package springstarthere.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springstarthere.model.Country;

@RestController
public class CountryController {

    @GetMapping(path = "/france")
    public Country france() {

        // static Factory method pattern
        Country c = Country.of("France", 67);
        
        return c;
    }

    @GetMapping(path = "/all")
    public List<Country> countries() {

        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 47);

        return List.of(c1, c2);
    }
}