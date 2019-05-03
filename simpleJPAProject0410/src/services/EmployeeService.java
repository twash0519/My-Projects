package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.simpleJPAProject0410.entity.Employee;

public class EmployeeService {
	public static void createEmployee(Employee newEmployee) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		
		
		//insert into table employee
		entitymanager.getTransaction().begin();
		entitymanager.persist(newEmployee);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		entitymanagerfactory.close();
	}
	
	
	//finds
	public static Employee findEmployee(int eid) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		
		Employee foundEmployee = entitymanager.find(Employee.class, eid);
		entitymanager.close();
		entitymanagerfactory.close();
		return foundEmployee;
		
	}
	
	//update
	public static void  updateEmployeePhoneNumber(int eid, String newPhoneNumber) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		Employee foundEmployee = entitymanager.find(Employee.class, eid);
		foundEmployee.setPhoneNumber(newPhoneNumber);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		entitymanagerfactory.close();

	}
	
	//remove
	
	public static void  removeEmployee(int eid) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Employee foundEmployee = entitymanager.find(Employee.class, eid);
		entitymanager.remove(foundEmployee);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		entitymanagerfactory.close();

	}
	
	
	
}


