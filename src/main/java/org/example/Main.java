package org.example;

import java.util.Scanner;

public class Main {

    public Main() {
    }
    public static void main(String[] args) {

        Main calculator = new Main();

        Scanner scanner = new Scanner(System.in);

        double num1,num2;
        System.out.println("-----------SCIENTIFIC CALCULATOR-------");
        System.out.println("Enter Numbers");
        num1 = scanner.nextDouble();

        System.out.println("Factorial of " + num1 + " is : " + calculator.factorial(num1));

        System.out.println("\n");
    }

    public double factorial(double num1) {
        double result = 1;
        for(int i = 1; i <= num1; ++i) {
            result *= i;
        }
        return  result;
    }




}