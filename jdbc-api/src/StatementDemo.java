import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class StatementDemo {

	public static void main(String[] args) throws Exception {
		String sql="insert into customer values(141,'Ranjeet','shopping')";
		
		try {
			Connection conn=JdbcFactory.getConnection();
			
			//getting statement object from connection to perform the fixed query
			Statement stmt=conn.createStatement();
			//performing DML operation using statement
			stmt.executeUpdate(sql);
			//if verything goes fine printing message
			System.out.println("record inserted...");
		} catch (SQLException e) {
            System.out.println("record not inserted due to:");
			e.printStackTrace();
		}
		
	}
}
