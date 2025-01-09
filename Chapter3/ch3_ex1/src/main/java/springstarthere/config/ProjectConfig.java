package springstarthere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springstarthere.beans.Parrot;
import springstarthere.beans.Person;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Pet");
        return p;
    }

    @Bean
    Person person() {
        var p = new Person();
        p.setName("Boss");
        return p;
    }
    
}