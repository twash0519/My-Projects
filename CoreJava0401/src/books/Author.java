package books;

import java.util.List;

public class Author {
	int aId;
	String aName;
	String aEmail;
	List<Books> aBooks;
	
	Author(int aId, String aName, String aEmail, List<Books>aBooks){
		
		this.aId = aId;
		this.aName = aName;
		this.aEmail = aEmail;
		this.aBooks = aBooks;
		
	}
	
	
	void printAuthor() {
		System.out.println("ID: " + aId);
		System.out.println("Name: " + aName);
		for(Books b: aBooks) {
			System.out.println("Title: " + b.bName);
		}
	}
	

	
	
	void removeBook(String removeBook) {
		boolean deleted = false;
		for(int i =0; i < aBooks.size(); i++) {
			System.out.println("This is the  book " + aBooks.get(i).bName);
			if(aBooks.get(i).bName.equals(removeBook)) {
				aBooks.remove(aBooks.get(i));
				deleted=true;
			}
		}
	}
		/*
		if(aBooks.contains(findAuthor)) {
			aBooks.remove(findAuthor);
		}else {
			System.out.println("The course you're trying to drop is not in your list");
		}*/
	
}
