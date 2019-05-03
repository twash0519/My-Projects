package coreProjectHW0323;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = {1,2,3,4,5,6};


		//get the elements that will shift and create a temp array
		for (int i = 0; i < myList.length - 1; i++) {
			
			//take out the first element
			int temp = myList[0];
			
			for(int j = 0; j<myList.length - 1; j++) {

				//take the element from the end and put it to the beginning by subtracting
				myList[j] = myList[myList.length - 1]-j;


			}
			myList[myList.length - 1] = temp;

			
			
		}

		System.out.println(Arrays.toString(myList));
		
	}

}
