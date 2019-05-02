package coreJavaProject0320;

public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double year = 0;
		double balance = 10000; 


		double rate=0.07;
	
		while (balance < 20000) {
		    // Add 1 to the year value
		    year++; 
		    // Compute the interest by multiplying the balnce value by 0.7 (7 percent interest)
		    //   Add the interest to the balance
		   // balance *= (1+rate) ; //interest=balance * rate balance += interest
		    balance = balance * 1.07;
		}

		System.out.println("The investment doubled after " + year + " years.");



	}

}
