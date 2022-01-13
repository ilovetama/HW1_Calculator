package com.epam.training.aliaksei_lutskevich;

import java.util.Scanner;

public class Calculator implements ICalculator {

    private int precision = 2;

    public static void main(String[] args) {

        Calculator calculate = new Calculator();
        double firstNumber = getNumber();
        double secondNumber = getNumber();
        char operation = getOperation();
        calculate.operation(operation,firstNumber,secondNumber);

    }

    public double getResult(double result){
        result = Math.round((result)*(int)Math.pow(10.0, precision))/(double)Math.pow(10.0, precision);
        return result;
    }

    public static double getNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        if (scanner.hasNextDouble()) {
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
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Operation is incorrect. Try again");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public double operation(char operation, double firstNumber, double secondNumber) {
        Calculator calculate = new Calculator();
        double result = 0;
        switch (operation) {
            case '+': result = calculate.add(firstNumber,secondNumber);
                break;
            case '-': result = calculate.subtract(firstNumber,secondNumber);
                break;
            case '*': result = calculate.multiply(firstNumber,secondNumber);
                break;
            case '/': result = calculate.divide(firstNumber,secondNumber);
                break;
            default:
                System.out.println("Operation is incorrect. Try again");
        }
        return result;
    }

    @Override
    public double add(double a, double b) {
        double addResult = getResult(a + b);
        System.out.println("The result is: " +addResult);
        return addResult;
    }

    @Override
    public double subtract(double a, double b) {
        double subtractResult = getResult(a - b);
        System.out.println("The result is: " +subtractResult);
        return subtractResult;
    }

    @Override
    public double multiply(double a, double b) {
        double multiplyResult = getResult(a * b);
        System.out.println("The result is: " +multiplyResult);
        return multiplyResult;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0){
            System.out.println("Division by zero is prohibited");
            System.exit(0);
        }
        double divideResult = getResult(a / b);
        System.out.println("The result is: " +divideResult);
        return divideResult;
    }
}
