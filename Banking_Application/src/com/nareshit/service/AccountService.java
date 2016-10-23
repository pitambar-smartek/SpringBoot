package com.nareshit.service;

import com.nareshit.dto.Account;
import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.InsufficientFundException;
import com.nareshit.exception.ProcessingException;

public interface AccountService {
	void openAccount(Account account)throws ProcessingException;
	void closeAccount(String accountNo)throws ProcessingException,AccountNotFoundException;
	void deposit(String AccountNo,double amount)throws ProcessingException,AccountNotFoundException;
	void withDraw(String accountNo,double ammount)throws ProcessingException,AccountNotFoundException,InsufficientFundException;
	double getBalance(String accountNo)throws AccountNotFoundException,ProcessingException;

}
