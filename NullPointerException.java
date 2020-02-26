//Written by Bullseye198

public class Nullpointer {

    public static void main(String []args) {

       //Let's make a variable that contains nothing:
       String name = null;

      //Now let's make that variable do something:
      
       System.out.println(name.length());


      //We will get an NullPointerException, since we pointing to a variable to do something, that contains nothing.
      //To fix this exception, we must put something into our object and then we can point at it:
      //String name = "Pencil";
      //Now our program will print out: "6".
    }
}
