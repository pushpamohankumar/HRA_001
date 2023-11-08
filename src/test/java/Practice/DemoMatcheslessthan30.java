package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMatcheslessthan30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//List<WebElement> matches = driver.findElements(By.xpath("(//div[@class='rankings-block__container full rankings-table']/table/tbody/tr/td[3] )[@class='table-body__cell u-center-text' and text()>30]/preceding-sibling::td[@class='table-body__cell rankings-table__team']"));
		
		//List<WebElement> matches = driver.findElements(By.xpath("(//div[@class='rankings-block__container full rankings-table']/table/tbody/tr/td[3] )[@class='table-body__cell u-center-text' and text()>30]/preceding-sibling::td[@class='table-body__cell rankings-table__team']"));
		List<WebElement> matches = driver.findElements(By.xpath("//div[@class='rankings-block__container full rankings-table']/table/tbody/tr/td[4][@class='table-body__cell u-center-text' and text()<3000 ]/preceding-sibling::td[@class='table-body__cell rankings-table__team']"));
		System.out.println(matches.size());
		for(int i=0;i<matches.size();i++)
		{
			String result = matches.get(i).getText();
			System.out.println(result);
			
		}
		driver.close();
		
	
	}

}
