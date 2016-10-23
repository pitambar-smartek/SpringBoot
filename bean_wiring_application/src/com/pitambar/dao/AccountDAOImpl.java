package com.pitambar.dao;

public class AccountDAOImpl implements AccountDAO {
	AccountDAO accountDAO;

	public AccountDAOImpl() {
		System.out.println("Account DAO Bean is instantiated");
	}

	public void init() {
		System.out.println("Account DAO Bean  is initialized");
	}

	/*
	 * public void setAccountDAO(AccountDAO accountDAO) {
	 * System.out.println("AccountDAO is injected into Dependent Bean");
	 * this.accountDAO = accountDAO; }
	 */
	public void destroy() {
		System.out.println("DAO Bean about to destroy");
	}

}
