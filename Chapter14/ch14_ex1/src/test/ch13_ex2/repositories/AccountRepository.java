package springstarthere.ch13_ex2.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import springstarthere.ch13_ex2.model.Account;
import springstarthere.ch13_ex2.repositories.mappers.AccountRowMapper;

@Repository
public class AccountRepository {

    private final JdbcTemplate jdbc;

    // constructor dependency injection
    public AccountRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public Account findAccountByID (long id) {
        
        // Query to find account and all information based on ID
        String sql = "SELECT * FROM account WHERE id = ?";

        return this.jdbc.queryForObject(sql, new AccountRowMapper(), id);

    }

    public List<Account> findAllAccounts() {

        String sql = "SELECT * FROM account";

        return this.jdbc.query(sql, new AccountRowMapper());

    }

    public void changeAmount (long id, BigDecimal amount) {

        String sql = "UPDATE account SET amount = ? WHERE id = ?";

        this.jdbc.update(sql, amount, id);

    }


}