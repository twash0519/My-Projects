package Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1 = new Animal("Tom",4);
		Animal dog2 = new Animal("Biscuit",4);
		Animal dog3 = new Animal("Cookies",4);
		Animal dog4 = new Animal("Biscuit",4);
		Animal dog5 = new Animal("Biscuit",4);
		
		ArrayList<Animal>dogList = new ArrayList<Animal>(Arrays.asList(dog1, dog2, dog3,dog4,dog5));
		
		
		//Animal[] shahPet1 = {dog1,dog2};
		
		List<Animal>shahsPet = new ArrayList<Animal>(Arrays.asList(dog2, dog3, dog4));
		
		for(Animal animal: shahsPet) {
			System.out.println(animal.name);
			
		}
		
		String animalName = "Cookies";
		Animal animal = null;
		
		//this keeps track of duplicates
		ArrayList<Animal>aList = new ArrayList<>();
		
		/*for (int i=shahsPet.size()-1; i>0; i--){
		 * if(!shahsPet.get(i).name.equals(animalName)) {

				continue;
			}	else {
					
				shahsPet.remove(shahsPet.get(i));
			}

		 */
		
		for(int i = 0; i<shahsPet.size(); i++) {
			if(!shahsPet.get(i).name.equals(animalName)) {

				continue;
				
			}else {
				aList.add(shahsPet.get(i));
				//System.out.println("Dog found with name: " +shahsPet.get(i).name);
				//shahsPet.remove(shahsPet.get(i));
				
			}
		}
			
			System.out.println("Dog found with name: " +animalName + "is:" + aList.size());
			System.out.println("Here are our available dogs: ");
			for(Animal dog: dogList) {
				System.out.println(dog.name);
			}
			
			ArrayList<Animal>distinct = new ArrayList<Animal>();
			System.out.println(distinct.size());
			for(int j = 1; j <dogList.size();j++) {
				
				for(int k = 0; k<dogList.size(); k++) {
					System.out.println("j" + j);
					System.out.println("k" + k);
					if(!dogList.get(j).name.equals(distinct.get(k).name)) {
						distinct.add(dogList.get(k));
						
						break;
						
						
					}
					
					System.out.println("Distinct dog list: "+distinct);
				}
			}
		



	}

}
