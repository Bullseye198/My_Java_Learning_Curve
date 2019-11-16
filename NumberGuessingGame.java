import java.util.Scanner;
public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		int number;
		int random = (int)(Math.random() * 5 + 1);  //this is a random int class.
		
	System.out.println("This is a Number Guessing game made by Bullseye198!");
	System.out.println("Enter a number from 1 to 5: ");
	number = keyInput.nextInt();
	if (number == random) {
		System.out.println ("Hooray, you guessed it!");}	//if you guess the number it will print out this message
	else {
		System.out.println("You missed it!");}
	
		System.out.println("The number was: " + random);	//if you miss the number it will print out this message
	keyInput.close();
	}

}