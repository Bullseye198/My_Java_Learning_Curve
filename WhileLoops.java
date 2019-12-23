//Written by Bullseye198

public class WhileLoops {

	public static void main(String[] args) {
		
		int a = 0;
		
		while(a <= 5) {
			System.out.println("a is less than 10: " + a);
			a++;
		}
/*
While loop keep repeating the code forever until a trigger that you specify appears
So here the code will repeat forever until a is less than 10
For now this and For loops are basically the same. 
Let's see the difference below:
*/
	
		do {
			System.out.println("a");
		} while(a <= 2);
		
/*
The difference between the while and do while loop is that the do while will always do what
is in the { } first.
The flow is: do this first, and then check if a is equal to 2.
*/
	}
}