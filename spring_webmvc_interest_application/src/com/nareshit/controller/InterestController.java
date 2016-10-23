package com.nareshit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.ProcessingException;
import com.nareshit.service.AccountService;

public class InterestController implements Controller {
	private AccountService service;

	public void setService(AccountService service) {
		this.service = service;
	}

	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) {
		ModelAndView modelView = null;
		String accountNo = req.getParameter("accountNo");
		try {
			float interest = service.calculateInterest(accountNo);
			System.out.println("The interest is="+interest);
			modelView = new ModelAndView("interestdetails", "intr", interest);

		} catch (AccountNotFoundException e) {
			modelView=new ModelAndView("noaccount");

		} catch (ProcessingException e) {
			modelView=new ModelAndView("problem");
		}

		return modelView;
	}

}
