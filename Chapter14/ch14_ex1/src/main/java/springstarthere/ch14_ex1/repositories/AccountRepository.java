package springstarthere.ch14_ex1.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import springstarthere.ch14_ex1.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

    @Query("SELECT * FROM account WHERE name = :nameToQuery")
    List<Account> findAccountByName(String nameToQuery);

    @Modifying
    @Query("UPDATE account SET amount = :amountToQuery WHERE ID = :idToQuey")
    void changeAmount(long idToQuey, BigDecimal amountToQuery);


}