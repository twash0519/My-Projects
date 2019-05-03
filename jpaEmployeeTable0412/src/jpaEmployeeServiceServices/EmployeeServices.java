package jpaEmployeeServiceServices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Employee.entity.Employee;

public class EmployeeServices implements EmployeeDAOI {

	@Override
	public boolean createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(int giveid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeEmployee(int giveid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	
	public Employee findEmployee(int pGivenId) {
		// TODO Auto-generated method stub
		
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaEmployeeTable0412");

		//Manager
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		//step 2 (2.2 query) 
		Query queryOneEmployee = entityManager.createQuery("SELECT employee FROM Employee employee where employee.requireID = :givenId");
		queryOneEmployee.setParameter("givenId", pGivenId);
		
		//Execute the query
		List<Employee> employeeList = queryOneEmployee.getResultList();

		//System.out.println(employeeList.toString());
		
		Employee vEmployee = null;
		if(employeeList.size() !=0) {
			vEmployee = employeeList.get(0);
			
		}else {
			System.out.println("Employee not found");
		}
		
		
		//STEP 3 - CLOSING factory and manager
		entityManager.close();
		entityManagerFactory.close();

		
		
		return vEmployee;
	}

	@Override
	public List findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public void showEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mainEmployee() {
		// TODO Auto-generated method stub
		Employee employee= new Employee();
		
	}

}
