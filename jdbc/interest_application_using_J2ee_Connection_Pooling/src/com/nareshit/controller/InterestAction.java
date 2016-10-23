package com.nareshit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.ProcessingException;
import com.nareshit.service.AccountService;

public class InterestAction {
	AccountService accountService;

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	public void execute(HttpServletRequest request,HttpServletResponse response)throws AccountNotFoundException,ProcessingException
	{
		float interest=accountService.calculateInterest(request.getParameter("accnountNo").trim());
		request.setAttribute("interest", interest);
		
	}
	

}
