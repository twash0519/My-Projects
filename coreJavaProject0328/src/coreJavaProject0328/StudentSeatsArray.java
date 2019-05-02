package coreJavaProject0328;

import java.util.Arrays;
import java.util.Scanner;

public class StudentSeatsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);

        System.out.println("enter number of seats");

        int seatNum=input.nextInt();

        int arr[]=new int[seatNum+1];

        System.out.println("enter the seats you want");

        for(int i=0;i<seatNum;i++){

            arr[i]=input.nextInt();
            
       
        }System.out.println(Arrays.toString(arr));
        
        
        System.out.println("Please give me one more seat");
        int newSeat = input.nextInt();
        
        System.out.println("Please give me the position you want it");
        int position = input.nextInt();
        
        
       
        //right shift
        for(int j = arr.length-1; j > position; j--) {
        	arr[j]= arr[j-1] ;

   
        }
        arr[position] = newSeat;
        System.out.println(Arrays.toString(arr));


    }
}
