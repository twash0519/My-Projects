package coreJavaProject0319;
import java.util.Random;
import java.util.Scanner;

public class lottery34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int number=0;
		int lotteryNumber = rand.nextInt(90) + 10; //90 is not included in the random this makes the random 10 to 99
		//int userInput = 0;
		System.out.println("Please input a number");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		
		while(number < 10 || number >=100 ) {
			System.out.println("Please enter a two digit number");
			number = input.nextInt();
			
		}
		
		//System.out.println(lotteryNumber);
		


	/*	
		try {
			number = input.nextInt();
			}
		catch(Exception e) {
			System.out.println("Error");
			input.nextLine();
		//	continue;
		}
		

*/
		int lotteryFirst = lotteryNumber /10;
		int lotteryLast = lotteryNumber % 10;
		int nummberFirst = number /10;
		int numberLast = number % 10;
		
		
		if 
			(number == lotteryNumber ) {
			System.out.println("You win $10,000");
		} else 
			if ((lotteryFirst == nummberFirst ) ||  (lotteryFirst == numberLast ) || (lotteryLast ==  nummberFirst) || (lotteryLast ==  numberLast) )  {
				System.out.println("You win $1,000");
			
		}



		
	}
}
