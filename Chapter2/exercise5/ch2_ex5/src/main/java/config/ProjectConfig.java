package config;

import springstarthere.Parrot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// @Configuration annotation to define this class as a Spring configuration class
// import org.springframework.context.annotation.Configuration;
@Configuration
public class ProjectConfig {

    @Bean(value = "bean1") // set the name of the Bean
    Parrot parrot1() {

        //Parrot p = new Parrot();
        var p = new Parrot();
        p.setName("Koko");
        return p;

    }

    @Bean(name = "name2")
    Parrot parrot2() {

        var p = new Parrot("Miki");

        /*
        var p = new Parrot();
        p.setName("Miki");
        */
        
        return p;

    }
    
    @Bean
    @Primary
    Parrot parrot3() {
       
        return new Parrot("Riki");

        /*
        var p = new Parrot();
        p.setName("Riki");
        return p;
        */

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