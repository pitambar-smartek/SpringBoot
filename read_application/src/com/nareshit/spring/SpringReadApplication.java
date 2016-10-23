package com.nareshit.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringReadApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template=(JdbcTemplate) context.getBean("jdbcTemplate");
		Account acc=(Account) template.queryForObject("select * from account where accountNo='ACC102'", new BeanPropertyRowMapper(Account.class));
		acc.displayAccountDetail();

	}

}
