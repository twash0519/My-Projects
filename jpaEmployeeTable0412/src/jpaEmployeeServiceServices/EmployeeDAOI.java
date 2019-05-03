package jpaEmployeeServiceServices;

import java.util.List;

import Employee.entity.Employee;

public interface EmployeeDAOI {
	
	public void mainEmployee();
	public boolean createEmployee(Employee employee);
	public boolean updateEmployee(int giveid);
	public boolean removeEmployee(int giveid);
	public Employee findEmployee(int giveid);
	public List findAllEmployee();
	public void showEmployee(Employee employee);
	
	
}
