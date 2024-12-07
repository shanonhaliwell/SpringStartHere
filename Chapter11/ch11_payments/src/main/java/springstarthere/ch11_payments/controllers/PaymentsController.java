package springstarthere.ch11_payments.controllers;

import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpHeaders;

import springstarthere.ch11_payments.model.Payment;

@RestController
public class PaymentsController {


    private static Logger logger = Logger.getLogger(PaymentsController.class.getName());


    @PostMapping(path = "/payment")
    public ResponseEntity<Payment> createPayment(@RequestHeader String requestID, @RequestBody Payment payment) {

        logger.info("Received Request with ID  " + requestID + " , Payment amount is  " + payment.getAmount());

        
        // set a random ID to the payment before returning it in HTTP response
        String paymentID = UUID.randomUUID().toString();
        System.out.println("Random Payment ID is  " + paymentID);
        payment.setID(paymentID);  // import java.util.UUID;

        /*
        // the controller action returns the HTTP response which has a header and the response body
        // that contains the payment with the random ID value set
        return ResponseEntity
                    .status(HttpStatus.OK)
                    .header("requestID", requestID)
                    .body(payment);
        */

        // Create headers and add the requestID
        HttpHeaders headers = new HttpHeaders();  // import org.springframework.http.HttpHeaders;
        headers.add("requestID", requestID);

        // Log headers for debugging
        logger.info("Response Headers: " + headers.toString());

        // Return ResponseEntity with headers and body
        return new ResponseEntity<>(payment, headers, HttpStatus.OK);

        // curl -i -X POST -H "Content-Type: application/json" -H "requestID: 2223" -d '{"amount":123}' http://localhost:8080/payment
        // Cannot bind parameter 'Headers'. Cannot convert the "Content-Type: application/json" value of type
        // "System.String" to type "System.Collections.IDictionary"

        // curl -X POST -H 'content-type:application/json' -d '{"amount":1000}' http://localhost:9090/payment
         
    }
}