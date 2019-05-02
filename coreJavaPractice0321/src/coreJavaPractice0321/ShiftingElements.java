package coreJavaPractice0321;

import java.util.Arrays;

public class ShiftingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList= {7,30,1,5};


		
		for (int i = 0; i < 2; i++) {
			
			//take out the last element
			int temp = myList[myList.length - 1];
			
			for(int j = myList.length - 1; j >0; j--) {

				//shift elements to the right by one
				myList[j] = myList[j - 1];


			}
			myList[0] = temp;

			
			
		
		}
		//myList[myList.length]= temp;
		System.out.println(Arrays.toString(myList));

	}

}
