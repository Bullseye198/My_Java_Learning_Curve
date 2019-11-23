import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.*;

public class Java_Folder_Deleter {

	static Scanner keyInput = new Scanner(System.in);
	static Path dir = null;
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter folder path: ");			

		try {
			Files.delete(Paths.get(keyInput.nextLine())); //This object will locate file in the system.  
			Files.delete(dir);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Folder deletion successful.");
	}
}