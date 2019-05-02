package mapAssignment0403;

import java.util.HashMap;
import java.util.Map;

public class MaoShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String>mapShare = new HashMap<String, String>();
		mapShare.put("a",  "aaa");
		mapShare.put("b",  "bbb");
		mapShare.put("c",  "ccc");
		
		
		
		for(Map.Entry<String, String> entry : mapShare.entrySet())
			System.out.print( entry.getKey()+ ": " + entry.getValue()+" ");
		
		mapShare.replace("a","");
		mapShare.replace("b","aaa");
		mapShare.remove("c",  "ccc");
		

		System.out.println("");
		
		for(Map.Entry<String, String> entry : mapShare.entrySet())
			System.out.print( entry.getKey()+ ": " + entry.getValue() +" ");
	

		

	}

}
