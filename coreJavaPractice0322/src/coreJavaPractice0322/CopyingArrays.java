package coreJavaPractice0322;
import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list1 = {1,2,3,4};
		int[]list2= {1,2,3,4};
		
		list2=list1;
		
		list1[3] = 99;
		
		

		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		System.out.println(list1);
		System.out.println(list2);
		
		
	}

}
