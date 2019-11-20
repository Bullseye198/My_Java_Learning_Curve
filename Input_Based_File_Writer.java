import java.util.Scanner;
import java.io.PrintWriter;

public class Input_Based_File_Writer {

	public static Scanner keyInput = new Scanner (System.in);
	public static PrintWriter writer;
	public static String txtName, txtBody;
	private static PrintWriter writer2;
	
	
	public static void main(String[] args) {
		try {
		Scanner keyInput = new Scanner(System.in);
		PrintWriter writer;
		String txtName, txtBody;
		
		System.out.println("Enter the name of .txt file: ");
		
		txtName = keyInput.next();
		
		writer = new PrintWriter(txtName, txtBody); #Prblem is here
		
		System.out.println("Enter the text body: ");
		
		writer.println(txtBody);
		txtBody = keyInput.next();
		
		}
		
		catch (Exception e) {
			System.out.println("The error is" + e);
		}	
	}
}
