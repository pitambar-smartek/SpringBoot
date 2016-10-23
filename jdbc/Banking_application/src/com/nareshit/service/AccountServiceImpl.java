package com.nareshit.service;

import javax.xml.transform.Templates;

import com.nareshit.dao.AccountDAO;
import com.nareshit.dto.Account;
import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.DataBaseException;
import com.nareshit.exception.InsufficientFundException;
import com.nareshit.exception.ProcessingException;

public class AccountServiceImpl implements AccountService {
	AccountDAO accountDAO;

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public void closeAccount(String accountNo) throws ProcessingException,
			AccountNotFoundException {
		try {
			accountDAO.deleteAccount(accountNo);
		} catch (DataBaseException e) {
			throw new ProcessingException();
		}

	}

	public void deposit(String AccountNo, double amount)
			throws ProcessingException, AccountNotFoundException {
		try {
			Account account = accountDAO.findAccount(AccountNo);
			double balance = account.getBalance() + amount;
			account.setBalance(balance);
			accountDAO.updateAccount(account);

		} catch (DataBaseException e) {
			throw new ProcessingException();
		}

	}

	public void withDraw(String accountNo, double ammount)
			throws ProcessingException, AccountNotFoundException,
			InsufficientFundException {
		try {
			Account account = accountDAO.findAccount(accountNo);
			if (account.getBalance() < ammount) {
				throw new InsufficientFundException();

			}
			account.setBalance(account.getBalance() - ammount);
			accountDAO.updateAccount(account);

		} catch (DataBaseException e) {
			throw new ProcessingException();

		}

	}

	public double getBalance(String accountNo) throws AccountNotFoundException,
			ProcessingException {
		Account account = null;
		try {
			account = accountDAO.findAccount(accountNo);
		} catch (DataBaseException e) {
			throw new ProcessingException();
		}

		return account.getBalance();
	}

	public void openAccount(Account account) throws ProcessingException {
		try {
			accountDAO.createAccount(account);
		} catch (DataBaseException e) {

			throw new ProcessingException();
		}

	}

}
