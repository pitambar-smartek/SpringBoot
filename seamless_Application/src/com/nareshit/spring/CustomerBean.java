package com.nareshit.spring;

public class CustomerBean {
	private Menu menu;

	

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public void expectFoodService()
	{
		System.out.println("Customer is hungray");
		menu.provideFoodservice();
	}
	

}
