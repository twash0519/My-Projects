package coreJavaProject0328;

import java.util.Arrays;
import java.util.Scanner;

public class StudentSeatsUnordredArray {

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
        
     //   System.out.println("Please give me the position you want it");
      //  int position = input.nextInt();
        
        
       
        //right shift
        System.out.println(arr.length-1);
        int newPosition=0;
        
        
        
        for(int j=arr.length-1; j > newPosition; j--) {
        	arr[j]= arr[j-1] ;
        	 System.out.println("test");

   
        }
      //  arr[position] = newSeat;

//System.out.println(Arrays.toString(arr));


    }
}
