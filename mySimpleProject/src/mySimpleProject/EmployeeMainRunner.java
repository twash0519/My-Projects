package mySimpleProject;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMainRunner {
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	//1.register the driver
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. Set Connection


			
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "user_db";
			String password = "Pass123";
			
			List<Employee> employeeList = new ArrayList<Employee> ();
			
			
			protected Connection conn = DriverManager.getConnection(url, username, password);
			
			if(conn.isValid(1)) {
				System.out.println("You have a valid connection");
			}else {
				System.out.println("Check you connection settings.");
			}
			
			//End connection
			
			//3. Query the database
			Statement myStatement = conn.createStatement();

			ResultSet rs;


			rs=myStatement.executeQuery("select * from jpaemployeesecond order by requireid");
			//rs.next();//cursor pointer pointing to the first row 

	
			while(rs.next()) {

				Employee emp = new Employee(rs.getInt(1),  rs.getString(2), rs.getString(3), rs.getString(3));
				employeeList.add(emp);
			}
			//this prints out the list
			for(Employee e: employeeList) {
			
			e.printEmployee();
			}
		}	
		

	}

		
