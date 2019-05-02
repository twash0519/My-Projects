package mapAssignment0403;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapBully {
	public static void main (String[] args) {
		
	
		//Problem 1
		
		HashMap<String, String>mapbully = new HashMap<String, String>();
		mapbully.put("a",  "candy");
		mapbully.put("b",  "dirt");
		
		
		
		for(Map.Entry<String, String> entry : mapbully.entrySet())
			System.out.print( entry.getKey()+ ": " + entry.getValue()+" ");
		
		mapbully.replace("a","");
		mapbully.replace("b","candy");
		

		System.out.println("");
		
		for(Map.Entry<String, String> entry : mapbully.entrySet())
			System.out.print( entry.getKey()+ ": " + entry.getValue() +" ");
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//map2
		HashMap<String, String>mapbully1 = new HashMap<String, String>();

		mapbully1.put("a",  "candy");
		for(Map.Entry<String, String> entry : mapbully1.entrySet())
			System.out.print( entry.getKey()+ ": " + entry.getValue() +" ");

		mapbully1.replace("a","");
		mapbully1.put("b","candy");
		System.out.println("");
		
		for(Map.Entry<String, String> entry : mapbully1.entrySet())
			System.out.print( entry.getKey()+ ": " + entry.getValue() +" ");
		
		
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//map3
		HashMap<String, String>mapbully2 = new HashMap<String, String>();

		mapbully2.put("a",  "candy");
		mapbully2.put("b",  "carrot");
		mapbully2.put("c",  "meh");	
		
		
		
		
		for(Map.Entry<String, String> entry : mapbully2.entrySet())
			System.out.print( entry.getKey()+ ": " + entry.getValue()+" ");
		
		mapbully2.replace("a","");
		mapbully2.replace("b","candy");
		

		System.out.println("");
		
		for(Map.Entry<String, String> entry : mapbully2.entrySet())
			System.out.print( entry.getKey()+ ": " + entry.getValue() +" ");
		System.out.println("");
		
		


		
		}	

}
