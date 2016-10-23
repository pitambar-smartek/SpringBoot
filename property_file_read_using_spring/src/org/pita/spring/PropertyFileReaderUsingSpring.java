package org.pita.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PropertyFileReaderUsingSpring {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		Address address=(Address)context.getBean("address");
		address.displayAddressDetails();

	}

}
