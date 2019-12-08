import java.util.Scanner;

public class Book {
	
	String name = "50 Shades of Grey";
	String type = "Hard cover";
	public static int numPages = 514;
	public static int datePublished = 2011;
	public static boolean openBook;
	public static Scanner keyInput = new Scanner (System.in);
	public static void openBook() {
		openBook = true;
	}
	public static void closeBook() {
		openBook = false;
	}
	public static void isOpened() {
		if( openBook == true) {
			System.out.println("The book is opened");
		} else {
			System.out.println("The book is closed");
		}	
	}
	public static void openChapter() {
		int index = keyInput.nextInt();
		if( index <= 100) {
			System.out.println("You are inside a chapter 1");
		} else if (index <= 200) {
			System.out.println("You are inside a chapter 2");
		} else if (index <= 300) {
			System.out.println("You are inside a chapter 3");
		} else if (index <= 400) {
			System.out.println("You are inside a chapter 4");
		} else {
			System.out.println("You are inside a chapter 5");
		}
	}
}