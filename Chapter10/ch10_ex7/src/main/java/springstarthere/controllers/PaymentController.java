package springstarthere.controllers;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springstarthere.model.PaymentDetails;


@RestController
public class PaymentController {

    // instance variable
    private Logger logger;
    //private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    
    // constructor
    public PaymentController() {
        this.logger =  Logger.getLogger(PaymentController.class.getName());
    }


    @PostMapping(path = "/payment")
    public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails) {

        logger.info("Received payment  " + paymentDetails.getAmount());

        return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);

    }

}