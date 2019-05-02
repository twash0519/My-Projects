package coreJavaProject0320;
import java.util.Scanner;

public class PrimeNumbers43 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 int num = 2;
	 int divisor = 0;
	 int count =0;

	 System.out.println("The first 20 primes numbers");
	     while(count < 20)  {
	    	for(int i=2; i<=num; i++) {
	    		if((num%i)==0) {
	    		   divisor++;
	    	    }

	     }
	     if (divisor==1) {
	    	System.out.println(num);
	    	count++;
	    
	     }
	     num++;
	     divisor=0;
	     }   

	     }
}
