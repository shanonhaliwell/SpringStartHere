package springstarthere.ch13_ex2.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springstarthere.ch13_ex2.model.Account;
import springstarthere.ch13_ex2.repositories.AccountRepository;

@Service
public class TransferService {

    // instance variable
    private final AccountRepository accountRepository;

    // constructor dependency injection
    public TransferService (AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney (long idSender, long idReceiver, BigDecimal transferedAmount) {

        Account sender = accountRepository.findAccountByID(idSender);
        Account receiver = accountRepository.findAccountByID(idReceiver);

        BigDecimal senderNewAmount = sender.getAmount().subtract(transferedAmount);
        BigDecimal receiverNewAmount = receiver.getAmount().add(transferedAmount);

        this.accountRepository.changeAmount(idSender, senderNewAmount);
        this.accountRepository.changeAmount(idReceiver, receiverNewAmount);

        
        // Triggering throwback
        throw new RuntimeException("Oh no! Something went wrong!");
        
        
        System.out.println("Transfer Amount " + transferedAmount + " from Sender Account ID " + sender.getID() + " of " + sender.getName() + 
                                    " to Receiver Account ID " + receiver.getID() + " of " + receiver.getName() + " completed.");

    }


    public List<Account> getAllAccounts() {

        System.out.println("Returning all Accounts");
        return this.accountRepository.findAllAccounts();
    }
    

}