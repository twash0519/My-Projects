package jpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;


public class StudentService implements StudentDAO{

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");
		EntityManager manager = factory.createEntityManager();
		
		Query queryStudents = manager.createQuery("select s from Student s");
		
		List<Student> studentList = queryStudents.getResultList();
		
		System.out.println(studentList.size());
		for (Student students : studentList) {
			System.out.println(students.toString());

		}
			
		manager.close();
		factory.close();
		
		return studentList;
		
		
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		//query to see if the user's email and password are in the Students' table
		
		System.out.println(sEmail);
		System.out.println(sPassword);

		
		Query queryLogin = manager.createQuery("select s from Student s where s.sEmail = :givenEmail and s.sPass = :givenPassword");
		queryLogin.setParameter("givenEmail", sEmail);
		queryLogin.setParameter("givenPassword", sPassword);
		
		List<Student> student = queryLogin.getResultList();
		
		
		manager.close();
		factory.close();
		
		//Check to see if the student exists
		if (student.size()<= 0) { 
			System.out.println("Please enter a valid email and password");
		return true;
		}
		else {

			
			getStudentCourses(sEmail);
		}
		
		
		return false;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// TODO Auto-generated method stub
		
		//Get student courses using the student's email

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		
		
		Student student = manager.find(Student.class, sEmail);
		List<Course> sCourse = student.getsCourses();
		
		//check to see if the student has courses
		//if no courses
		if (sCourse.size()<= 0) { 
			System.out.println("Please choose courses");
			
		
		}else
			//list the courses if the student has courses
			System.out.print("Here are your courses:");
			System.out.println("Student ID: "+student.getsEmail());
			for(Course course : sCourse) {
				System.out.println(course.toString());
			
			}
			
			
			//Ask the user to input 1 to register or 2 to quit
			Scanner input = new Scanner(System.in);
			
			String userInput = input.nextLine();
			
			if (userInput == "1") {
				Query queryCourses = manager.createQuery("select c from Course c");
				
				List<Course> courseList = queryCourses.getResultList();
				
				System.out.println(courseList.toString());
				
				
			}
			
			
			System.out.println("Please enter 1 to Register for classes or 2 to Quit");
		
		manager.close();
		factory.close();
		return null;
	}
	
	
	

	
	

}
