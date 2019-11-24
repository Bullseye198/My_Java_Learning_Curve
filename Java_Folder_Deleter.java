//Written by Bullseye198

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.*;

public class Java_Folder_Deleter {

	static Scanner keyInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter folder path: ");			
		
		try {
			
			Files.walk(Paths.get(keyInput.nextLine()))
            	.sorted(Comparator.reverseOrder())
            	.map(Path::toFile)
            	//.filter(item -> !item.getPath().equals(keyInput.nextLine()))  This line is not needed.
            	.forEach(File::delete);
			System.out.println("Folder deletion successful.");
			
		} catch (IOException e) {
			System.out.println("No such folder exists.");
				//e.printStackTrace();  If you want the whole stack delete the //
		}		
	}
}
