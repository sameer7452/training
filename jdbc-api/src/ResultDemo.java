import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {

	public static void main(String[] args) {
		String sql="Select * from customer";
		
		try {
			Connection cnn=JdbcFactory.getConnection();
			Statement stmt=cnn.createStatement();
			
			ResultSet rs=stmt.executeQuery(sql);
			
			ResultSetMetaData meta=rs.getMetaData();
			for(int i=1;i<=meta.getColumnCount();i++)
				System.out.print(meta.getColumnName(i)+"\t");
			
			System.out.println();
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString("cname")+"\t"+rs.getString(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
