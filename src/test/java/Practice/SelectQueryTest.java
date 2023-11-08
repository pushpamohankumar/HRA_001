
package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.support.decorators.WebDriverDecorator;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
		Driver driver=new Driver();
		//Register the Driver
		DriverManager.registerDriver(driver);	
		//connect t db
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet51", "root", "root");
		//create statement
		Statement state = con.createStatement();
		String query = "select * from hra;";
		//execute query
		ResultSet result = state.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
			
		}
		
		
	}
		catch(Exception e) {
			
		}
finally {
	con.close();
}
	}
}
