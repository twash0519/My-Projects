package coreJavaProject0320;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int randomNumber;
		int i=0;
		
		Random rand = new Random();
		
		
		randomNumber = rand.nextInt(100);
		
		System.out.println("Please enter a number from 1 to 100");
		
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		
		
		
		
		while (num!= randomNumber) {
			if(num >randomNumber) {
				System.out.println("your number is too high");
			}else
				if(num <randomNumber) {
				System.out.println("your number is too low");
				}
			num = input.nextInt();

		}
	
		System.out.println("That is correct.");

	}

}
