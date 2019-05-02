package coreJavaPractice0322;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]numberArr = new int [6][5];
		numberArr = new int [][] 
		{{10,12,43,11,22},
		{20,45,56,1,33},
		{30,67,32,14,44}};
		
		int rows = 3;
		int columns = 5;
		int i,j;
		
		for(i=0; i<rows; i++) {
			for (j=0; j<columns; j++) {
				System.out.print(numberArr[i][j]+ " ");
				
			}
			System.out.println( "" );
		}

		
		

	}

}
