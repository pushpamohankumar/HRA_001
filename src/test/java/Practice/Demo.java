package Practice;

import java.sql.Date;

import org.testng.annotations.Test;

public class Demo {
	@Test
	public String sysdate() {
		Date date=new Date(0);
		return date.toString();	
	}
}
