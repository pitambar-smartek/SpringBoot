package com.pitambar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pitambar.corebean.CoreConcernBean;
import com.pitambar.exception.OverValueException;
import com.pitambar.exception.UnderValueException;

public class AfteThrowingAdviceApplication {

	public static void main(String[] args) throws OverValueException, UnderValueException {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		CoreConcernBean bean=(CoreConcernBean) context.getBean("coreBean");
		System.out.println(bean.add(45, 42));

	}

}
