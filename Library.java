
public class Library {
	private String libraryName;
	private String location;
	private String librarian;
	private Book[] bookCollection;

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String name) {
		this.libraryName = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLibrarian() {
		return librarian;
	}

	public void setLibrarian(String librarian) {
		this.librarian = librarian;
	}

	public Book[] getBookCollection() {
		return bookCollection;
	}

	public void setBookCollection(Book[] bookCollection) {
		this.bookCollection = bookCollection;
	}
	
	// takes a sring name
	// returns an array of book
	//inside logic is to create a new array and loop through the bookcollection 
	//and add the book that matches the authoer as proveided in function
	//then add the book to the new array. 
	// after loop finish return the new array created.
	//
	

}
