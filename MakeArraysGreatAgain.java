import java.util.Arrays;
import java.util.Scanner;

public class MakeArraysGreatAgain {

	public static void main (String args []) {
		
		String [] names = {"Pero", "Duro", "Stevo", "Marko"};
		Scanner keyInput = new Scanner (System.in);
		
		System.out.println(Arrays.toString(names));  //this line prints out all the names from an array
		System.out.println("Choose a name entering number 0, 1, 2 or 3:");
		
		int index = keyInput.nextInt(); //this way user can pick up item from an array
		System.out.println(names[index]);
		
		keyInput.close();
	}
}