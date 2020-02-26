//Written by Bullseye198

public class Recursion {

    public static void main (String[] args) {

        System.out.println (fact((long) 5));
    }

//This function repeates n * n-1 until it reaches 1, and then then return 1, 
//which gives us result 120.

    public static long fact (Long n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }
}
