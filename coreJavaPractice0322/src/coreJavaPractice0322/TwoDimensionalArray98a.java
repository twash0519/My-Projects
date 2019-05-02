package coreJavaPractice0322;

public class TwoDimensionalArray98a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[][]numberArr = new int [3][4];

		int rows = 3;
		int columns = 4;
		int i,j;
		int value=0;
		
		for ( i = 0; i < rows; i++) {
			
			for (j=0; j<columns; j++) {
				 value +=10;
				numberArr[i][j]= value;
				
			System.out.print(numberArr[i][j] + " ");
				
			}

			System.out.println(" ");
		}

	}

}
