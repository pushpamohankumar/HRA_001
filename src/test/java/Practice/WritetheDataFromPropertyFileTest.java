package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Date;
import java.util.Properties;

import javax.tools.FileObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WritetheDataFromPropertyFileTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		
		p.setProperty("browser","chrome");
		p.setProperty("url", "http://rmgtestingserver/domain/House_Rental_Application/auth/login.php");
		p.setProperty("username", "admin");
		p.setProperty("password", "admin");
		
		
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Commondata.properties");
		p.store(fos, "write data");
		fos.close();
	
	
	
	}

	
}
