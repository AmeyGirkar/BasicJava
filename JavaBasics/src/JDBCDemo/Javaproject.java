package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Javaproject {
	
	public static void main(String arg[])throws ClassNotFoundException, SQLException {
		String dburl = "jdbc:mysql://localhost: 3306/product";
		String username = "root";
		String password = "root";
		String query = "Select * from prod_details;";
		
		Class. forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl, username, password);
		System.out.println("connection established");
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
	while(rs.next()) {
			System.out.print("product: " + rs.getString("Product_name") + "\t");
			System.out.print("product_name: " + rs.getString("Product_code") + "\t");
			System.out.print("company : " + rs.getString("Company_name") + "\t");
			System.out.print("year: " + rs.getString("year") + "\t");
			System.out.println();

}
	}
}
	
