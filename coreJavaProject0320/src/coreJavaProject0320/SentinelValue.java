package coreJavaProject0320;
import java.util.Scanner;

public class SentinelValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput;
		int result = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		userInput = input.nextInt();


		
		while(userInput != 0) {
			result +=userInput; //this has to be at the top
			System.out.println("Please enter another integer:");
			userInput = input.nextInt();
			
			//userInput = input.nextInt();
		}
		
		System.out.println(result);
		input.close();
	}

}
