package com.pitambar.service;

import com.pitambar.dao.AccountDAO;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;

	public AccountServiceImpl() {
		System.out.println("AccountService bean is intstantiated");
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		System.out
				.println("AccountDAO bean is injected into AccountService Bean");
		this.accountDAO = accountDAO;
	}

	public void init() {
		System.out.println("AccountService bean is initialized");
	}

	public void destroy() {
		System.out.println("AccountService bean is about to destroy");
	}

}
