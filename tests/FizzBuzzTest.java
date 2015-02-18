import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for FizzBuzz.
 */
public class FizzBuzzTest {

  /**
   * Tests intToString for correctness.
   * Multiples of 3 returns "Fizz".
   * Multiples of 5 returns "Buzz".
   * Multiples of 3 and 5 return "FizzBuzz".
   *
   * @throws Exception Error if wrong string is returned for the integer.
   */
  @Test
  public void testIntToString() throws Exception {
    assertEquals("Fizz", "Fizz", FizzBuzz.intToString(9));
    assertEquals("Buzz", "Buzz", FizzBuzz.intToString(10));
    assertEquals("FizzBuzz", "FizzBuzz", FizzBuzz.intToString(30));
    assertEquals("FizzBuzz", "FizzBuzz", FizzBuzz.intToString(60));
  }
}