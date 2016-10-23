package com.nareshit.spring;

import java.util.Enumeration;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeanApplication {
	public static void main(String args[]) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"beans.xml");
		HelloBean helloBean = (HelloBean) context.getBean("helloBean");
		Properties p = helloBean.getProperties();
		Enumeration<Object> keys= p.keys();
		while(keys.hasMoreElements())
		{
			 String key=(String) keys.nextElement();
			System.out.println("The key is::"+key+"  The Value::"+p.getProperty(key));

		}
		
	}

}
