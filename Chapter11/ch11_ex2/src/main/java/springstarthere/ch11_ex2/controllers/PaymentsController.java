package springstarthere.ch11_ex2.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springstarthere.ch11_ex2.model.Payment;
import springstarthere.ch11_ex2.proxy.PaymentsProxy;

@RestController
public class PaymentsController {

    // instance variable
    private final PaymentsProxy paymentsProxy;

    // constructor
    public PaymentsController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping(path = "/payments")
    public Payment createPayment (@RequestBody Payment payment) {

        return this.paymentsProxy.createPayment(payment);

    }

}