package springstarthere.model;

/** Object to model the data transferred between two apps
 * This object is named a Data Transfer Object (DTO)
 * Country is DTO, whose instance are returned by the REST endpoint
 * when we implement in the HTTP response body
 */

public class Country {

    // instance variables
    private String name;
    private int population;

    // static Factory method pattern
    // With a static method, you can call Country.of("Vietnam", 98000000) 
    // directly without having to instantiate an object first
    // method returns a Country instance with the provided values set
    public static Country of (String name, int population) {

        Country country = new Country();
        
        country.setName(name);
        country.setPopulation(population);

        return country;
    }

    // setter method
    public void setName(String name) { this.name = name; }
    public void setPopulation(int population) { this.population = population; }

    // getter method
    public String getName() { return this.name; }
    public int getPopulation() { return this.population; }

}

/* RECORD
public record Country(String name, int population) {
    
    // static Factory method pattern
    public static Country of (String name, int population) {
        
        return new Country (name, population);
    }
}
*/