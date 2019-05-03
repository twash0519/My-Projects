package coreProjectHW0323;

public class InPlaceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Reverse me";
	/*	StringBuilder sb = new StringBuilder();
		

	
		for(int i = str.length() -1; i >=0; i--){
			sb.append(str.charAt(i));
		}*/
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);

			//sb.setCharAt(2, 'm');
			sb.reverse();
		
		
		
		System.out.println(sb);

	}

}
