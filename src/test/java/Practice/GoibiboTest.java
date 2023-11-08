package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String month="September";
		int date=12;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		driver.findElement(By.xpath("//div[.='"+month+" 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']")).click();
		driver.findElement(By.xpath("//span[.='Done']")).click();*/
		
		String monthName="November";
		int date=1;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		String actual = "//div[.='"+monthName+" 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']";
		String nextArrow="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']";
		for(;;)
		{
			try {
				driver.findElement(By.xpath(actual)).click();
				break;
			}catch(Exception e)
			{
				driver.findElement(By.xpath(nextArrow)).click();
			}
		}
		driver.findElement(By.xpath("//span[.='Done']")).click();
		
	}

}
