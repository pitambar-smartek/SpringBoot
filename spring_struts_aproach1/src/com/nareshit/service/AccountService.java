package com.nareshit.service;

import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.ProcessingException;

public interface AccountService {
	public float calculateInterest(String accountNo)throws AccountNotFoundException,ProcessingException;

}
