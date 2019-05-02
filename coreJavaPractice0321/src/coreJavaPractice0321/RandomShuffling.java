package coreJavaPractice0321;

public class RandomShuffling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] myList= {7,30,1,5,4,3,10,20};


		//int myList[]  = new int[5];


		for(int i=myList.length-1; i>0; i--) {
			int j =(int)(Math.random()* (i+1));
			System.out.println(j);
			
			
			int temp = myList[j];
			myList[i] = myList[j];
			myList[j] = temp;
			System.out.println(myList[j]);
			
		}
		

	}

}
