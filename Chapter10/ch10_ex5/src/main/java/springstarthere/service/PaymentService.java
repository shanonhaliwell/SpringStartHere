package springstarthere.service;

import org.springframework.stereotype.Service;

import springstarthere.exceptions.NotEnoughMoneyException;
import springstarthere.model.PaymentDetails;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {

        System.out.println("Processing payment details ....");
        throw new NotEnoughMoneyException();
    }
    
}