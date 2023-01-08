import java.util.ArrayList; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.ResultSet; 
import java.sql.Statement;


public class studentDatabase { 
	public static void main(String[] args) throws ClassNotFoundException { 
		Connection con = null; 
		String url = "jdbc:mysql://localhost:3306/students"; 
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

	String sql = "SELECT id, student_name, team_name, current_standard, creativity, physical_recreation, service, expeditions " + "FROM students";

	ArrayList<String> id = new ArrayList<String>();
	ArrayList<String> student_name = new ArrayList<String>();
	ArrayList<String> team_name = new ArrayList<String>();
	ArrayList<String> current_standard = new ArrayList<String>();

	ArrayList<Boolean> creativity = new ArrayList<Boolean>();
	ArrayList<Boolean> physical_recreation = new ArrayList<Boolean>();
	ArrayList<Boolean> service = new ArrayList<Boolean>();
	ArrayList<Boolean> expedition = new ArrayList<Boolean>();

	Statement MySQLJDBCUtil = null;
	try (Connection conn = MySQLJDBCUtil.getConnection()) {
			Statement stmt  = conn.createStatement();
			ResultSet rs    = stmt.executeQuery(sql);

			while (rs.next()) {
               id.add(rs.getString("id")); 
               student_name.add(rs.getString("student_name"));
               current_standard.add(rs.getString("current_standard"));
               team_name.add(rs.getString("team_name"));
               creativity.add(rs.getBoolean("creativity"));
               physical_recreation.add(rs.getBoolean("physical_recreation"));
               service.add(rs.getBoolean("service"));
               expedition.add(rs.getBoolean("expedition"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	}

	}
