package springstarthere.ch11_ex2.proxy;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import springstarthere.ch11_ex2.model.Payment;

@Component
public class PaymentsProxy {

    // instanace variable
    private final RestTemplate rest;

    // calling Payment Service at http://localhost:8080/payment
    @Value("${name.service.url}")
    private String paymentServiceURL;

    // constructor
    // inject the RestTemplate from Spring context using constructor DI
    public PaymentsProxy(RestTemplate rest) {
        this.rest = rest;
    }

    public Payment createPayment(Payment payment) {

        String uri = paymentServiceURL + "/payment";

        // set a random ID to the payment before returning it in HTTP response
        String requestID = UUID.randomUUID().toString();
        System.out.println("Random Request ID for CrestTemplate to send to PaymentService is  " + requestID);
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("requestID", requestID);

        HttpEntity<Payment> httpEntity = new HttpEntity<>(payment, headers);

        ResponseEntity<Payment> response = rest.exchange(uri, HttpMethod.POST, httpEntity, Payment.class);

        return response.getBody();


    }

}