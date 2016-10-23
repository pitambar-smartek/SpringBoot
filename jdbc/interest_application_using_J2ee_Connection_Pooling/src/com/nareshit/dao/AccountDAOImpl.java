package com.nareshit.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nareshit.dto.Account;
import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.DataBaseException;

public class AccountDAOImpl implements AccountDAO {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		
	}

	public void deleteAccount(String accountNo) throws DataBaseException,
			AccountNotFoundException {
		try {
			int i = template.update("delete from account where accountNO=?",new Object[]{accountNo});
		
			if (i == 0) {
				throw new AccountNotFoundException();
			}
		} catch (DataAccessException e) {

		}

	}

	public void updateAccount(Account account) throws DataBaseException,
			AccountNotFoundException {
		try{
			template.update("update account set name=?,balance=? where accountno=?",new Object[]{account.getName(),account.getBalance(),account.getAccountNo()});
			
		}catch(DataAccessException e)
		{
			
		}

	}

	public Account findAccount(String accno) throws DataBaseException,
			AccountNotFoundException {
		Account acc;
		try {
			acc = (Account) template.queryForObject(
					"select * from account where accountno=?",
					new Object[] { accno }, new BeanPropertyRowMapper(
							com.nareshit.dto.Account.class));
		} catch (EmptyResultDataAccessException e) {
			throw new AccountNotFoundException();
		} catch (DataAccessException e) {
			throw new DataBaseException();
		}

		return acc;
	}

	
	public void createAccount(Account account) throws DataBaseException {
		try {
			template.update("insert into account values(?,?,?)",
					new Object[] { account.getName(), account.getBalance(),
							account.getAccountNo() });

		} catch (DataAccessException e) {
			throw new DataBaseException();

		}

	}

}
