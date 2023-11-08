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

public class BrokenLinksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.epfindia.gov.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		List<WebElement> listLinks= driver.findElements(By.xpath("//a"));
		System.out.println(listLinks.size());
		ArrayList<String> link=new ArrayList<String>();
		for(int i=0;i<listLinks.size();i++) {
			String eachLink = listLinks.get(i).getAttribute("href");
			URL url=null;
			int statuscode=0;
			try {
				url=new URL(eachLink);
				HttpURLConnection http=(HttpURLConnection) url.openConnection();
				statuscode=http.getResponseCode();
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
					
			
		}
		
		
	}

}*/
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		List<WebElement> listLinks= driver.findElements(By.xpath("//a"));
		System.out.println(listLinks.size());
		ArrayList<String> link=new ArrayList<String>();
		for(int i=0;i<listLinks.size();i++) {
			String eachLink = listLinks.get(i).getAttribute("href");
			URL url=null;
			int statuscode=0;
			try {
				url=new URL(eachLink);
				HttpURLConnection http=(HttpURLConnection) url.openConnection();
				statuscode=http.getResponseCode();
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
					
			
		}
		
		
	}

}
