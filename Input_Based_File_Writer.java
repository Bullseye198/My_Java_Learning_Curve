//Now it works but it doesnt count in spaces.

import java.util.Scanner;
import java.io.PrintWriter;	

public class Input_Based_File_Writer {
	static PrintWriter writer;
	
	public static void main(String args[]) {

		Scanner keyInput = new Scanner(System.in);
		String txtName, txtBody = null;

		try {
			try {
				  System.out.println("Enter a name of .txt file: ");
				  txtName = keyInput.next();
				writer = new PrintWriter(txtName);
				System.out.println("Enter a text body: ");
				txtBody = keyInput.next();
				writer.println(txtBody);
				}
			catch (Exception e) {
					System.out.println("The error is" + e);					
						}			
				}
			finally {
				writer.close();
				keyInput.close();
				}
			}
}
