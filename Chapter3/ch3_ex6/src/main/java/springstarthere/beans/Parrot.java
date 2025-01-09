package springstarthere.beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    // instance variables
    private String name;

    // constructor
    public Parrot() { this("PetKoko"); }

    public Parrot(String name) { this.name = name; }

    // getter methods
    public String getName() { return this.name; }

    // setter method
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() { return "Parrot:  " + this.name; }
    
}
