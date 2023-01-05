package main;

import java.sql.*;

public class Services {

	public String serviceCatalog() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from servicescatalog");
			String rst ="";
			while(rs.next())
			{
			rst=rst+ "Servicenum: " + rs.getString(1) + " ServiceName: " + rs.getString(2) +
					" ServiceDescription: "+rs.getString(3);
			}
			con.close();
			return rst;
			
			} catch(Exception e)
			{
			System.out.println(e);
			}
			return "err";
	}

}
