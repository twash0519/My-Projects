package treeMap;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.TreeMap;



public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeMap - Sorted 
		TreeMap<Integer, String>tmap1 = new TreeMap<Integer, String>();
				
				//map 1
		tmap1.put(100,  "MD");
		tmap1.put(1,  "NY");
		tmap1.put(2,  "NJ");
		tmap1.put(3,  "CA");
		tmap1.put(3,  "PA");
		tmap1.put(4, null);
				
				
				//map 2
				
		TreeMap<Integer, String>tmap2 = new TreeMap<Integer, String>();
		tmap2.put(999, "PQ");
		tmap2.put(999, "QR");
				
				//adding map
		tmap1.putAll(tmap2);
				
				
				System.out.println(tmap1.putIfAbsent(200,"AB"));
				
				//accessng elements
				tmap1.get(100);
				tmap1.get(100);
				tmap1.get(1000);
				tmap1.get(999);
				tmap1.get(100);
				
				
				
				Map<Integer, String>newMap = new TreeMap();
				
				for(Map.Entry<Integer, String> entry : tmap1.entrySet())
					System.out.println("Key = " + entry.getKey()+ ", Value= " + entry.getValue());
				
				

	}

}
