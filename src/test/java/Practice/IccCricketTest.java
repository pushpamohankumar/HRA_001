package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccCricketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> allCountrie = driver.findElements(By.xpath("//table/tbody/tr[*]/td[*]/span[@class='u-hide-phablet']"));
		List<WebElement> allmatches = driver.findElements(By.xpath("//table/tbody/tr[*]/td[3][@class='table-body__cell u-center-text' and text()<40]"));
		for(int i=0;i<allmatches.size();i++)
	    {
	    	System.out.println(allmatches.get(i).getText()+"-->"+allCountrie.get(i).getText());
	    }
		
		}

	}


