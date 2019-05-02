package coreJavaProject0326;

import java.util.Arrays;

public class SelectionSortCont {



		public static void main(String[] args) {
			int[] num = {100,5,3,101,4,1,2};
			sorter(num);
			
		}
		static void sorter(int[] num) {
		for(int i =0; i<num.length; i++) {
			int minIndex= 0);
			int temp = num[i];
			num[i] = num[minIndex];
			num[minIndex] = temp;
		}
		
		}
		static int minFinder(int startIdx, int[] num) {
			int min=num[startIdx];
			int minIndex=startIdx;
			
			for(int i = startIdx+1; i<num.length; i++) {
				if(min>num[i]) {
					min = num[i];
					minIndex = i;
				}
			}

	 return minIndex;

}
}
