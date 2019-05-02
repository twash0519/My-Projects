package books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Animal.Animal;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Books tm1 = new Books(1,"The Bluest Eyes","97878");
		Books tm2 = new Books(2,"Beloved","97879");
		Books tm3 = new Books(3,"Sulla","97879");
		Books tm4 = new Books(4,"Song of Solomon","97880");
		Books tm5 = new Books(5,"Jazz","97881");
		Books lt1 = new Books(6,"Noble Beginnings", "97881");
		Books lt2 = new Books(7,"A Deadly Distance", "97881");
		
		
		
		
		
		
		List<Books> lb1 = new ArrayList();
		
		lb1.add(tm1);
		lb1.add(tm2);
		lb1.add(tm3);
		lb1.add(tm4);
		lb1.add(tm5);


		
		List<Books> lb2 = new ArrayList();
		lb2.add(lt1);
		lb2.add(lt2);
		
		
		Author a1 = new Author(1,"Toni Morrison","tonimorison@amazon.com",lb1);
		Author a2 = new Author(1,"L.T. Ryan","ltryan@amazon.com",lb2);
		
		List<Author>authorList = new ArrayList<Author>(Arrays.asList(a1,a2));
		

		//a1.printAuthor();

		//a2.printAuthor();
		
		
		System.out.println("Which author's books do you want to see?");
		Scanner input = new Scanner(System.in);
		String findAuthor = input.nextLine();
		
		
		System.out.println("Here is the list of books by: " + findAuthor);


			for(int i = 0; i<authorList.size(); i++) {
				if(!authorList.get(i).aName.equals(findAuthor)) {
					authorList.get(i).printAuthor();
					continue;
					
				}else {
					//aList.add(authorList.get(i));

					System.out.println("Author found with name: " +authorList.get(i).aName +"\n" +authorList.get(i).aBooks );
					

					//shahsPet.remove(shahsPet.get(i));
					
				}
			}
		
		
		
		
		
		
		
		
		
		
		System.out.println("Which book would you like to remove? ");
		
		String removeBook = input.nextLine();
		
		
		a1.removeBook(removeBook);
		System.out.println("Here is the new list of books for "  +findAuthor);
		a1.printAuthor();
		



	}

}
