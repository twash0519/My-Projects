package coreJavaProject0327;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int rows = 3; 
				int cols = 3 ;
				
				int[][] board = new int[rows][cols]; 
				
				
				//System.out.println("Please enter two numbers for your move");

				Scanner input=new Scanner(System.in);
				
				//int positions = input.nextInt(); 
				int positions1 = 1;
				int positions2 =2;
				
				for(int i = 0;i<=rows;i++) {
					for(int j=0;j<=cols;j++) {
						if(i == 3) {
							board[i]=board[i-1];
							
						}
						if(j==6) {
							board[j]=board[j-1];
						}
						System.out.println(i);
						//System.out.print(board[i][j] + " ");

					}
					
				}		


	



				}


	}



