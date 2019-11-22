//Now it works and it counts spaces in strings.

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Input_Based_File_Writer {

	public static void main(String args[]) throws FileNotFoundException {

		Scanner keyInput = new Scanner(System.in);

		System.out.println("Enter the name of .txt file: ");
		String txtName = keyInput.nextLine();
		System.out.println("Enter Path where to store your File: ");
		String filepath = keyInput.nextLine();
		String Path_and_Name = filepath + txtName;
		PrintWriter writer = new PrintWriter(Path_and_Name);

		System.out.println("Enter a text body: ");
		String txtBody = keyInput.nextLine();
		writer.println(txtBody);

		writer.close();
		keyInput.close();
		System.out.println("File has succesfully been written to " + txtName);
	}
}
