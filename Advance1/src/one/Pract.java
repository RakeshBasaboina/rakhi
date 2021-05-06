package one;
import java.sql.*;
/*
 * practcing of jdbc (java databace conection).
 */
public class Pract
{
public static void main(String[] args) throws Exception

{
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String query="select * from test.userinfo where name='mukesh'";
	Connection cc=DriverManager.getConnection(url);
	Statement st=cc.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	int i1=rs.getInt("phone");
	String s1=rs.getString("name");
	String s2=rs.getString("email");
	int i2=rs.getInt("password");
			System.out.println("ph no : "+i1+";name : "+s1+";email : "+s2+";id : "+i2);
	cc.close();
}
}
