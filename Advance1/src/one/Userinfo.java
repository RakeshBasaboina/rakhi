package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Userinfo 

{
public static void main(String[] args) throws Exception
{
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String query="select * from test.userinfo where name='mukesh'";
	//try {
		Connection conn=DriverManager.getConnection(url);
		Statement sta=conn.createStatement();
		ResultSet res=sta.executeQuery(query);
		res.next();
		int ph=res.getInt("phone");
		String s1=res.getString("name");
		String s2=res.getString("email");
		int pa=res.getInt("password");
		System.out.println(ph+"   "+s1+"   "+s2+"   "+pa);
		conn.close();
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
}
