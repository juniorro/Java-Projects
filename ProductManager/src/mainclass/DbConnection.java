package mainclass;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	private static Connection connection;
	
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "N99berea1");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}
	
	

}
