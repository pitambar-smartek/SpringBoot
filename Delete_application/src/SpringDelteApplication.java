import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class SpringDelteApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template=(JdbcTemplate) context.getBean("jdbcTemplate");
		int i=template.update("delete from pita where name='Pitambar'");
		System.out.println("The no. of record is deleted="+i);
		
		

	}

}
