package de.contimm.fixme;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Christopher Timm <christopher.timm@beskgroup.com> on 14.02.18
 */
public class BrokenCalculatorTest {

  private BrokenCalculator brokenCalculator = new BrokenCalculator();

  /**
   * The add method has two problems. One causes the test to fail. The other doesn't cause the test to fail,
   * but should still be fixed. Please fix the test and find the second problem.
   */
  @Test
  public void add() {
    Integer addResult = brokenCalculator.add(1, "2");
    assertEquals((Integer) 3, addResult);
  }

  /**
   * Fix the calculation of the root of input.
   */
  @Test
  public void root() {
    Double rootResult = brokenCalculator.root(10);
    assertEquals((Double) 3.1622776601683795, rootResult);
  }

  /**
   * Fix the error in the substract method
   */
  @Test
  public void substract() {
    Integer subtractionResult = brokenCalculator.subtract(5, 4);
    assertEquals((Integer) 1, subtractionResult);
  }

  @Test
  public void concat() {
    String concatResult = brokenCalculator.concat("This is ", null, "a sentence ", "", "made of words");
    assertEquals("This is a sentence made of words", concatResult);
  }
}