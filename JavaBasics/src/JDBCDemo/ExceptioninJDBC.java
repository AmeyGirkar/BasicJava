package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptioninJDBC {
	private static Connection con ;
	private static Statement stmt;
	

			public static void main(String arg[])throws ClassNotFoundException, SQLException {
				try {
						String dburl = "jdbc:mysql://localhost: 3306/animatanimated_movies";
						String username = "root";
						String password = "root";
						String query = "{call SelectAllMovies()}";
						
						Class. forName("com.mysql.cj.jdbc.Driver");
						con = DriverManager.getConnection(dburl, username, password);
						System.out.println("connection established");
						
						stmt = con.createStatement();
						ResultSet rs = stmt.executeQuery(query);
					while(rs.next()) {
							System.out.print("Title: " + rs.getString("title") + "\t");
							System.out.print("Genre: " + rs.getString("genre") + "\t");
							System.out.print("Director: " + rs.getString("director") + "\t");
							System.out.print("Release Year: " + rs.getString("release_year") + "\t");
							System.out.println();
					}
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
