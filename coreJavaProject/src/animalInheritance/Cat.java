package animalInheritance;

public class Cat extends Animal {
	// TODO Auto-generated constructor stub

	boolean canClimb; //class variable
	
	Cat(int numberOfLegs, boolean isPet,boolean canClimb) {
		super(numberOfLegs, isPet);
		this.canClimb = canClimb;
		
	}
/*	void sound() {
		System.out.println("Sub-class: Since I am an animal, I can make sound! Cats meow!");
	}*/
	void catchMouse() {
		System.out.println("Sub-class: Cats can catch mice!");
		
	}
	
	
	
	
	
}
