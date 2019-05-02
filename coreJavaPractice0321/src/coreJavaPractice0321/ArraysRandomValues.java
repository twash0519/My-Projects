package coreJavaPractice0321;

import java.util.Scanner;

public class ArraysRandomValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		
		Scanner scan = new Scanner(System.in);
		
		length = scan.nextInt();
		
		int arr[] = new int[length];
				
		for(int i = 0; i<length; i++) {
			System.out.println("Enter number " + (i+1) + ": ");
				arr[i] = (int)(Math.random() * 100);
				
		}
		
		for(int i = 0; i<5; i++)
			System.out.println("Number " + (i+1) + ": " + arr[i]);

		System.out.println(arr);

	}

}
