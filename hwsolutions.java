// This is not goign to be pushed to git

class hwsolutions {
  public static void main(String[] args) {
    FizzTern();
  }

  public static void FizzTern() { // Footnote 1
    for (int i = 1; i <= 100; i++) {
      System.out.println(
        (i % 15 == 0) ? "FizzBuzz" :
        (i % 3 == 0) ? "Fizz" :
        (i % 5 == 0) ? "Buzz" : i
          );
    }
  }
}





// Footnotes
/* Footnote 1
In this solution of fizz buzz, we use a for loop to increment every
numer from 1 - 100. Instead of using normal "if" / "else if" 
statments, we use the ternary operator (?). The ternary operator 
executes as such: (condition) ? (what to do if true) : 
(next ternary condition)
If the first condition is false, then it will check the next 
conditional statment. 

(i % 15 == 0) ? "FizzBuzz" :  Check condition, print "FizzBuzz"
(i % 3 == 0) ? "Fizz" :       If condition is false, move to next
(i % 5 == 0) ? "Buzz" : i     If all conditions are false, print the 
number

*/