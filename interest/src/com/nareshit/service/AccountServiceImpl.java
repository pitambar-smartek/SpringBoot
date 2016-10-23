package com.nareshit.service;

import com.nareshit.dao.AccountDAO;
import com.nareshit.dto.Account;
import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.DataBaseException;
import com.nareshit.exception.ProcessingException;

public class AccountServiceImpl implements AccountService {
	AccountDAO accountDAO;
	

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}


	public float calculateInterest(String accountNo)
			throws AccountNotFoundException, ProcessingException {
		float interest=789.0f;
		/*try{
			//Account account=accountDAO.findAccount(accountNo);
			//interest=(float) (account.getBalance()*0.06f);
			
			
		}catch(DataBaseException e)
		{
			throw new ProcessingException();
		}*/

		return interest;
	}

}
