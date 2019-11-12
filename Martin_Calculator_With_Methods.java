//Written by Bullseye198
import java.util.Scanner;
//Import Scanner so that program can store user input

public class Martin_Calculator_With_Methods{
  

  public static Scanner keyInput = new Scanner(System.in);
  //User keystrokes are stored in a variable named keyInput

  public static int firstNum;
  public static int secondNum;
  public static char operator;
  //Added operators
  public static int answer = 0;
  //Added three integers that we will use in our calculator



  public static void addition() {
	  answer = firstNum + secondNum;
	  
  }
  public static void subtraction() {
	  answer = firstNum - secondNum;
	  
  }
  public static void multiplication() {
	  answer = firstNum * secondNum;
	  
  }
  public static void division() {
	  answer = firstNum / secondNum;
	  
  }
  //added multiple methods
  
  public static void main(String args []) {
  
  System.out.println("Enter first number: ");
  firstNum = keyInput.nextInt();
  //Scanner value is added to firstNum variable

  System.out.println("Enter an operator: ");
  operator = keyInput.next().charAt(0);
  
  
  
  System.out.println("Enter second number: ");
  secondNum = keyInput.nextInt();
  
 
  if (operator == '+'){
	  addition();
	
  }
  //if statement always goes with double == to check if it's equal
  //do not enter char, and no edged brackets, otherwise it will not initialize
  
  else if (operator == '-') {
	 subtraction();  
  }

  else if (operator == '*') {
	  multiplication();  
  }
  else if(operator == '/'){
	  division();  
	  
  }
  else { 
	  System.out.println("Invalid operator");
  }
  
  System.out.println("Your answer is: ");
  System.out.println(answer);

  }
}
