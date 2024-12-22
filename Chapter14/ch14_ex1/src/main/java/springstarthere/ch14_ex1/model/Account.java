package springstarthere.ch14_ex1.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Account {

    // instance variable
    @Id
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