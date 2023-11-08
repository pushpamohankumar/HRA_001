package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataCmdTest {
@Test
public void cmdTest() {
	String Browser = System.getProperty("Browser");
	String Url = System.getProperty("url");
	String Username = System.getProperty("username");
	String password = System.getProperty("password");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("exampleInputEmail1")).sendKeys(Username);	
	driver.findElement(By.id("exampleInputPassword1")).sendKeys(password);
	driver.findElement(By.xpath("//button[.='Submit']")).click();
	System.out.println(Browser);
	System.out.println(Url);
	System.out.println(Username);
	System.out.println(password);
	
	
}
}
