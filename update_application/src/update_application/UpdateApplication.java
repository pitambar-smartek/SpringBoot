package update_application;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate templet=(JdbcTemplate) context.getBean("jdbcTemplate");
		int i=templet.update("update pita set testid='TEST123456' where name='Pitambar'");
		System.out.println("The no of record is executed="+i);

	}

}
