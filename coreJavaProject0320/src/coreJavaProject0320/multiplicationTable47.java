package coreJavaProject0320;
import java.util.Scanner;

public class multiplicationTable47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int userInput = input.nextInt();
		int result;
		
		
		for(int i = 1; i <= userInput; ++i) {

			for(int j = 1; j <= 10; ++j) {
				result = i * j;
				//System.out.println(result);
				System.out.printf("%-5s ", i*j);//formatting
				
			}
			System.out.println("\n");
		}

	}

}
