package com.epam.training.aliaksei_lutskevich;

public class Calculator extends CalculationUtils {

  public double add(double a, double b) {
    return getResult(a + b);
  }

  public double subtract(double a, double b) {
    return getResult(a - b);
  }

  public double multiply(double a, double b) {
    return getResult(a * b);
  }

  public double divide(double a, double b) {
    if (b == 0) {
      System.out.println("Division by zero is prohibited");
      System.exit(0);
    }
    return getResult(a / b);
  }

}
