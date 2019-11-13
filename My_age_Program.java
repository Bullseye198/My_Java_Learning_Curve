import java.util.Scanner;
public class My_age_Program {

	public static Scanner keyInput = new Scanner (System.in);
	public static int age;
	public static String name;
	
	public static void main(String args[]) {
	System.out.println("Enter your name: ");
	name = keyInput.nextLine();
		
	System.out.println("Enter your age: ");
	age = keyInput.nextInt();	
		
	if(age <= 18) {
	System.out.println(name + ", you are too young for PornHub!");
	} else if (age <= 30) {
		System.out.println(name + ", your fap is granted, young padawan!");
	} else if (age <= 45) {
		System.out.println(name + ", you should be on mature + website!");
	} else if (age <= 65) {
		System.out.println(name + ", take the blue pill!");
	} else if (age <= 85) {
		System.out.println(name + ", you should call an undertaker!");
	} else {
		System.out.println (name + ", let's be real, you will not reach this age...");
	}
	keyInput.close();
	}
	
	
}
