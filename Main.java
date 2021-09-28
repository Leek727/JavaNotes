
//package java.util.concurrent.TimeUnit
// leeks again again
import java.util.HashMap;

class Main { // Collection of functions and variables (Inherently Public)
    public static void main(String[] args) { // Must have Function Main(). Public means that it can be accessed by other
                                             // files.
        int num = 1; // Declare num as an integer
        System.out.println("Hello world!"); // Uses System class to print string to Console

        double doub = 5.555555555555; // double
        float fl = 5.334f;
        long very_long = 9223372036854775807L;
        boolean bool = true;
        boolean bool2 = false;

        System.out.println(add(5, 5)); // add returns an int

        String s = "Dont Iterate me :("; // Creates String datatype
        iterate(s); // Call function

        System.out.println(greater_than(1, 2));
        System.out.println(greater_than(2, 1));
        fizzbuzz();

    }

    public static boolean greater_than(int a, int b) {
        if (a > b) {
            return true;
        } else if (a <= b) {
            return false;
        } else {
            return false;
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void iterate(String s) {

        for (int i = 0; i < s.length(); i++) // For loop follows format: inittilization, conditional, and something that
                                             // happens when the loop completes. In this case, the variable i is
                                             // created, then at the end of the loop it checks if i < the length of the
                                             // string and adds one to i.
        {
            System.out.println(s.charAt(i));
        }
    }

    public static void fizzbuzz() {
        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz"); // if statments will execute the code within them if the conditional in
                                                // the () is true.
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    };
}
