package springstarthere.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import springstarthere.exceptions.NotEnoughMoneyException;
import springstarthere.model.ErrorDetails;
import springstarthere.model.PaymentDetails;
import springstarthere.service.PaymentService;

@RestController
public class PaymentController {

    // instance variable
    private final PaymentService paymentService;

    // constructor
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //@PostMapping(path = "/payment")  // @PostMapping is not correct annotation for this method as we want a returning response, not posting
    @GetMapping(path = "/payment")
    public ResponseEntity<?> makePayment() {

        try {
            PaymentDetails paymentDetails = this.paymentService.processPayment();

            return ResponseEntity
                        .status(HttpStatus.ACCEPTED)
                        .body(paymentDetails);

        } catch (NotEnoughMoneyException e) {

            ErrorDetails errorDetails = new ErrorDetails();

            errorDetails.setError("Not enough money to make the payment.");

            return ResponseEntity
                        .badRequest()
                        .body(errorDetails);

        }

    }

}