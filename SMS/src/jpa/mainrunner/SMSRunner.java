package jpa.mainrunner;

import java.util.Scanner;

import jpa.dao.StudentDAO;
import jpa.service.StudentService;

public class SMSRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Get the user name and password
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your email");
	
		String inputEmail = input.nextLine();
		
		System.out.println("Please enter your password");
		
		String inputPass = input.nextLine();
		
		//

		//create an instance for the StudentService
		StudentDAO studentDAO = new StudentService();
		studentDAO.validateStudent(inputEmail, inputPass);
		


		
		

	}

}
