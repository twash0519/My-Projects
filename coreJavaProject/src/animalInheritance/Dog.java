package animalInheritance;

public class Dog extends Animal {
	
	
	String name;
	boolean isTrained;
	
	Dog(int numberOfLegs, boolean isPet,String name,boolean isTrained ) {
		super(numberOfLegs, isPet);//thses are coming from the super class
		this.name = name;
		this.isTrained = isTrained;
	}
	void walk() {
		System.out.println("Sub-class: Dog only can walk forwar");
	}
	/*void sound() {
		System.out.println("Sub-class: Since I am an animal, I can make sound! Dog barks!");
	}
	*/


}
