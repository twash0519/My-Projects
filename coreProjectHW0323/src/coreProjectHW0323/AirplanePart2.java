package coreProjectHW0323;

public class AirplanePart2 {

	public static void main(String[] args) {
	
	int count=0;
	boolean[][] seats = new boolean[26][10];
	String[] bookSeatsArr = {"A4","A10","C5","D3","E6","F8"}; 
	
	
	/*boolean[][] seats = new boolean[4][3];
	//seats= new boolean [][]
			//{{true, true, false},
			//{false,false,true},
			{true,true,true}};
		*/	
	
	
			for(int i = 0; i <bookSeatsArr.length; i++) {
				String temp = bookSeatsArr[i];
				int row = Integer.valueOf(getRow(temp.charAt(0)));
				int column = Integer.valueOf(temp.substring(1))-1;
				seats[row][column]=false;
				
			}	
			for(int i = 0; i<seats.length; i++) {
				//this is the first column

				int j=0;
				//for(int j =0; j<seats[0].length; j++) { //gets the column length
					
					//left block
					if(seats[i][j]&&seats[i][j+1]&&seats[i][j+2]) {
						count++;
					}
					
					
					//middle block
					if((seats[i][j+3]&&seats[i][j+4]&&seats[i][j+5])||
					  (seats[i][j+4]&&seats[i][j+5]&&seats[i][j+6])){
						count++;
					}
					
					//right block

					if(seats[i][j+7]&&seats[i][j+8]&&seats[i][j+9]) {
						count++;
					}
				} System.out.println(count);
				
				
				
				
				Public static int getRow(char c) {
					return (int)(c-'A');
				}

			//}
				
	
	}
		

}
