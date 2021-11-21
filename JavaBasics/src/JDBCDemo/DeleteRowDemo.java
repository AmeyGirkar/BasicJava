package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRowDemo {
	private static Connection con;
	private static Statement stmt;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			String dburl = "jdbc:mysql://localhost: 3306/animatanimated_movies";
			String username = "root";
			String password = "root";
			String query = "delete from movies  where title= 'Walle'";
			Class. forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(dburl, username, password);
			stmt = con.createStatement();
			stmt.executeUpdate (query);
	}
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	
finally {
	stmt.close();
	con.close();
	
}
}
}
