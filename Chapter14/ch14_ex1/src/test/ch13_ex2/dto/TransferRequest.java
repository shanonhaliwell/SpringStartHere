package springstarthere.ch13_ex2.dto;

import java.math.BigDecimal;

public class TransferRequest {

    // instance variables
    private long senderAccountID;
    private long receiverAccountID;
    private BigDecimal amount;

    // setter method
    public void setSenderAccountID(long senderAccountID) { this.senderAccountID = senderAccountID; }
    public void setReceiverAccountID(long receiverAccountID) { this.receiverAccountID = receiverAccountID; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    // getter method
    public long getSenderAccountId() { return this.senderAccountID; }
    public long getReceiverAccountId() { return this.receiverAccountID; }
    public BigDecimal getAmount() { return this.amount; }

}