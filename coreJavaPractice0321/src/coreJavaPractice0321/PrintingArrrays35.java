package coreJavaPractice0321;

import java.util.Arrays;

public class PrintingArrrays35 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr = {1,2,3,4,5};
		
		
		
		
		//Method 1
		
		for (int element: arr) {
			System.out.println(element);
		}
		
		//Method 2
		for (int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		//Method 3
		System.out.println(Arrays.toString(arr));

	}

}
