package coreJavaProject0327;

public class SimpleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		recFun(num);

	}
	static void  recFun(int num) {
		num = num -2;
		if(num==0) {
			System.out.println(num);
		}else {
			num =num -2;
			recFun(num); //recursive method
		}


	}

}
