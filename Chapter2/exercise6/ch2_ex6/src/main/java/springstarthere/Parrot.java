package springstarthere;

import org.springframework.stereotype.Component;

@Component("parrotBean")
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
