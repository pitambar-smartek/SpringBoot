package com.pitambar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pitambar.primarybean.FundTransferBean;

public class AroundAdviceApplication {
	public static void main(String args[]){
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	FundTransferBean coreBean=(FundTransferBean) context.getBean("coreBean");
	System.out.println("Txn status="+coreBean.transferFunds(101, 102, 200));
	
	}
	
	
	

}
