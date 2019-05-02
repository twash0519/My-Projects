package linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAccess {
	public static void main (String[] args) {
		HashMap<Integer, String>hmap1 = new HashMap<Integer, String>();
		
		//map 1
		hmap1.put(100,  "MD");
		hmap1.put(1,  "NY");
		hmap1.put(2,  "NJ");
		hmap1.put(3,  "CA");
		hmap1.put(3,  "PA");
		hmap1.put(null,"MI");
		hmap1.put(4, null);
		
		//map 2
		
		HashMap<Integer, String>hmap2 = new HashMap<Integer, String>();
		hmap2.put(999, "PQ");
		hmap2.put(999, "QR");
		
		
		System.out.println(hmap1.containsValue("MI"));
		System.out.println(hmap1.containsValue(null));
		System.out.println(hmap1.get(200));
		System.out.println(hmap1.replace(2,"XY"));
		System.out.println(hmap1.remove(2,"XY"));
	//	System.out.println(hmap1.get(200).hashCode());
		
		
		//adding map
		hmap1.putAll(hmap2);
		
		


		for(Map.Entry<Integer, String> entry : hmap1.entrySet())
			System.out.println("Key = " + entry.getKey()+ ", Value= " + entry.getValue());
		
		System.out.println("========================Linked HashMap============================");	
		
		//link hash map
		
		
		LinkedHashMap<Integer, String>map1 = new LinkedHashMap<Integer, String>(16,.75f,true);
		map1.put(10, "A");
		map1.put(20, "B");
		map1.put(30, "C");
		map1.put(40, "D");
		
		
		
		LinkedHashMap<Integer, String>lmap1 = new LinkedHashMap<Integer, String>();
		
		//map 1
		lmap1.put(100,  "MD");
		lmap1.put(1,  "NY");
		lmap1.put(2,  "NJ");
		lmap1.put(3,  "CA");
		lmap1.put(3,  "PA");
		lmap1.put(null,"MI");
		lmap1.put(4, null);
		
		
		//map 2
		
		LinkedHashMap<Integer, String>lmap2 = new LinkedHashMap<Integer, String>();
		lmap2.put(999, "PQ");
		lmap2.put(999, "QR");
		
		//adding map
		lmap1.putAll(lmap2);
		
		System.out.println(lmap1.putIfAbsent(200,"AB"));
		
		for(Map.Entry<Integer, String> entry : lmap1.entrySet())
			System.out.println("Key = " + entry.getKey()+ ", Value= " + entry.getValue());
		
		System.out.println("=====================Linked HashMap Access================");
		
		//linked hash map access
		LinkedHashMap<Integer, String>lmap1Access = new LinkedHashMap<Integer, String>();
		
		//map 1
		lmap1Access.put(100,  "MD");
		lmap1Access.put(1,  "NY");
		lmap1Access.put(2,  "NJ");
		lmap1Access.put(3,  "CA");
		lmap1Access.put(3,  "PA");
		lmap1Access.put(null,"MI");
		lmap1Access.put(4, null);
		
		
		//map 2
		
		LinkedHashMap<Integer, String>lmap2Access = new LinkedHashMap<Integer, String>();
		lmap2Access.put(999, "PQ");
		lmap2Access.put(999, "QR");
		
		//adding map
		lmap1Access.putAll(lmap2Access);
		
		
		System.out.println(lmap2Access.putIfAbsent(200,"AB"));
		
		//accessng elements
		lmap1Access.get(100);
		lmap1Access.get(100);
		lmap1Access.get(1000);
		lmap1Access.get(999);
		lmap1Access.get(100);
		
		
		
		for(Map.Entry<Integer, String> entry : lmap1Access.entrySet())
			System.out.println("Key = " + entry.getKey()+ ", Value= " + entry.getValue());
		
		
	}

}
