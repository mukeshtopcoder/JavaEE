package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnect {
	private static Connection conn = null;
	private static final String url = "jdbc:mysql://127.0.0.1:3306/mydata";
	private static final String user = "root";
	private static final String pass = "root123";
	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url,user,pass);
			return conn;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static boolean addUser(String uname,String uadd,String mobile) {
		try {
			String sql = "INSERT INTO users(uname,uadd,mobile) VALUE(?,?,?)";
			PreparedStatement pst = getConnection().prepareStatement(sql);
			pst.setString(1,uname);
			pst.setString(2,uadd);
			pst.setString(3,mobile);
			int ar = pst.executeUpdate();
			if(ar>0)
				return true;
			else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
