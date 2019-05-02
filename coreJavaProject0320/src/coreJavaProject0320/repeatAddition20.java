package coreJavaProject0320;
import java.util.Scanner;

public class repeatAddition20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total;
		int answer;
		
		total = 7;
		System.out.println("What is  2 + 5?");
		
		Scanner input = new Scanner(System.in);
		
		answer = input.nextInt();
		
		while (answer != total) {
			System.out.println("That is not correct.  Please try again.");
			/*you have to include something that will change the answer so that it will 
			evaluate another asnwer or you will have an infinite loop.*/
			answer = input.nextInt();
		}
		System.out.println("That is correct.");
	}

}
