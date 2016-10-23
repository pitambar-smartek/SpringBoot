package com.pita.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringStoreApplication {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context= new FileSystemXmlApplicationContext("beans.xml");
		JdbcTemplate template=(JdbcTemplate) context.getBean("jdbcTemplate");
		template.update("insert into pita values('Te123','Tar123','SER1478','Pitambar',sysdate)");
		System.out.println("One Record is executed successfully");

	}

}
