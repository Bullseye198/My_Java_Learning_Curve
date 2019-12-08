
public class main {

	public static void main(String[] args) {
		
		
		Book b = new Book();
		
		System.out.println("Name of the book is " + b.name);
		System.out.println("It has " + b.type);
		System.out.println("This book is publised in " + b.datePublished);
		System.out.println("It has " + b.numPages + " pages");
		
		b.openBook(); //open the book with this line
		b.isOpened();
		
		System.out.println("Choose a page between 1 and 514: ");
		b.openChapter();  //with this line we access openChapter method
	}
}
