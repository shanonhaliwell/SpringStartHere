package springstarthere.ch11_ex3.proxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import springstarthere.ch11_ex3.model.Payment;

@Component
public class PaymentsProxy {

    // instanace variable
    private final WebClient webClient;

    // calling Payment Service at http://localhost:8080/payment
    @Value("${name.service.url}")
    private String paymentServiceURL;

    // constructor
    // inject the RestTemplate from Spring context using constructor DI
    public PaymentsProxy(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<Payment> createPayment(String requestID, Payment payment) {

        String uriPath = paymentServiceURL + "/payment";
        
        return webClient.post()
                    .uri(uriPath)
                    .header("requestID", requestID)
                    .body(Mono.just(payment), Payment.class) // provide the HTTP request body
                    .retrieve()  // send the HTTP request and obtain the HTTP reponse
                    .bodyToMono(Payment.class); // get the HTTP response body


    }

}