package main;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class Request_A_Services {

	public String rrequestAservixce(int customerID,String requiredService,String description) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into request_a_services values('"+customerID+"','"+requiredService+"',"
					+ "'"+description+"')");
			
			
			con.close();
			return "request added";
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return "err";
	}

}
