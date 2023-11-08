package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQueryTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Connection con=null;
		int result=0;
		try {
		Driver driver=new Driver();
		//register the driver
		DriverManager.registerDriver(driver);
		//get connection from driver
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet51", "root", "root");
		//create statement
		Statement state = con.createStatement();
		String query = "insert into hra values('Manual','Ashish','Bangalore',98765456);";
		//execute statement
		result = state.executeUpdate(query);
		}
		catch(Exception e) {
			
		}
		finally {
		if(result==1) {
			System.out.println("Data is Updated");
		}
		else
		{
			System.out.println("Data is not Updated");
		}
		
	}

	}}
