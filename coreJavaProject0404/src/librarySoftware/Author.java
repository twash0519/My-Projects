package librarySoftware;

public class Author {
	int id;
	String name;
	String book;
	
	public Author(int id, String name, String book) {
		
		this.id = id;
		this.name = name;
		this.book = book;
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

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}
	
	

}
