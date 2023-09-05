import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		
		Connection conn=JdbcFactory.getConnection();
		System.out.println("connection succesfull");
		
		DatabaseMetaData meta=conn.getMetaData();
		System.out.println("Db name:"+meta.getDatabaseProductName());
		System.out.println("Db version:"+meta.getDatabaseProductVersion());
		System.out.println("Driver name:"+meta.getDriverName());
		System.out.println("Driver version:"+meta.getDriverVersion());
	}
}
