package com.pitambar.controller;

import com.pitambar.service.AccountService;

public class AccountController {
	private AccountService accountService;

	public AccountController() {
		// TODO Auto-generated constructor stub
		System.out.println("AccontController Bean is instantiated");
	}

	public void setAccountService(AccountService accountService) {
		System.out
				.println("AccountService Bean is injected into AccountController Bean");

		this.accountService = accountService;
	}

	public void init() {
		System.out.println("AccountController Bean is initialized");
	}

	public void destroy() {
		System.out.println("Accountcontroller Bean about to destroy");
	}

}
