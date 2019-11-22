//Written by Bullseye198

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Java_File_Deleter {

static Scanner keyInput = new Scanner(System.in);	

	public static void main(String[] args) {
		
		System.out.println("Enter file path: ");
		
		//after entering file path, this file will be deleted		
		try {
			Files.delete(Paths.get(keyInput.nextLine()));
			System.out.println("File deleted.");
		
		//If user enters invalid file name, it will throw this exception.	
		}	catch (NoSuchFileException e) {
				System.out.println("File doesn't exist: " + e);
			
		}
			catch (IOException e) {
				System.out.println("File is not deleted: " + e);
		}
			finally {
				if (keyInput != null) {
				keyInput.close();
				}
	    }
	}
}
