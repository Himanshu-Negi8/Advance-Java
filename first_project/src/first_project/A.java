package first_project;
import java.sql.*;

public class A {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geu","root","");
		Statement st = con.createStatement();
		st.executeUpdate("insert into emp values (2,'negi')");
		ResultSet rs = st.executeQuery("select*from emp");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		
	} 

}
