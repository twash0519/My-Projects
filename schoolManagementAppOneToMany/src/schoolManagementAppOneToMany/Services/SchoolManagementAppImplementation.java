package schoolManagementAppOneToMany.Services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import schoolManagementAppOneToMany.Entity.Department;
import schoolManagementAppOneToMany.Entity.Teacher;



public class SchoolManagementAppImplementation implements  SchoolManagagementAPPInterface{

	@Override
	public void createDepartmentTeacher() {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("schoolManagementApp");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Teacher teacher1 = new Teacher(3,"Mile", 60000);
		manager.persist(teacher1);
		
		Teacher teacher2 = new Teacher(4, "Bairon", 80000);
		manager.persist(teacher2);
		
		List<schoolManagementAppOneToMany.Entity.Teacher>teacherList = new ArrayList<Teacher>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		
		Department dept1 = new Department(5, "Test Department", teacherList);
		manager.persist(dept1);
		
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		
	}


	
}
