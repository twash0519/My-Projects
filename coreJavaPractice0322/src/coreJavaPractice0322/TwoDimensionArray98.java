package coreJavaPractice0322;

public class TwoDimensionArray98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[][]numberArr = new int [3][4];


		int rows = 3;
		int columns = 4;
		int i,j;
		
		for ( i = 0; i < rows; i++) {
			
			for (j=0; j<columns; j++) {
				numberArr[i][j]=(int)(Math.random()*100);
				
			System.out.print(numberArr[i][j] + " ");
				
			}

			System.out.println(" ");
		}

	}

}
