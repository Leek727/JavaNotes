import java.util.Arrays;
import java.util.Scanner;


class GuessingGame extends Utils {

  public static void main(String[] args) {

    int number, guess, count, input;
    int guesses[] = {};

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number from one to guess from:   ");
    input = scan.nextInt();
    count = findMaxGuesses(input) + 1;
    number = (int)(Math.random() * input)+1;

    System.out.println(String.format("You should be able to find the number in %d guesses", count));

    while (true) {
      System.out.print(String.format("\nGuess a number from 1-%d:    ", input));
      guess = scan.nextInt();
      String result = checkGuess(guess, number);
      if (result == "correct") {
        System.out.println(String.format("Your guess is correct. Number is %d", number));
        break;
      } else {
        --count;

        if (count == 0) {
          System.out.println("You lost. The number was " + number);
          break;
        }
        
        guesses = Utils.pushToIntArr(guesses, guess);
        System.out.print(String.format("Your guess was too %s.\n%d guesses left.\nGuesses so far: ", result, count));
        System.out.println(Arrays.toString(guesses));
      }
    }
    scan.close();
  }

  public static String checkGuess(int guess, int number) {

    return (
      (guess < number) ? "low" :
      (guess > number) ? "high" :
      (guess == number) ? "correct" : 
      "Invalid input"
    );
    
  }

  public static int findMaxGuesses(int input) {

    for (int i = 0; i < input ; i++) {
      if (Math.pow(2, i) >= input) {
        return i;
      } 
    }
    return 1000;

  }
  
}