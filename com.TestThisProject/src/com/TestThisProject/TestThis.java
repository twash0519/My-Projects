package com.TestThisProject;

import java.util.ArrayList;
import java.util.Arrays;

public class TestThis {
	
	ArrayList<String>names = new ArrayList<String>(Arrays.asList(new String[] {"Mike", "Bairon", "Tony"}));

	public String GetNameAtIndex(int index) {
		return names.get(index);
	}
	
	public void addName(String index) {
		names.add(index);
	}
	
	public ArrayList<String> getNames()  {
		return names;
	}
	
}
