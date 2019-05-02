package coreJava0325;

import java.util.Arrays;

public class BinarySearchPractice {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int [] arr =  {2,4,6,34,50,60};
		int key = 40;
		int startIndex = 0;
		int endIndex = arr.length-1;
		//int midIndex = arr.length/2;
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<endIndex; i++) {
			int midIndex = (startIndex + endIndex)/2;
			System.out.println("New loop");
			
			if (key ==midIndex) {
				System.out.println("This is the number");
				
			}

				if(key < midIndex) {
					System.out.println("This is too low");
					startIndex=arr[i];
					endIndex = midIndex;


					System.out.println(midIndex);
					System.out.println(i + " is not the index");
				} 

					if(key> midIndex) {
						
					startIndex= midIndex +1;




					System.out.println("This is too high");
					System.out.println(midIndex);
					}
				
		}
	} 
}
