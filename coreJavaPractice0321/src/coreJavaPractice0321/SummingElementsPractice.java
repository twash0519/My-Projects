package coreJavaPractice0321;

import java.util.Arrays;

public class SummingElementsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int[] arr = {1,2,3,4,5};
		
		//Declaring and initializing a variable to hole the sum after each interation
		int total = 0;
		
		//for loop to iterate through the array and sum all elements
		for(int i = 0; i< arr.length; i++) {
			
			total += arr[i];
		}
		System.out.println("The total is: " + total);
		for(int j = 0; j < arr.length; j++) {
			arr[j] = total - arr[j];
			
		}
		//Print out the array backwards
		System.out.println(Arrays.toString(arr));

	}

}
