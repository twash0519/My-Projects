package coreJavaPractice0321;

import java.util.Scanner;

public class InitializingArrays32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
				
		for(int i = 0; i<5; i++) {
			System.out.println("Enter number " + (i+1) + ": ");
				arr[i] = scan.nextInt();
				
		}
		
		for(int i = 0; i<5; i++)
			System.out.println("Number " + (i+1) + ": " + arr[i]);

		System.out.println(arr);
		
	}

}
