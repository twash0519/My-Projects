package employeeDAOI;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

public abstract class EmployeeAbstractDAO {
	
	
	
	//2. Set Connection
	//String url="OrmSample	user_db@//localhost:1521/orcl"; 
	
	private final String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private final String user = "user_db";
	private final String pass = "Pass123";
	private final Driver driver = new oracle.jdbc.driver.OracleDriver();
	
	protected Connection conn = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	
	
	//End connection
	
	public void connect() throws SQLException {
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			
		}catch (SQLException e) {
			throw new SQLException(e.getMessage(), url,user,pass);
		}
	}
	
	public void dispose() {
		try {
			if (!rs.equals(null)) {
				if(!rs.isClosed()) rs.close();
				
			}
			if (!ps.equals(null)) {
				if(!ps.isClosed()) ps.close();
			}
			if (!conn.equals(null)) {
				if(!conn.isClosed()) conn.close();
			}
			
		}catch(SQLException e) {}
	}
	
}

