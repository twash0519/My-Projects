package mySimpleProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainRunner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//1.register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. Set Connection
		//String url="OrmSample	user_db@//localhost:1521/orcl"; 
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "user_db";
		String password = "Pass123";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		if(conn.isValid(1)) {
			System.out.println("You have a valid connection");
		}else {
			System.out.println("Check you connection settings.");
		}
		
		//End connection
		
		//3. Query the database
		Statement myStatement = conn.createStatement();

		ResultSet rs;
		
		rs=myStatement.executeQuery("select* from jpaemployeesecond where requireid =1");
		
		rs.next();//cursor pointer pointing to the first row 
	//	System.out.println(rs.getInt(1) + ", " + rs.getString(2) + " , " + rs.getString(3)  + ", " + rs.getString(4) );
		
		
		Employee emp = new Employee(rs.getInt(1),  rs.getString(2), rs.getString(3), rs.getString(3));
		emp.printEmployee();
	}	
	

}

	
