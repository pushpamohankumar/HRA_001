package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJet {
@Test
public void spiceJet() throws Throwable{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/descendant::input")).sendKeys("BLR");
	driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/descendant::input")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/descendant::input")).sendKeys("DELHI");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='January ' and text()='2024']/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/descendant::div[text()='1']")).click();
	driver.findElement(By.xpath("//div[text()='Passengers']")).click();
	driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	driver.findElement(By.xpath("//div[text()='Passengers']")).click();
	driver.findElement(By.xpath("//div[.='Students']")).click();
	driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/descendant::div[@class='css-1dbjc4n r-zso239']/*[name()='svg']")).click();
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
}



@Test
public void spicejet() {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.spicejet.com/");
    driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2' and .='From']")).click();
    driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[.='Kempegowda International Airport']")).click();
    driver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar' and .='MAA']")).click();
    driver.findElement(By.xpath("//*[@transform='translate(1 1)']")).click();
    driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79' and .='January 2024']/ancestor::div[@data-testid='undefined-month-January-2024']//div[@data-testid='undefined-calendar-day-11']")).click();
    driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
    for (int i = 1; i < 2; i++) {
         driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
    }
    driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
    driver.findElement(By.xpath("//div[.='Students']//*[@data-testid='svg-img']")).click();
    driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1i10wst r-1kfrs79' and .='Search Flight']/parent::div")).click();
   

}
@Test
public void str() {
	String s="I am from Bangalore";
	String[] st = s.split(" ");
	for(int i=0;i<s.length();i++)
	{
		String str=st[i];
		for(int h=str.length()-1;h>=0;h--);
		{
			//System.out.print(str.charAt()+" ");
		}
		System.out.println(" ");
	}
}
}
