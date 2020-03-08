package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

	public static void main(String[] args) {
		try
		{
			System.out.println("in try");
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("After class");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","password");
		 
		 System.out.println("connection established");
		 
		Statement stmt=con.createStatement();  

		
		
		
		
		  
		con.close();  
		
		  
		}catch(Exception e)
		{ 
			System.out.println(e);
			
		} 

	}

}
