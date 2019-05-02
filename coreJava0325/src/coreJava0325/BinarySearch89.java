package coreJava0325;

public class BinarySearch89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int key = 54;
		int [] numArr = {2,4,7,10,11,45,50,59,60,66,69,70,79};
		int startIndex = 0;
		int lastIndex = numArr.length-1;
		int midPoint=0;
		
		for(int i=0; i<numArr.length; i++) {
			 midPoint =numArr[numArr.length/2];
			if (key == midPoint) {
				System.out.println("This is the number");
				
			}else 

				if(key<midPoint) {

				 midPoint =numArr[numArr.length/2];
				 System.out.println("This number is less than " + midPoint);
				 startIndex=numArr[i];
				 lastIndex = numArr[numArr.length-1];
				 System.out.println(numArr[i]);
				 midPoint = midPoint/2;
				 
			 }else
				if(key>midPoint) {

				midPoint =numArr[numArr.length/2];
				
				System.out.println("This number is more than " + midPoint);
				startIndex=numArr[i];
				 lastIndex = numArr[numArr.length-1];
				 System.out.println(numArr[i]);
				 }
			 
			System.out.println(midPoint);
		}

	}

}
