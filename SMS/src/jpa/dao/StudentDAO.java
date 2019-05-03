package jpa.dao;

import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;


public interface StudentDAO {
	
	//create methods that will be implemented in the services file
	
	
	/*This method reads the student table in your database and returns the data as a List<Student> */
	public List<Student> getAllStudents();
	
	/*This method takes a Student's email as a String and parses the student list for 
	 * a Student with that emails and returns a Student object*/ 
	public Student getStudentByEmail(String sEmail);
	
	/*This method takes two parameters: email and passowrd for the user input and returns
	 * whether or not the student was found.*/
	public boolean validateStudent(String sEmail, String sPassword);
	
	
	/*This method takes a student's email and a course id and checks Student_Course
	 * table to find if a student with that email is attending the course*/
	public void registerStudentToCourse(String sEmail, int cid);
	
	
	/*This method takes a Student's email as a parameter and finds the courses the 
	 * studet is registered for*/
	public List <Course> getStudentCourses(String sEmail);
	
	

}
