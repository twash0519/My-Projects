package jpaEmployeeTable0412;

import Employee.entity.Employee;
import jpaEmployeeServiceServices.EmployeeDAOI;
import jpaEmployeeServiceServices.EmployeeServices;

public class EmployeeManagement {
	
	public void menuEmployee() {
		System.out.println("1 Enter New Employee");
		System.out.println("2 Search Employee");
		int choice = 1;
		
		switch(choice) {
		case 1:inputEmployee();
			break;
		case 2:inputEmployee();
			break;	
		default: break;
		}
	}
	
	
	
	
	public void inputEmployee() {
		//form to input the employee data
		
		//1 capture employee data using scanner
		
		Employee vEmployee = new Employee(6,"John","Doe","345-224-1234");
		createEmployee(vEmployee);
	}
	
	
	
	
	public void createEmployee(Employee vEmployee) {
		EmployeeServices es = new EmployeeServices();
		//you may include business rule her (ie validation)
		es.createEmployee(vEmployee);
		
	}
	
	
	
	public void findEmployee() {
		
		
		EmployeeDAOI es = new EmployeeServices();
		for(int i =1; i<5; i++) {
			int vGivenId = i;
			Employee employee = es.findEmployee(vGivenId);
			if(employee!=null) {
			System.out.println("This is the employee name" + employee.getFirstName());
		}else {
			System.out.println("");
		}
			
		}
		
	}

}
