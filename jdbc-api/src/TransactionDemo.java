import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		
		String sql="insert into customer values(143,'samuel','games')";
		String sql2="update customer set domain='Sports' where cust_id=121";
		String sql3="delete from customer where cust_id=212";
		Connection conn=null;
		try {
			 conn=JdbcFactory.getConnection();
			
			Statement stmt=conn.createStatement();
			
			stmt.addBatch(sql);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			conn.setAutoCommit(false);
			stmt.executeBatch();
			conn.commit();
			System.out.println("transaction complete");
		} catch (SQLException e) {
			System.out.println("transaction failed due to..");
            	try {
					conn.rollback();   //rollback changes on exception
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			e.printStackTrace();
		}
	}
}
