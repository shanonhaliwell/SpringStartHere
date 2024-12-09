package springstarthere.ch12_ex2.model;

import java.time.LocalDateTime;

import java.math.BigDecimal;
import java.util.Objects;

public class Purchase {

    // instance variable
    private int ID;
    private String product;
    private BigDecimal price;

    @Override
    public boolean equals(Object toCompare) {

        if (this == toCompare) {
            return true;
        }

        // to ensure that the object you're comparing with (toCompare) is of the same type and is not null
        if ( (toCompare == null) || (getClass() != toCompare.getClass()) ) {
            return false;
        }

        Purchase purchaseToCompared = (Purchase) toCompare;

        return (this.ID == purchaseToCompared.getID()) && (Objects.equals(this.product, purchaseToCompared.getProduct()))
                        && (Objects.equals(this.price, purchaseToCompared.getPrice()));


    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, product, price);
    }

    // setter method
    public void setID(int ID) { this.ID = ID; }
    public void setProduct(String product) { this.product = product; }
    public void setPrice(BigDecimal price) { this.price = price; }

    // getter method
    public int getID() { return this.ID; }
    public String getProduct() { return this.product; }
    public BigDecimal getPrice() { return this.price; }

}