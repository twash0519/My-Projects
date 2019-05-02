package coreJavaProject0320;
import java.util.Random;
import java.util.Scanner;



public class GuessingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNumber;
		int userNumber;
		
		Random rand = new Random();
		
		randomNumber = rand.nextInt(101);


		System.out.println("Please enter a number");
		
		Scanner input = new Scanner(System.in);
		
		userNumber = input.nextInt();


		
		while (userNumber != randomNumber) {
			//this tells the user if the input is too low or too high
			if(userNumber > randomNumber) {
				System.out.println("Your number is too high.  Please try again.");
			} else
			if (userNumber < randomNumber) {
				System.out.println("Your number is too low.  Please try again.");
			}
			userNumber = input.nextInt();
		}
		System.out.println("That is correct.");
	}

}
