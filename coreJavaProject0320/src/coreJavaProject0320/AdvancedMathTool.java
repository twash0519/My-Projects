package coreJavaProject0320;
import java.util.Random;
import java.util.Scanner;


public class AdvancedMathTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		int userNumber;
		int problems=0;
		int count=0;
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);


		
		while (problems < 5) {
			x = rand.nextInt(10);
			y = rand.nextInt(10);
		
			System.out.println(x + "-" + y + "=");


			userNumber = input.nextInt();

			if (userNumber == (x-y)) {
				count++;
			}
			problems++;
		}
			
			System.out.println("You have " + count + " correct" );
		
	
	
	}
		

}
