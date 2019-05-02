package coreJavaProject0319;
import java.util.Scanner;

public class computingTaxes23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double status;
		double income;
		
		System.out.println("Please enter: \n " +
				"1 if you are single \n " +
				"2 if you are Married Filing Jointly \n " +
				"3 if you are Married Filing Separately \n " +
				"4 if you are the Head of Househole " );
		
		
		Scanner input = new Scanner(System.in);
		
		status = input.nextInt();
		
		//should do a while loop
		if(status  > 0 || status  < 0 )
		{
			System.out.println("Please enter a valid number from 1 to 4");
		}
		
		System.out.println("Please enter your income");
		
		Scanner input2 = new Scanner(System.in);
		
		income = input2.nextInt();
		double rate = 0;

		if (status ==1){
			if((income >= 0) && (income < 8350)) {
				 rate=.10;
				System.out.println("Your marginal tax rate is 10% and your income tax is " + (rate * income) );
				
			} else if 
			
			((income >= 8351) && (income < 33950)) {
				 rate=.15;
				System.out.println("Your marginal tax rate is 15% and your income tax is " + (rate * income));
				
			} else if 
			
			((income >= 33951) && (income < 82250)) {
				 rate=.25;
				System.out.println("Your marginal tax rate is 25% and your income tax is " + (rate * income));
				
			} else if 
			
			((income >= 82251) && (income < 171550)) {
				 rate=.28;
				System.out.println("Your marginal tax rate is 28% and your income tax is " + (rate * income));
				
			} else if 
			
			((income >= 171551) && (income < 372950)) {
				 rate=.33;
				System.out.println("Your marginal tax rate is 33% and your income tax is " + (rate * income));
				
			} else 
				
				System.out.println("Your marginal tax rate is 35%");
				
			}
			
		 else if (status == 2) {


				if((income >= 0 && income < 16700)){
					System.out.println("Your marginal tax rate is 10%");
					
				} else if 
				
				((income >= 16701) && (income < 67900)) {
					System.out.println("Your marginal tax rate is 15%");
					
				} else if 
				
				((income >= 67901) && (income < 137050)) {
					System.out.println("Your marginal tax rate is 25%");
					
				} else if 
				
				((income >= 137051) && (income < 208850)) {
					System.out.println("Your marginal tax rate is 28%");
					
				} else if 
				
				((income >= 208851) && (income < 372950)) {
					System.out.println("Your marginal tax rate is 33%");
					
				} else 
					System.out.println("Your marginal tax rate is 35%");
					
				}
				
		
		else if (status == 3) {


		if((income >= 0 && income < 8350)){
			System.out.println("Your marginal tax rate is 10%");
			
		} else if 
		
		((income >= 8351) && (income < 33950)) {
			System.out.println("Your marginal tax rate is 15%");
			
		} else if 
		
		((income >= 33951) && (income < 68525)) {
			System.out.println("Your marginal tax rate is 25%");
			
		} else if 
		
		((income >= 68526) && (income < 104425)) {
			System.out.println("Your marginal tax rate is 28%");
			
		} else if 
		
		((income >= 104426) && (income < 186475)) {
			System.out.println("Your marginal tax rate is 33%");
			
		} else 
			System.out.println("Your marginal tax rate is 35%");
			
		}
		
		else if (status == 4) {


			if((income >= 0 && income < 11950)){
				System.out.println("Your marginal tax rate is 10%");
				
			} else if 
			
			((income >= 11951) && (income < 45500)) {
				System.out.println("Your marginal tax rate is 15%");
				
			} else if 
			
			((income >= 45501) && (income < 117450)) {
				System.out.println("Your marginal tax rate is 25%");
				
			} else if 
			
			((income >= 117451) && (income < 190200)) {
				System.out.println("Your marginal tax rate is 28%");
				
			} else if 
			
			((income >= 190201) && (income < 372950)) {
				System.out.println("Your marginal tax rate is 33%");
				
			} else 
				System.out.println("Your marginal tax rate is 35%");
				
			}


							
	}	
			

}


