import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedScannerDemo {
	
	public static void main(String[] args)throws Exception {
		//? is know as place holders their index starts at 1
		String sql="insert into customer values(?,?,?)";
		Scanner sn=new Scanner(System.in);
		
		try {
			Connection conn=JdbcFactory.getConnection();
			//pre-compile statement created with query
			PreparedStatement stmt = conn.prepareStatement(sql);
			//replacing place holders with values
			System.out.println("enter the customer id");
			stmt.setInt(1, sn.nextInt());
			System.out.println("enter the customer name");
			stmt.setString(2, sn.next());
			System.out.println("enter the customer domain");
			stmt.setString(3, sn.next());
			
			stmt.executeUpdate();
			System.out.println("record successfully insereted..");
		} catch (SQLException e) {
			
			e.printStackTrace();
	
		}

	}
}
