//Written by Bullseye198
import java.util.Scanner;
public class My_age_Program {

	public static void main(String args[]) {
	
	Scanner keyInput = new Scanner (System.in);
	int age;
	String name;	
		
	System.out.println("Enter your name: ");
	name = keyInput.nextLine();
		
	System.out.println("Enter your age: ");
	age = keyInput.nextInt();	
		
	if(age <= 18) {
	        System.out.println(name + ", you are too young for this page!");
	} else if (age <= 30) {
		System.out.println(name + ", your access is granted, young padawan!");
	} else if (age <= 45) {
		System.out.println(name + ", you should be on Github!");
	} else if (age <= 65) {
		System.out.println(name + ", take the red pill!");
	} else if (age <= 85) {
		System.out.println(name + ", you should senior developer by this point!");
	} else {
		System.out.println (name + ", let's be real, you will not reach this age...");
	}
	keyInput.close();
	}
	
	
}
