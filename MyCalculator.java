import java.util.Scanner;
//Import Scanner so program can store user input

public class MyCalculator{
  public static void main(String args []) {

  Scanner keyInput = new Scanner(System.in);
  //User keystrokes are stored in a variable named keyInput

  int firstNum;
  int secondNum;
  int answer;
  //Added three integers that we will use in our calculator

  System.out.println("Enter first number: ");
  firstNum = keyInput.nextInt();
  //Scanner value is added to firstNum variable

  System.out.println("Enter second number: ");
  secondNum = keyInput.nextInt();

  answer = firstNum + secondNum;
  //Answer adds what ever is stored in firsNum and secondNum variables

  System.out.println("Your answer is: ");
  System.out.println(answer);
  }
}