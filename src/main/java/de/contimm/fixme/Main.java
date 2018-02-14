package de.contimm.fixme;

/**
 * @author Christopher Timm <christopher.timm@beskgroup.com> on 09.02.18
 */
public class Main {



  public static void main(String[] args) {
    BrokenCalculator brokenCalculator = new BrokenCalculator();
    Integer additionResult = brokenCalculator.add(1, 2);
    Integer substractionResult = brokenCalculator.subtract(5,4);
  }
}
