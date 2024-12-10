package springstarthere.ch13_ex1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springstarthere.ch13_ex1.dto.TransferRequest;
import springstarthere.ch13_ex1.model.Account;
import springstarthere.ch13_ex1.services.TransferService;

@RestController
public class AccountController {

    private final TransferService transferService;

    // constructor
    public AccountController (TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping(path = "/transfer")
    public void transferMoney (@RequestBody TransferRequest request) {

        this.transferService.transferMoney(request.getSenderAccountId(), request.getReceiverAccountId(), request.getAmount());

    }

    @GetMapping(path = "/accounts")
    public List<Account> getAllaAccounts() {
        return this.transferService.getAllAccounts();
    }


}