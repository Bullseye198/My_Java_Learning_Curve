//Written by Bullseye198

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Java_File_Deleter {

static Scanner keyInput = new Scanner(System.in);	

	public static void main(String[] args) {
		
		System.out.println("Enter file path: ");
		
		try {
			Files.deleteIfExists(Paths.get(keyInput.nextLine()));  //after entering file path, this file will be deleted
			System.out.println("File deleted.");
			
		} 	catch (FileNotFoundException e) {
				System.out.println("File doesn't exist " + e);
				e.printStackTrace();
		}
			catch (IOException e) {
				System.out.println("Exception " + e);
				e.printStackTrace();
		}
	  }
	}
