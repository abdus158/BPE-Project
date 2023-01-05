package main;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class Feedback {
	public String giveFeedback(int customerID, String yourService,String feedback) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into feedback values('"+customerID+"','"+yourService+"','"+feedback+"')");

			con.close();
			return "Thanks For Your feedback";
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return "err";

	}
}
