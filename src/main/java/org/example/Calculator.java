package org.example;

import java.util.Scanner;

public class Calculator {

    public Calculator() {
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        double num1,num2;

        System.out.println("Enter Numbers");
        num1 = scanner.nextDouble();

        System.out.println("Factorial of " + num1 + " is : " + calculator.factorial(num1));

        System.out.println("\n");
    }

    public double factorial(double num1) {
        double result = fact(num1);
        return result;
    }

    public double fact(double num) {
        double res = 1;
        for(int i = 1; i <= num; ++i) {
            res *= i;
        }
        return  res;
    }
}