package studentCourses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainRunner {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Course c1 = new Course(1,"Core Java");
		Course c2 = new Course(1,"Python");
		Course c3 = new Course(1,"HTML");
		
		List<Course> l1 = new ArrayList<Course>();

		l1.add(c2);
		l1.add(c3);

		Students s1 = new Students(1,"Maria",l1);
		s1.printStudent();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which course do you want to drop?");
		
		String dropCourse = input.nextLine();
		
		
		s1.dropCourse(dropCourse);
		
		
		
		
		//Students s2 = new Students(1,"Maria",new ArrayList<>());
		s1.printStudent();
		//s2.printStudent();
		
		
		
		
		
		

	}

}
