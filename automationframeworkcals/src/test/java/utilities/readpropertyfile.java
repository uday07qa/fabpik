package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class readpropertyfile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileReader filenameremo = new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\automationframeworkcals\\src\\test\\resources\\configfiles\\config.propertires");
                       Properties p = new Properties();
                       p.load(filenameremo);
                       System.out.println(p.getProperty("browser"));
                       System.out.println(p.getProperty("testurl"));
                       
	}

}
