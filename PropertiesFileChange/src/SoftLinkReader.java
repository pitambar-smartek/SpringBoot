
import java.io.IOException;
import java.util.Properties;


public class SoftLinkReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
		 
			
			
		Properties p=new Properties();
		p.load(SoftLinkReader.class.getClassLoader().getResourceAsStream("pita"));
		System.out.println(p.getProperty("CONTACT_TEL_NO"));
		}catch(IOException e)
		{
			e.printStackTrace();
			
		}
		

	}

}
