package coreJavaPractice0321;

public class LargestElement37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-7,-30,1,5,-4,3,-10,-20};
		
		int min = arr[0];
		//minimum number
		for(int i = 1; i <arr.length; i++) {
			if(arr[i] < min) {
				min=arr[i];
				
			}
		}
		System.out.println("The minimum number is: " +min);
			
	

	
	
	}


}
