package animalInheritance;

public class Animal {


	//This is the super class (parent class). Contains all the common elements
		// TODO Auto-generated method stub
		int numberOfLegs;
		boolean isPet;
		
		
		//create a constructor because this is required
		Animal(int numberOfLegs, boolean isPet){
			this.numberOfLegs = numberOfLegs;
			this.isPet = isPet;
			
		}

		private static void sound(){ //static is accessible, private can only be used here
			System.out.println("Super: Since I am an animal, I can make sound");
		}
		void getSound() {
			sound();
		}
		void gotLife() {
			System.out.println("Super: Since I am an animal, I live!");
		}
}
