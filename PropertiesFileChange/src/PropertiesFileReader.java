
import java.io.FileWriter;
import java.util.Properties;


public class PropertiesFileReader {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		Properties prop=new Properties();
		prop.load(PropertiesFileReader.class.getClassLoader().getResourceAsStream("mylog.properties"));
		System.out.println(prop.getProperty("Name")+"name ");
		System.out.println(prop.getProperty("Ein"));
		System.out.println(prop.getProperty("Component"));
		System.out.println("Reading completed in properties file");
		
		System.out.println(prop.getProperty("name"));
		
		
	   System.out.println("set property file with new value");
		prop.setProperty("Name", "Samaya Ranjan mohanty");
		prop.setProperty("Ein", "36014587");
		prop.setProperty("Component", "TADDS&AFM");
		
		
		
		prop.store(new FileWriter("D:/MOHANTY/PropertiesFileChange/src/mylog.properties"), "DB Config file");
		
		//FileOutputStream out=new FileOutputStream();
		System.out.println("file is written successfully");
		
		prop.clear();
		Properties p=new Properties();
		p.load(PropertiesFileReader.class.getClassLoader().getResourceAsStream("mylog.properties"));
		System.out.println("Reading file with changes value");
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("Ein"));
		System.out.println(p.getProperty("Component"));
		
		
		

	}

}
