package springstarthere.ch14_ex1.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springstarthere.ch14_ex1.exceptions.AccountNotFoundException;
import springstarthere.ch14_ex1.model.Account;
import springstarthere.ch14_ex1.repositories.AccountRepository;

@Service
public class TransferService {

    // instnace variable
    private final AccountRepository accountRepository;

    // CONSTRUCTOR INJECTION
    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(Long idSender, Long idReveiver, BigDecimal amount) {
        

        // findById(ID id) method is provided  by the CrudRepository interface that AccountRepository entends
        Account sender = this.accountRepository.findById(idSender)
                                    .orElseThrow(() -> new AccountNotFoundException());

        Account receiver = this.accountRepository.findById(idReveiver)
                                    .orElseThrow(() -> new AccountNotFoundException());
        

        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);

        this.accountRepository.changeAmount(idSender, senderNewAmount);
        this.accountRepository.changeAmount(idReveiver, receiverNewAmount);


    }


    public Iterable<Account> getAllAccounts() {

        // findAll() method is provided  by the CrudRepository interface that AccountRepository entends
        return this.accountRepository.findAll();
    }


    public List<Account> findAccountsByName(String name) {

        return this.accountRepository.findAccountByName(name);

    }

}