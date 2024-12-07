package springstarthere.ch11_ex1.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import springstarthere.ch11_ex1.model.Payment;

@FeignClient(name = "someName", url = "${name.service.url}")  // application.properties, name.service.url=http://localhost:8080 
public interface PaymentsProxy {

    // calling Payment Service at http://localhost:8080/payment
    @PostMapping(path = "/payment")
    Payment createPayment(@RequestHeader String requestID, @RequestBody Payment payment);
    // defind the request headers and body
    
}