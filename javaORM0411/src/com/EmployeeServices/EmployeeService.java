package com.EmployeeServices;

import java.util.List;

import javax.management.Query;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Table;

import javaORM0411.entity.Employee;


@Entity
@Table(name="jpaEmployeeSecond")


public class EmployeeService {

	public void getAllEmployees(){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("javaORM0411.entity");
		EntityManager manager = factory.createEntityManager();
		
		Query queryManager = EntityManager.createQuery("select e from Employee e where e.requireID = :givenID");
		queryManager.setParameter("givenID", 20);
		
		Query query = manager.createNamedQuery("Find Emloyee by ID");
		query.setParameter("id", 21);
		
		List<Employee>employees = query.getResultList();
		
		//List<Employee>employees = query.getResultList();
		
		for(Employee e: employees) {
			System.out.println(e.toString());
		}
		
	}
}
