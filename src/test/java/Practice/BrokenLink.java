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

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 ArrayList<String> al=new ArrayList<String>();
		 for(int i=0;i<links.size();i++)
		 {
			String eachlink = links.get(i).getAttribute("href");
			URL url=null;
			int statuscode=0;
			try {
				url=new URL(eachlink);
				HttpURLConnection http=(HttpURLConnection) url.openConnection();
				statuscode=http.getResponseCode();
				if(statuscode>400)
				{
					al.add(eachlink);
					System.out.println(eachlink+ " "+statuscode);
				}
			}
			catch(Exception e)
			{
				System.out.println(eachlink+" "+statuscode);
			}
		 }
	}

}
