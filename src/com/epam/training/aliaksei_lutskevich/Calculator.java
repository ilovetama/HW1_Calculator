package com.epam.training.aliaksei_lutskevich;

public class Calculator {

  public double add(double a, double b) {
    return CalculationUtils.getResult(a + b);
  }

  public double subtract(double a, double b) {
    return CalculationUtils.getResult(a - b);
  }

  public double multiply(double a, double b) {
    return CalculationUtils.getResult(a * b);
  }

  public double divide(double a, double b) {
    if (b == 0) {
      System.out.println("Division by zero is not allowed");
      System.exit(0);
    }
    return CalculationUtils.getResult(a / b);
  }

}
