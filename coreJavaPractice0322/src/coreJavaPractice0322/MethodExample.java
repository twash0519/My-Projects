package coreJavaPractice0322;
import java.util.Arrays;

public class MethodExample {
	
	/*public static int myPrinter() { //must have a datatype
		
		int x =5;
		int y = 5;
		int sum =x+y;
		return sum; //must have a return if there is no void
		
	}
	
	
	
	public static void main(String[] args) {
		if(10==myPrinter()) {
			System.out.println("Correct");
		}
	}*/
	//void does not need a return
	
	
	public static void myPrinter(int[] x) { //must have a datatype

		System.out.println(Arrays.toString(x));
	}
	
	
	
	public static void main(String[] args) {

		int[] numbers = {2,3,4,5};
		myPrinter(numbers);
		
	}

}
