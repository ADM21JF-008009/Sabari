import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public static DBConn instance;
	private static Connection con=null;
	public DBConn(){
		System.out.println("......Database Connection Started......");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			System.out.println("......Database Connected Sucessfully.....");
			
		} catch (ClassNotFoundException|SQLException e) {
			System.out.println("Not connected ");
			
		}
		
		
	}
	public static DBConn getInstance() throws SQLException {
		if(instance==null) {
			instance=new DBConn();
		}
		return instance;
	}
}
