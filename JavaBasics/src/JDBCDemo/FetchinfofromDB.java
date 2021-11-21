package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchinfofromDB {
	
		public static void main(String arg[])throws ClassNotFoundException, SQLException {
			
			String dburl = "jdbc:mysql://localhost: 3306/animatanimated_movies";
			String username = "root";
			String password = "root";
			String query = "Select * from movies;";
			
			Class. forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dburl, username, password);
			System.out.println("connection established");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
				System.out.print("Title: " + rs.getString("title") + "\t");
				System.out.print("Genre: " + rs.getString("genre") + "\t");
				System.out.print("Director: " + rs.getString("director") + "\t");
				System.out.print("Release Year: " + rs.getString("release_year") + "\t");
				System.out.println();
		}
		
	}
}

