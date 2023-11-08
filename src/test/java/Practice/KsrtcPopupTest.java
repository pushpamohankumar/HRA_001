package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcPopupTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String Month="october";
		int year=2023;
		int date=10;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("txtJourneyDate")).click();
		
		//driver.findElement(By.xpath("//span[.='"+Month+"']/following-sibling::span[.='"+year+"']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='"+date+"']")).click();
		//driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/descendant::span[.='Next']"));
	
		String actual = "//span[.='"+Month+"']/following-sibling::span[.='"+year+"']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='"+date+"']";
		String arrow = "//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/descendant::span[.='Next']";
		for(;;) {
			try {
				driver.findElement(By.xpath(actual)).click();
				break;
			}
			catch(Exception e) {
				driver.findElement(By.xpath(arrow)).click();
			}
		}
	
	}
	
	
	}


