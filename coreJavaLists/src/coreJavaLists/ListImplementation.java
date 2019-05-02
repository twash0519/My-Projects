package coreJavaLists;

import java.util.*; //imports all of the libraries



public class ListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//non generic
		//List students = new ArrayList(); //ArrayList is the datatype
		
		//generic
		List<String>students = new ArrayList<>(); //ArrayList is the datatype
		
		students.add("Lucy");
		students.add("Vernon");
		students.add("Lucy");
		
		students.remove("Lucy");

		
		
		System.out.println(students.size());
		System.out.println(students);
		
		students.add(0,"Nilda");
		System.out.println(students);
		
		
		students.add(1,"Shahparan");
		System.out.println(students);
		
		System.out.println(students.get(0));//gets the value of the index
		
		System.out.println(students.indexOf("Nilda"));//gets the index of Nilda
		
		System.out.println(students.contains("Shahparan"));
		
		System.out.println(students.set(1,"Marcial"));
		System.out.println(students);
		
		
		//List to array conversion
		String[]arr = new String[students.size()];// has to be the size or larger
		
		System.out.println(students.toArray(arr));
		System.out.println(Arrays.toString(arr));
		
		//Array to List conversion
		List<String> newList = new ArrayList<>();
		newList= Arrays.asList(arr);
		System.out.println("Array to List: " + newList);
		
		//List is only for object
		Integer[]numbers = {1,2,3,4,5};
		List<Integer>numList = new ArrayList<>();
		numList = Arrays.asList(numbers);
		
		
		//Print all elements using Lambda exp.
		students.forEach(p -> {System.out.println(p);});
		
		List<String> ins = new ArrayList<>();
		ins.add("Shah");
		ins.add("Young");
		
		students.addAll(ins);
		System.out.println(students);
		
		//generic but can add all types of objects
		List<Object> rIT = new ArrayList<>();
		rIT.add(2);
		rIT.add("String");
		


		
	}

}
