package first_project;
import java.sql.*;
public class B {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geu","root","");
//		PreparedStatement ps = con.prepareStatement("insert into emp values(?,?)");
//		ps.setInt(1,34);
//		ps.setString(2,"himanshu");
//		ps.execute();
		
		PreparedStatement ps1 = con.prepareStatement("select * from emp where sn = ?");
		
		ps1.setInt(1,2);
		ResultSet rs =ps1.executeQuery();

}
	
}
