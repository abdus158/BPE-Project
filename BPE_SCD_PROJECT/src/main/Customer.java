package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Customer {
	public String  customerDetails(String name,String email,String phoneNo) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into customerdetail(customername,customeremail,customerphoneno) values ('"+name+"','"+email+"','"+phoneNo+"')");
			con.close();
			return "Customer added";
			
			
			
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return "err";
	}
}
