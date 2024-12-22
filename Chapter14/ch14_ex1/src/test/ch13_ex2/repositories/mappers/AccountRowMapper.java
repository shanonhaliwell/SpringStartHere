package springstarthere.ch13_ex2.repositories.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springstarthere.ch13_ex2.model.Account;

public class AccountRowMapper implements RowMapper<Account> {

    @Override
    public Account mapRow (ResultSet resultSet, int rowNum) throws SQLException {

        Account account = new Account();

        account.setID(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setAmount((resultSet.getBigDecimal("amount")));

        return account;

    }

}