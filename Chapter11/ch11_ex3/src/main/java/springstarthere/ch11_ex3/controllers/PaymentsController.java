package springstarthere.ch11_ex3.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import springstarthere.ch11_ex3.model.Payment;
import springstarthere.ch11_ex3.proxy.PaymentsProxy;

@RestController
public class PaymentsController {

    // instance variable
    private final PaymentsProxy paymentsProxy;

    // constructor
    public PaymentsController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping(path = "/payments")
    public Mono<Payment> createPayment (@RequestBody Payment payment) {

        // set a random ID to the payment before returning it in HTTP response
        String requestID = UUID.randomUUID().toString();
        System.out.println("Random Request ID for WebFlux WebClient to send to PaymentService is  " + requestID);

        return this.paymentsProxy.createPayment(requestID, payment);

    }

}