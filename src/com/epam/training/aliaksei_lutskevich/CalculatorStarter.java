package com.epam.training.aliaksei_lutskevich;

public class CalculatorStarter {

  public static void main(String[] args) {

    double firstNumber = CalculationUtils.getNumber();
    double secondNumber = CalculationUtils.getNumber();
    char operation = CalculationUtils.getOperation();
    double result = CalculationUtils.calculation(operation, firstNumber, secondNumber);
    System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);

  }

}
