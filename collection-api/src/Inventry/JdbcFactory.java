package Inventry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public final class JdbcFactory {

	private JdbcFactory() {
	}
	
	public static Connection getConnection() throws SQLException {
		
        String url ="jdbc:mysql://localhost:3306/ey";
		DriverManager.registerDriver(new Driver()); //driver is used to convert data base language to java language
		Connection conn=DriverManager.getConnection(url,"root","root");
		return conn;
	}
}
