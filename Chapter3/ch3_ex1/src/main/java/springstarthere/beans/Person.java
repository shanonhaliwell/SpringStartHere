package springstarthere.beans;

public class Person {

    // instance variable
    private String name;
    private Parrot parrot;

    // constructor
    public Person() { this.name = "Fred"; }

    public Person(String name) { this.name = name; }

    public Person(String name, Parrot parrot) {
        this.name = name;
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
