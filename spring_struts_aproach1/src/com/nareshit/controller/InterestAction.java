package com.nareshit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.ProcessingException;
import com.nareshit.service.AccountService;
import com.nareshit.service.AccountServiceImpl;
import com.nareshit.view.AccountForm;

public class InterestAction extends Action{
	private AccountService service;
	
	ApplicationContext context;
	public InterestAction(){
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("pitambar mohanty");
		String responsepage="success";
		AccountForm accountForm=(AccountForm)form;
		String accountNo=accountForm.getAccountNo();
		try {
		    service=(AccountService)context.getBean("accountService");
			//service=new AccountServiceImpl();
		    
		    float interest=service.calculateInterest(accountNo);
		    request.setAttribute("interest", interest);
		    } catch (AccountNotFoundException e) {
		    	responsepage="noaccount";
			
		}
		catch (ProcessingException e) {
			responsepage="broblem";
		}
		
		return mapping.findForward(responsepage);
		
	}

	

	

}
