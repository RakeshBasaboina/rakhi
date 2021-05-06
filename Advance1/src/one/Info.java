package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Info
{
public static void main(String[] args) 
{
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String query="select * from test.cardinfo where cardno=12345";
	try 
	{
		Connection conn=DriverManager.getConnection(url);
		System.out.println("step 1");
		Statement stat = conn.createStatement();
		System.out.println("step 2");
		ResultSet res=stat.executeQuery(query);
		System.out.println("step 3");
		res.next();
		String st=res.getString("Username");
		int ii=res.getInt("cardno");
		int cv=res.getInt("cvv");
		int exp=res.getInt("expirydate");
		System.out.println("step 4");
		System.out.println(st+ "  "+ii+ "  "+ cv+ "  "+ exp);
		conn.close();
		System.out.println("step 5");
	} 
	catch (SQLException e) 
	{
		
		e.printStackTrace();
	}
}
}
