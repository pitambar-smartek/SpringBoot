package com.nareshit.dao;

import com.nareshit.dto.Account;
import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.DataBaseException;

public interface AccountDAO {
	void createAccount(Account account)throws DataBaseException;
	/*void deleteAccount(String accountNo) throws DataBaseException,AccountNotFoundException;*/
	void updateAccount(Account account) throws DataBaseException,AccountNotFoundException;
	Account findAccount(String accno)throws DataBaseException,AccountNotFoundException;

}
