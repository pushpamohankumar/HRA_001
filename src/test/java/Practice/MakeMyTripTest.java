package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripTest {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		String Month="october";
		int date=9;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Actions a=new Actions(driver);
		a.doubleClick().perform();
		Thread.sleep(3000);
		a.moveByOffset(0, 80).click().perform();
		Thread.sleep(3000);
		/*driver.navigate().refresh();
		Thread.sleep(3000)*/
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='"+Month+" 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
		
	}

}
