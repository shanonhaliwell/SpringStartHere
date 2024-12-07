package springstarthere.ch11_ex3.model;

public class Payment {

    // instance variables
    private String ID;
    private double amount;

    // setter method
    public void setID(String ID) { this.ID = ID; }
    public void setAmount(double amount) { this.amount = amount; }

    // getter method
    public String getID() { return this.ID; }
    public double getAmount() { return this.amount; }
}