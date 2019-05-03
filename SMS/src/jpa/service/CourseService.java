package jpa.service;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService implements  CourseDAO{

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");
		EntityManager manager = factory.createEntityManager();
		
		
		Query queryCourses = manager.createQuery("select c from Course c");
			List<Course> cList = queryCourses.getResultList();
			for (Course course :cList) {
				System.out.println(course.toString());
				
			}
			return cList;
		
		
		
		
		
	}
	
	
	

}
