package Practice1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cube {
@Test
public void switchwindow() {
	WebDriver driver=new ChromeDriver();
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	
//	Dimension d=new Dimension(800, 600);
//	System.out.println(d);
//	driver.get("https://www.flipkart.com");
//	
//	driver.switchTo().newWindow(WindowType.TAB);
//	driver.get("https://www.amazon.in");
//	
//	driver.switchTo().newWindow(WindowType.TAB);
//	driver.get("https://chat.openai.com/");
//	
	driver.close();
	}
}
