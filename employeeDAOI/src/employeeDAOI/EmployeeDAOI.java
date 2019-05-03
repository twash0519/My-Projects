package employeeDAOI;

import java.util.ArrayList;
import java.util.List;

import mySimpleProject.Employee;

public interface EmployeeDAOI {
	enum SQL {
		Get_All_Employees("select * from jpaemployeesecond"),
		Get_Employee_By_Id("select * from jpaemployeesecond where requireid = 1");
		private final String query;
		private SQL (String s) {
			this.query = s;
			
		}
		public String getQuery() {
			return query;
		}
	}


	List<Employee>getAllEmployee= new ArrayList<Employee> ();
	Employee getEmployeeById(int id);
	
	

}
