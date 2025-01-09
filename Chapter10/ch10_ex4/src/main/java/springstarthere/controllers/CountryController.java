package springstarthere.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springstarthere.model.Country;

@RestController
public class CountryController {

    @GetMapping(path = "/france")
    public  ResponseEntity<Country> france() {

        // static Factory method pattern
        Country c = Country.of("France", 67);
        
        return ResponseEntity
                    .status(HttpStatus.ACCEPTED)  // change the HTTP reponse status  to "202 Accepted"
                    .header("continent", "Europe")
                    .header("capital", "Paris")
                    .header("favourite_food", "cheese and wine")
                    .body(c);

    }

    @GetMapping(path = "/all")
    public List<Country> countries() {

        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 47);

        return List.of(c1, c2);
    }
}