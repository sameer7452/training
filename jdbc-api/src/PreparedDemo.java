import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {

	public static void main(String[] args)throws Exception {
		//? is know as place holders their index starts at 1
		String sql="insert into customer values(?,?,?)";
		
		try {
			Connection conn=JdbcFactory.getConnection();
			//pre-compile statement created with query
			PreparedStatement stmt = conn.prepareStatement(sql);
			//replacing place holders with values
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setString(3, args[2]);
			
			stmt.executeUpdate();
			System.out.println("record successfully insereted..");
		} catch (SQLException e) {
			
			e.printStackTrace();
	
		}
	}
}
