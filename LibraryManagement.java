package homeassignment;

public class LibraryManagement {
	public static void main(String[] args) {
		Library lib = new Library();
		String book = lib.addBook("Harry Potter");
		System.out.println(book);
		lib.issueBook();
	}

}
