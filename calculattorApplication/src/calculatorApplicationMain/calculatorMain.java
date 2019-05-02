package calculatorApplicationMain;

import calculatorApplicationServices.Calculator;

public class calculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		int num2 = 3;
		
		Calculator calc = new Calculator();
		
		
		System.out.println( "Addition" );


		System.out.println("Number " + num1+ " + Number" + num2 +  " = " +calc.add(num1, num2));

	}

}
