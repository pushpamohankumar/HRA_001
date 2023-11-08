package Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		List<WebElement> Teams = driver.findElements(By.xpath("//table/tbody/tr[*]/td[1]"));
		for (WebElement webElement : Teams) {
			String TeamName=webElement.getText();
			if(TeamName.equalsIgnoreCase("Scotland"))
			System.out.println("ScotLand is Present");
			else
				System.out.println("not present");
			
		}
		
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		ArrayList<String> link=new ArrayList<String>();
		for(int i=0;i<allLinks.size();i++) {
			String eachLink = allLinks.get(i).getAttribute("href");
			URL url=null;
			int statuscode=0;
		try {
		
		url = new URL(eachLink);
		HttpURLConnection httpurl=(HttpURLConnection) url.openConnection();
		statuscode = httpurl.getResponseCode();
		if(statuscode>=400)
		{
			link.add(eachLink);
			System.out.println(eachLink+" "+statuscode);
		}
		}
		catch(Exception e)
		{
			System.out.println(eachLink+" "+statuscode);
		}
		}*/
		
		
		}
	}

