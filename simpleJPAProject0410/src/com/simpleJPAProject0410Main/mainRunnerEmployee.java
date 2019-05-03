package com.simpleJPAProject0410Main;

import com.simpleJPAProject0410.entity.Employee;

import services.EmployeeService;

public class mainRunnerEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello World");
		
		Employee vEmployee = new Employee();
		
		//factory
		//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(");
		
		vEmployee.setRequireID(106);
		vEmployee.setFirstName("Mike");
		vEmployee.setLastName("Woods");
		vEmployee.setPhoneNumber("9999999999");


		
		//EmployeeService.createEmployee(vEmployee);
		//EmployeeService.updateEmployeePhoneNumber(106, "719-234-8871");
		// EmployeeService.removeEmployee(100);
		 vEmployee=EmployeeService.findEmployee(99);
		 System.out.println(vEmployee.toString());

	}
	
	

}
