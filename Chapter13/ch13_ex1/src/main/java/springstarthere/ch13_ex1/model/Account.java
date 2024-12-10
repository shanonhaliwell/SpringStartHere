package springstarthere.ch13_ex1.model;

import java.math.BigDecimal;

public class Account {

    // instance variable
    private long ID;
    private String name;
    private BigDecimal amount;

    // setter methods
    public void setID(long ID) { this.ID = ID; }
    public void setName(String name) { this.name = name; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    // getter method
    public long getID() { return this.ID; }
    public String getName() { return this.name; }
    public BigDecimal getAmount() { return this.amount; }

}