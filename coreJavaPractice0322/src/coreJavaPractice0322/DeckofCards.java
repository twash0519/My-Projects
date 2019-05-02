package coreJavaPractice0322;

import java.util.Arrays;

public class DeckofCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck = new int[52];
		//Initialize cards
		for(int i = 0; i<deck.length; i++) {
			deck[i] = i;
			//System.out.println(deck[i]);
		}
		int count=0;

		


		for(int i=deck.length-1; i>0; i--) {
			int j =(int)(Math.random()* (i+1));
			//System.out.println(j);
			//System.out.println(j);
			
			int temp = deck[i];
			
			deck[i] = deck[j];
			
			deck[j] = temp;
			//System.out.println(deck[j]);
			count++;
			//System.out.println("Index: "+i);

			//System.out.println("Count: "+count+" Card Number: "+deck[i]);
			
			//System.out.println(Arrays.toString(deck));
			
				
			
			}
		for(int k=1; k<=4; k++) {
			System.out.println(deck[k]);
				if(deck[k]<13) {
					System.out.println("spades");
				
			} else
				if(deck[k]>=13 && deck[k]<26 ) {
					System.out.println("hearts");
					
			}
			 else
				if(deck[k]>=26 && deck[k]<39 ) {
					System.out.println("diamonds");
							
				}	
			else
				if(deck[k]>=39 && deck[k]<52 ) {
					System.out.println("clubs");
									
				}
			
		}



	}

}
