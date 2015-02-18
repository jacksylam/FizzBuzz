/**
 * Created by Jack on 2/4/2015.
 * 
 * Prints Fizz, Buzz, or FizzBuzz depending if the number
 * is a multiple of 3, 5, or both.
 */
public class FizzBuzz {
  /**
   * Prints Fizz, Buzz, or FizzBuzz for numbers between 0 and 100.
   *
   * @param args Ignored.
   */
  public static void main(String[] args) {
    for (int i = 0; i < 101; i++) {
      System.out.println(intToString(i));
    }
  }

  /**
   * Converts an integer to the string, Fizz, Buzz, or FizzBuzz
   * depending if it's a multiple of 3, 5, or both.
   *
   * @param number Integer to convert.
   * @return Corresponding string.
   */
  public static String intToString(int number) {
    String convertedString;
    if ((number % 5 == 0) && (number % 3 == 0)) {
      convertedString = "FizzBuzz";
    }
    else if (number % 5 == 0) {
      convertedString = "Buzz";
    }
    else if (number % 3 == 0) {
      convertedString = "Fizz";
    }
    else {
      convertedString = Integer.toString(number);
    }
    return convertedString;
  }
}
