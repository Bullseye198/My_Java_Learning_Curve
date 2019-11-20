import java.util.Scanner;
import java.io.PrintWriter;

public class Input_Based_File_Writer {

	public static void main(String args[]) {

		Scanner keyInput = new Scanner(System.in);
		String txtName, txtBody;

		try {

			System.out.println("Enter the name of .txt file: ");
			txtName = keyInput.next();
			PrintWriter writer = new PrintWriter(txtName);

			System.out.println("Enter the text body: ");
			txtBody = keyInput.next();
			
			try {
				writer.println(txtBody);
			}
			catch (Exception e1) {
				System.out.println(e1);
			}
		}
			catch (Exception e) {
				System.out.println("The error is" + e);
		}
	}
}
