package coreJavaPractice0321;

public class SummingAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,2,3,4,5};
		
		//Declaring and initializing a variable to hole the sum after each interation
		double total = 0;
		
		//for loop to iterate through the array and sum all elements
		for(int i = 0; i< arr.length; i++) {
			
			total += arr[i];
		}
		System.out.println("The total is: " + total);
	}

}
