import java.util.Scanner;
import java.io.PrintWriter;

public class Input_Based_File_Writer {

	public static Scanner keyInput = new Scanner (System.in);
	public static PrintWriter writer;
	public static String txtName, txtBody;
	private static PrintWriter writer2;
	
	
	public static void main(String[] args) {
		try {
		System.out.println("Enter the name of .txt file: ");
		
		txtName = keyInput.next();
		
		writer2 = new PrintWriter(txtName, txtBody);
		
		System.out.println("Enter the text body: ");
		
		writer2.println(txtBody);
		txtBody = keyInput.next();
		
		}
		
		catch (Exception e) {
			System.out.println("The error is" + e);
		}	
	}
}
