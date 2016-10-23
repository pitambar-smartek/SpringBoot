package com.nareshit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.ProcessingException;

public class FontController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ClassPathXmlApplicationContext context;
	InterestAction action;

	public void init() {
		System.out.println("initailaized");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("contxt Object" + context);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Request reach to post method");
		

		process(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		process(req, resp);
	}

	public void process(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Request reach to process methods");
		String responsePage = "interesttDetails.jsp";
		
		action = (InterestAction) context.getBean("accountController");
		try {
			System.out.println("Request reachable");
			action.execute(req, resp);
		} catch (AccountNotFoundException e) {
			responsePage = "noAccount.jsp";
		} catch (ProcessingException e) {
			responsePage = "problem.jsp";

		}
		req.getRequestDispatcher(responsePage).forward(req, resp);

	}

}
