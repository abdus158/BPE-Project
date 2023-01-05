package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Provide_A_Services {
	public String  provideService(int custid, String service,String provisiondescription) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into provision_of_service values('"+custid+"','"+service+"',"
					+ "'"+provisiondescription+"')");			;
					con.close();
					return "provison added";
					} catch(Exception e)
					{
					System.out.println(e);
					}
				return "err";
	}
}
