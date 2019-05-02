package coreJavaProject0320;
import java.util.Scanner;

public class Gcd48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput;
		int n1;
		int n2;
		int gcd = 1;


		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a positive integer:");

		n1 = input.nextInt();
		
		System.out.println("Please enter another positive integer:");

		n2 = input.nextInt();
		
		//This get the lowest number of the two inputs
			int leastNumber;
			if(n1<n2) {
				leastNumber = n1;
			}else {
				leastNumber = n2;
			}
			
			System.out.println("LN: "+leastNumber);
			//Do while the counter number is less that the least number
			//can also do for(int i=2; i <=n1 && <n2; i++ )
			
			for(int i=2; i <=leastNumber; i++ ) {
			//check to see if each number is divisible by the counter number
			if(n1%i==0 && n2%i==0)
                gcd = i;
				
		}
		System.out.println("GCD: "+ gcd);
		
	}

}
