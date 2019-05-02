package coreJavaPractice0402;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide the divisor");
		 try {
			 int number = input.nextInt();
			 int i = 1/number;
			 System.out.println("Result is: " + i);
		 
		 }catch (ArithmeticException e){
			 System.out.println("That was an arithmetic division error occured by 0. Please try again");
			 System.out.println("Please try again");
		 }catch(InputMismatchException e) {
			 System.out.println("Please provide a number");
			 System.out.println("Please try again");
		 }catch(Exception e) {
			 System.out.println("Something is wrong");
	 
		 }finally {
			 System.out.println("That's it! You tried your best");
		 }
		 System.out.println("Outside of try-catch-finally");//your code isn't being terminated
		 
	}
		
}


