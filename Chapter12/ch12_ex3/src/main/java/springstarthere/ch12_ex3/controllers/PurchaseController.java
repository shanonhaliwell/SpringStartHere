package springstarthere.ch12_ex3.controllers;

import java.util.List;

//import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springstarthere.ch12_ex3.model.Purchase;
import springstarthere.ch12_ex3.repositories.PurchaseRepository;

@RestController
@RequestMapping(path = "/purchase")
public class PurchaseController {

    // instance variable
    private final PurchaseRepository purchaseRepository;

    // constructor
    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase) {
        this.purchaseRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchases() {
        return this.purchaseRepository.findAllPurchases();
    }
}