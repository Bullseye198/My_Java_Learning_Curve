//after making some changes it still doesn't store text into .txt file...

import java.util.Scanner;
import java.io.PrintWriter;


public class Input_Based_File_Writer {
	public static PrintWriter writer;
	
	public void addRecords() {
		
	}
	
	public static void main(String args[]) {

		Scanner keyInput = new Scanner(System.in);
		String txtName, txtBody = null;		
        

		
		try {
			
			
			System.out.println("Enter the name of .txt file: ");
			txtName = keyInput.nextLine();
			writer = new PrintWriter(txtName);

			System.out.println("Enter the text body: ");
			writer.println(txtBody);
			txtBody = keyInput.nextLine();
			
			
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
		keyInput.close();
	}
}
