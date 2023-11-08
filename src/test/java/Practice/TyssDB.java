package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class TyssDB {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		Random r=new Random();
		int ran = r.nextInt(500);
		Connection con=null;
		try {
		Driver driver=new Driver();
		DriverManager.deregisterDriver(driver);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hra","root","root");
		Statement state = con.createStatement();
		String query = "select * from tyss;";
		ResultSet result = state.executeQuery(query);
		while(result.next()) {
			String output = result.getString(2);	
			
		}
		}
		
		
	catch(Exception e) {
	}
	finally {
		con.close();
	}
		
	}
	}
