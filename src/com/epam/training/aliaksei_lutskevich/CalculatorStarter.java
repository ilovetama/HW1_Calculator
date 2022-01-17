package com.epam.training.aliaksei_lutskevich;

public class CalculatorStarter extends CalculationUtils {

  public static void main(String[] args) {
    Calculator calculate = new Calculator();
    double firstNumber = getNumber();
    double secondNumber = getNumber();
    char operation = getOperation();
    double result = calculate.calculation(operation, firstNumber, secondNumber);
    System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
  }
}
