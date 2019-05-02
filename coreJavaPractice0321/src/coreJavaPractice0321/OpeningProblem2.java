package coreJavaPractice0321;

public class OpeningProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size=100;
		int arr[]  = new int[size];
		int total=0;
		double averageNum = 0;
		int count=0;
		
		//Generate/read one hundred random numbers
		
		for(int i = 0; i<arr.length; i++) {

			arr[i] = (int)(Math.random() * 100);
			
			total += arr[i];
			
		}


			averageNum = total/arr.length ;
			System.out.println(averageNum);
			
		 for(int j =0; j <arr.length; j++) {
				if (arr[j] > averageNum ) {
					count++;
				}
		 }	
			System.out.println(count);	
	}
}
