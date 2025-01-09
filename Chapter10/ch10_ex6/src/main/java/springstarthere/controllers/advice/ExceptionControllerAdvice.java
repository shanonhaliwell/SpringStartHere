package springstarthere.controllers.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import springstarthere.exceptions.NotEnoughMoneyException;
import springstarthere.model.ErrorDetails;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {

        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setError("Not enough money to make payment.");
        
        return ResponseEntity
                    .badRequest()
                    .body(errorDetails);

    }

}