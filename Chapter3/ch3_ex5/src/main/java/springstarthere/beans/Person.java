package springstarthere.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    // instance variable
    private String name;

    private final Parrot parrot;

    // constructor
    public Person() { 
        this.name = "Fred"; 
    }

    public Person(String name) { 
        this.name = name; 
    }


    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
        this.name = "Boss";
    }


    public Person(String name, Parrot parrot) {
        this.name = name;
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return parrot;
    }

    /*
    // final variable cannot be set via setter method
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    } 
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
