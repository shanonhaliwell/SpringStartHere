package springstarthere;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Parrot {

    // instance variable
    private String name;
    
    // constructor
    public Parrot() {
        this("Polly");
    }

    public Parrot(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot name is  " + this.name;
    }

}
