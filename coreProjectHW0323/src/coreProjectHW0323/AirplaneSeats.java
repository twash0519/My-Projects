package coreProjectHW0323;

public class AirplaneSeats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][]seatsArr = new char [26][10];
		seatsArr = new char [][] 
				{{'A','1','2','3','4','5','6','7','8','9','9' +1},
				{'B','1','2','3','4','5','6','7','8','9','1'},
				{'C','1','2','3','4','5','6','7','8','9','1'},
				{'D','1','2','3','4','5','6','7','8','9','1'},
				{'E','1','2','3','4','5','6','7','8','9','1'},
				{'F','1','2','3','4','5','6','7','8','9','1'},
				{'G','1','2','3','4','5','6','7','8','9','1'},
				{'H','1','2','3','4','5','6','7','8','9','1'},
				{'I','1','2','3','4','5','6','7','8','9','1'},
				{'J','1','2','3','4','5','6','7','8','9','1'},
				{'K','1','2','3','4','5','6','7','8','9','1'},
				{'L','1','2','3','4','5','6','7','8','9','1'},
				{'M','1','2','3','4','5','6','7','8','9','1'},
				{'N','1','2','3','4','5','6','7','8','9','1'},
				{'O','1','2','3','4','5','6','7','8','9','1'},
				{'P','1','2','3','4','5','6','7','8','9','1'},
				{'Q','1','2','3','4','5','6','7','8','9','1'},
				{'R','1','2','3','4','5','6','7','8','9','1'},
				{'S','1','2','3','4','5','6','7','8','9','1'},
				{'T','1','2','3','4','5','6','7','8','9','1'},
				{'U','1','2','3','4','5','6','7','8','9','1'},
				{'V','1','2','3','4','5','6','7','8','9','1'},
				{'W','1','2','3','4','5','6','7','8','9','1'},
				{'X','1','2','3','4','5','6','7','8','9','1'},
				{'Y','1','2','3','4','5','6','7','8','9','1'},
				{'Z','1','2','3','4','5','6','7','8','9','1'}};
				
				

		int rows = 25;
		int columns = 9;
		//char i,j;
		int i,j;
		//int value=0;
		
		for (i = 0; i <=rows; i++) {
			
			for (j=0; j<=columns; j++) {
		

				//seatsArr[i][j] = (char)(65 + i);
				//seatsArr[i][j]= (char)(48 + i);

				//System.out.print(seatsArr[i][j] + " ");
				//System.out.println(i + "," + j + ": " + seatsArr[i][j]);
				System.out.print(seatsArr[i][j]+ " ");
			}
			
			System.out.println(" ");
		}

	}

}
