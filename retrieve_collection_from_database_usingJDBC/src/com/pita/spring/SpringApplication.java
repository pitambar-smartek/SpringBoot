package com.pita.spring;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template=(JdbcTemplate)context.getBean("jdbcTemplate");
		
	
		
		List listOne=(List)template.queryForList("select * from account where balance>?", new Object[]{6000});
		
		System.out.println(listOne);
		/*for(Account on:(Account)listOne)
		{
			on.display();
			
		}*/

	}

}
