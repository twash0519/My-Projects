package jpa.dao;

import java.util.List;

import jpa.entitymodels.Course;

public interface CourseDAO {
	
	//This method returns every course in the table
	public List<Course> getAllCourses();

}
