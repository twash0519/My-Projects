package com.schoolManagementApp.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.schoolManagementApp.entities.Department;
import com.schoolManagementApp.entities.Teacher;


public class SchoolServicesImplementation implements SchoolServicesInterface{
	
	
	@Override
	public void createTeacherDepartment() {
		// TODO Auto-generated method stub
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("schoolManagementApp");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Department dept1 = new Department(1,"Test Department");
		manager.persist(dept1);
		
		Teacher teacher1 = new Teacher(1, "Mike", 6000, dept1);
		manager.persist(teacher1);
		
		Teacher teacher2 = new Teacher(2, "Bairon", 8000, dept1);
		manager.persist(teacher2);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
	}
	
}
