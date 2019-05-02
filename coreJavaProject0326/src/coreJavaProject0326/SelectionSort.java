package coreJavaProject0326;

import java.util.Arrays;

public class SelectionSort {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3,4,1,2};
		sorter(num);
	}	
		
*/
	
	//static void sorter(int[] num) {
		public static void main(String[] args) {
			int[] num = {100,5,3,101,4,1,2};
			
		for(int i = 0; i<num.length;i++) {
			int currentMin= num[i]; //holder
			int cuurrentMinIndex = i;
			System.out.println("currentNumber " + currentMin);
			
			
			for(int j=i+1; j<num.length;j++) {
				if(currentMin>num[j] ){
					currentMin=num[j];
					cuurrentMinIndex=j;
					
					System.out.println(currentMin);
				}
				
			}
		
			if(cuurrentMinIndex !=1) {
				num[cuurrentMinIndex]=num[i];
				num[i] = currentMin;
				
			}

			System.out.println(Arrays.toString(num));
			
	}


}
}