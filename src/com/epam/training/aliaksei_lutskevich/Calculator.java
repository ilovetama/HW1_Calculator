package com.epam.training.aliaksei_lutskevich;

import java.util.Scanner;

public class Calculator implements ICalculator {

    private int precision = 2;

    public static void main(String[] args) {

        Calculator calculate = new Calculator();
        double firstNumber = getNumber();
        double secondNumber = getNumber();
        char operation = getOperation();
        double result = calculate.switchOperation(operation,firstNumber,secondNumber);
        System.out.println("The result is: " + result);
    }

    public double getResult(double result){
        return Math.round((result)*(int)Math.pow(10.0, precision))/ Math.pow(10.0, precision);
    }

    public static double getNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        if (scanner.hasNext("\\d*") && scanner.hasNext("^[^\\s]*$")) {
            return scanner.nextDouble();
        } else {
            System.out.println("Number is incorrect. Try again");
            return getNumber();
        }
    }

    public static char getOperation () {
        System.out.println("Enter the operation (+, -, *, /):");
        Scanner scanner = new Scanner(System.in);
        char operation;
        if (scanner.hasNext("[+*/-]")) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Operation is incorrect. Try again");
            operation = getOperation();
        }
        return operation;
    }

    public double switchOperation(char operation, double firstNumber, double secondNumber) {
        Calculator calculate = new Calculator();
        return switch (operation) {
            case '+' -> calculate.add(firstNumber, secondNumber);
            case '-' -> calculate.subtract(firstNumber, secondNumber);
            case '*' -> calculate.multiply(firstNumber, secondNumber);
            case '/' -> calculate.divide(firstNumber, secondNumber);
            default -> 0;
        };
    }

    @Override
    public double add(double a, double b) {
        return getResult(a + b);
    }

    @Override
    public double subtract(double a, double b) {
        return getResult(a - b);
    }

    @Override
    public double multiply(double a, double b) {
        return getResult(a * b);
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0){
            System.out.println("Division by zero is prohibited");
            System.exit(0);
        }
        return getResult(a / b);
    }
}
