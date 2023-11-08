package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://www.amazon.in/");
		/*WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		element.sendKeys("Mobiles");
		element.submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='realme']")).click();
		driver.findElement(By.xpath("//input[@name='high-price']")).sendKeys("20000");
		driver.findElement(By.xpath("//span[@id='a-autoid-1']")).click();
		List<WebElement> mobiles = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(mobiles.size());
		for (int i = 0; i < mobiles.size(); i++) {
			System.out.println(mobiles.get(i).getText());
		}*/
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone 14 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']/span[@class='a-offscreen']"));
       List<WebElement> Pprices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<WebElement> names = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[@class='a-size-medium a-color-base a-text-normal']"));
//		for (WebElement name : names) {
//			System.out.println(name.getText());
//		}
		
		
		for (int i =0; i <names.size(); i++) {
			
			System.out.println(names.get(i).getText()+"--->"+Pprices.get(i).getText());
		}
}}
