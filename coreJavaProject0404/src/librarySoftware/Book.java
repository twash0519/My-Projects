package librarySoftware;

import java.util.ArrayList;

public class Book {
	int id;
	String name;
	String year;
	String author;
	public Book(int id, String name, String year, String author) {


		this.id = id;
		this.name = name;
		this.year = year;
		this.author = author;
	}
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public void printBookList() {
		if(bookList.size()==0) {
		System.out.println("There are no books");
		}	else {
				for(int i =0; i<bookList.size(); i++) {
					System.out.println(Integer.toString(bookList.get(i).getId()), bookList.get(i).getName(), bookList.get(i).getYear(),bookList.get(i).getAuthor());
				}
		}
	}	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
