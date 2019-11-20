import java.util.Scanner;
import java.io.PrintWriter;

public class Input_Based_File_Writer {

	static Scanner keyInput = new Scanner (System.in);
	static PrintWriter writer;
	static String txtName, txtBody;

	public static void main (String arg []) {
		
		
		
		try {	
			
		System.out.println("Enter the name of .txt file: ");
		txtName = keyInput.next();
		writer = new PrintWriter(txtName);

		System.out.println("Enter the text body: ");
		txtBody = keyInput.next();
		writer = new PrintWriter(txtBody);
		}
		
		catch (Exception e) {
			System.out.println("The error is" + e);
		}	
	}	
}
