package springstarthere.ch14_ex1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springstarthere.ch14_ex1.dto.TransferRequest;
import springstarthere.ch14_ex1.model.Account;
import springstarthere.ch14_ex1.services.TransferService;

@RestController
public class AccountController {

    // instance variables
    private final TransferService transferService;

    // Contructor
    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping(path = "/transfer")
    public void transferMoney(@RequestBody TransferRequest request) {
        
        this.transferService.transferMoney(request.getSenderAccountId(), request.getReceiverAccountId(), request.getAmount());
    }

    
    @GetMapping(path = "/accounts")
    public Iterable<Account> getAllAccounts(@RequestParam(required=false) String name) {

        System.out.println("Returning all accounts from Database");

        if(name == null) {

            System.out.println("Name: " + name + " is null");
            return this.transferService.getAllAccounts();
        } else {

            System.out.println("Returning all accounts with name  " + name + " from Database");
            return this.transferService.findAccountsByName(name);
        }

    }


}