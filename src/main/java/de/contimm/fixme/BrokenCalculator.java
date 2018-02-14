package de.contimm.fixme;

import java.util.Arrays;

/**
 * @author Christopher Timm <christopher.timm@beskgroup.com> on 14.02.18
 */
public class BrokenCalculator {

  public BrokenCalculator() {
  }

  /**
   * Add the values passed as arguments and return the result of the addition
   *
   * @param first  first value to add
   * @param second second value to add
   * @return result of addition
   */
  public Integer add(int first, Object second) {
    System.out.println("Adding " + first + " and " + second);
    return first + (int) second;
  }

  /**
   * Concat all the string parameters to one single string. Ignore null or empty values
   *
   * @param parameters array of parameters to be concatenated
   * @return the concatenated string without null or empty values
   */
  public String concat(String... parameters) {
    StringBuilder result = new StringBuilder();
    Arrays.asList(parameters).forEach(result::append);
    return result.toString();
  }

  /**
   * This method will caluclate the root for a number
   *
   * @param input the root of this number will be calculated
   * @return the result fo the calculation of the root
   */
  public Double root(int input) {
    System.out.println("Calculating root of " + input);

    boolean found = false;
    int i = 1;
    while (!found) {
      if (i * i == input) {
        found = true;
      } else {
        if (i * i > input) {
          System.err.println("root of " + input + " is not an integer");
          // throwing an assertion error, because correct calculation is not possible
          assert false;
        }
        i++;
      }
    }

    return (double) i;
  }

  /**
   * Substract the second value from the first
   *
   * @param first  value to be substracted from
   * @param second value to substract
   * @return result of substraction
   */
  public Integer subtract(int first, int second) {
    System.out.println("Calculating substraction for " + first + " and " + second);
    return second - first;
  }
}
