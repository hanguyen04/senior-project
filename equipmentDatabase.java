
	import java.util.ArrayList; 
	import java.sql.Connection; 
	import java.sql.DriverManager; 
	import java.sql.SQLException; 
	import java.sql.ResultSet; 
	import java.sql.Statement;

	public class equipmentDatabase { 
		public static void main(String[] args) throws ClassNotFoundException { 
			Connection con = null; 
			String url = "jdbc:mysql://localhost:3306/equipments"; 
			String username = "csia"; 
		String password = "iapw5671"; 
		try { 
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection(url, username, password); System.out.println("Connected!");
		} catch (SQLException ex) {
			throw new Error("Error ", ex); 
		} finally {
			try { 
				if (con != null) {
					con.close();
				} 
			} catch (SQLException ex) { 
					System.out.println(ex.getMessage()); 
				} 
			} 
		} 


	public void studentInfo() {

		String sql = "SELECT name, type, size, location, status, student_borrowed " + "FROM equipments";

		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> type = new ArrayList<String>();
		ArrayList<String> size = new ArrayList<String>();
		ArrayList<String> location = new ArrayList<String>();
		ArrayList<String> status = new ArrayList<String>();
		ArrayList<String> student_borrowed = new ArrayList<String>();


		Statement MySQLJDBCUtil = null;
		try (Connection conn = MySQLJDBCUtil.getConnection()) {
			Statement stmt  = conn.createStatement();
			ResultSet rs    = stmt.executeQuery(sql);
	
				while (rs.next()) {
	               name.add(rs.getString("name")); 
	               type.add(rs.getString("type"));
	               size.add(rs.getString("size"));
	               location.add(rs.getString("location"));
	               status.add(rs.getString("status"));
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
	}

	}	
	

