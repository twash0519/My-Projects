package coreJavaProject0319;

import java.util.Random;
import java.util.Scanner;

public class lotteryProbrem {



		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Random rand = new Random();
			
			int number;
			int lotteryNumber;

			lotteryNumber = rand.nextInt(89) + 10;//range between 10 and 99.
			System.out.println(lotteryNumber);
			
			Scanner input = new Scanner(System.in);
			
			number = input.nextInt();

	}
}