package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusPopupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//div[@class='a-section']//span[@class='a-price-whole'][number(translate(text(),'₹,',''))<60000]"));
		
		/*driver.findElement(By.xpath("//h4[.='Test Team Rankings']/../../following-sibling::table//tbody/tr[3]/td[3]")).click();
	*/
	}
	//div[@class='a-section']//span[@class='a-price-whole'][number(translate(text(),'₹,',''))<60000]
}
