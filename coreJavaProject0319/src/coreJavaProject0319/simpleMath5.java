package coreJavaProject0319;
import java.util.Scanner;
import java.util.Random; //Need to import this uttil to us math.random

public class simpleMath5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		
		//Declare variables
		int number1;
		int number2;
		int total; 
		int studentTotal;
		
		//Initialize variables and generate random integers in range 0 to 10
		number1 = rand.nextInt(10);
		number2 = rand.nextInt(10);
		
		
		//number1 = 0 + (int)(Math.random()*10);
		//number2 = 0 + (int)(Math.random()*10);
		
		total = (number1+number2);
		
		
		System.out.println("What is " + number1 + "+" + number2);
		
		Scanner input = new Scanner(System.in);
		
		studentTotal = input.nextInt();
		
		if (total == studentTotal) {
			System.out.println("You are correct" );
			
		}else {
			System.out.println("You are not correct. Try again." );
			
		}
		
		/*You do not need curly braces if its just one statement page 7
		 * if (total == studentTotal) 
			System.out.println("You are correct" );
		*/
		
		/*You do not need curly braces if its just one statement page 7
		 * if (total == studentTotal) 
			System.out.println("You are correct" ); //this will not executed
			System.out.println("You are right" ); //this will execute
		*/
		
	}
	

}
