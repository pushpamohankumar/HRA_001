package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetTest {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		String source = "Hyderabad";
		String destination = "Bengaluru";
		String dMonthAndYear="September-2023";
		int dDate=10;
		String rMonthAndYear="October-2023";
		int rDate=20;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='From']")).click();

		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']/descendant::div[text()='"+source+"']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']/descendant::div[text()='"+destination+"']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+dMonthAndYear+"']/descendant::div[text()='"+dDate+"']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+rMonthAndYear+"']/descendant::div[text()='"+rDate+"']")).click();
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		driver.findElement(By.xpath("//div[text()='USD']")).click();
	}

}
