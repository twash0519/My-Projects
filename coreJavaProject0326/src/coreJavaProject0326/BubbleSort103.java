package coreJavaProject0326;

import java.util.Arrays;

public class BubbleSort103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num ={10,5,20,15,35};
		boolean flag = true; //set flag to true to begin
		int temp;//holding variable
		
	/*	Ascending
	 * while(flag){
			flag = false;
			for(int i = 0; i<num.length-1; i++) {
				if (num[i] > num[i+1]) {
					temp=num[i];//swap elements
					System.out.println("temp " +temp);
					num[i]=num[i+1];
					System.out.println("num[i] " +num[i]);
					num[i+1]=temp;
					flag=true;
					
					System.out.println("num[i+1] " +num[i+1]);
					
					
				}System.out.println(Arrays.toString(num));

			}
		}	
	*/
		
		
		//descending
	/*	
		while(flag){
			flag = false;
			for(int i = 0; i<num.length-1; i++) {
				if (num[i] < num[i+1]) {
					temp=num[i];//swap elements
					System.out.println("temp " +temp);
					num[i]=num[i+1];
					System.out.println("num[i] " +num[i]);
					num[i+1]=temp;
					flag=true;
					
					System.out.println("num[i+1] " +num[i+1]);
					
					
				}System.out.println(Arrays.toString(num));

			}
		}	*/
	
		//two four loops
		for(int j=0; j<num.length-1; j++) {
			for(int i = 0; i<num.length-i-1; i++) {
				if (num[i] > num[i+1]) {
					temp=num[i];//swap elements
					System.out.println("temp " +temp);
					num[i]=num[i+1];
					System.out.println("num[i] " +num[i]);
					num[i+1]=temp;


					
					System.out.println("num[i+1] " +num[i+1]);
					
					
				}System.out.println(Arrays.toString(num));

			}
		}	
		
	
	}

}
