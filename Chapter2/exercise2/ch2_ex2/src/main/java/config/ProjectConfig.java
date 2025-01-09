package config;

import springstarthere.Parrot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// @Configuration annotation to define this class as a Spring configuration class
// import org.springframework.context.annotation.Configuration;
@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {

        //Parrot p = new Parrot();
        var p = new Parrot();
        p.setName("Koko");
        return p;

    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer tean() {
        return 10;
    }

}