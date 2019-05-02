package coreJavaPractice0322;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myText = "I see i and j is my dream";
		
		

		char[] chars = myText.toCharArray();//changes the text to a character array
		char[] chars2 = reverse(chars); //invokes the reverse method
		
		System.out.println(chars2);
		
		

	}
	public static char[] reverse(char[] list) {
		char[]result = new char[list.length];
		
		for (int i = 0, j = result.length -1;
				i < list.length; i++, j--) {
			result[j] = list[i];
						
		}
		return result;
	}

}
