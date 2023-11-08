package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
		String Browser = p.getProperty("Browser");
		String Url = p.getProperty("url");
		String Username = p.getProperty("username");
		String Password = p.getProperty("password");
		
		System.out.println(Browser);
		System.out.println(Url);
		System.out.println(Username);
		System.out.println(Password);
		
	

	}

}
