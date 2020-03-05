package first_project;
import java.sql.*;
import java.io.*;

public class C {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geu","root","");
//		File f = new File("a.jpg");
//		
//		PreparedStatement ps = con.prepareStatement("insert into images values(?)");
//		FileInputStream fis = new FileInputStream(f);
//		ps.setBinaryStream(1,fis,(int)f.length());
//		ps.execute();
//		fis.close();
		
		File fi = new File("an.jpg");
		FileOutputStream fos = new FileOutputStream(fi);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from images");
		rs.next();
		fos.write(rs.getBytes(1));
		fos.close();
	}

}
