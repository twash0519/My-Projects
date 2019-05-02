package coreJava0325;

import java.util.Arrays;

public class ReverseArrayTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numArr = {10,20,30,35,40,50};
		int [] newArr = new int[numArr.length];
			// one loop starts at the beginning and to other starts at the end
		for(int i=0,j= numArr.length-1;i<numArr.length; i++,j--) {
			newArr[j]=numArr[i];
			System.out.println("i: " + i);
			System.out.println("j: " + j);
			
		}


		System.out.println(Arrays.toString(newArr));

	}

}
