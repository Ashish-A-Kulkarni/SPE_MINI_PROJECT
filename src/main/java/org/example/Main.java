package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    public Main() {
    }

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Main calculator = new Main();

        Scanner scanner = new Scanner(System.in);

        double num1,num2;

        int ch,flag=1;

        do {
            System.out.println("\n-----------SCIENTIFIC CALCULATOR-------");

            System.out.println("\n1. Square Root \n2. Factorial \n3. Natural logarithm (base е) - ln(x) \n4. Power function \n5. Exit \nEnter your choice : ");

            ch = scanner.nextInt();

            switch (ch)
            {
                case 1:System.out.println("Enter a number ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square Root of " + num1 + " is : " + calculator.squareRoot(num1));
                    break;

                case 2:System.out.println("Enter a number ");
                    num1 = scanner.nextDouble();
                    System.out.println("Factorial of " + num1 + " is : " + calculator.factorial(num1));
                    break;

                case 3:System.out.println("Enter a number ");
                    num1 = scanner.nextDouble();
                    System.out.println("Natural Log [ln(x)] of " + num1 + " is : " + calculator.naturalLog(num1));
                    break;

                case 4:System.out.println("Enter a number ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter power ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1 + " to the power " + num2 + " is : " + calculator.powerFunction(num1,num2));
                    break;

                case 5:System.out.println("Exiting....... ");
                    flag=0;
                    break;

                default: System.out.println("Please enter correct choice");
                    break;
            }

        }while(flag==1);
    }

    public double factorial(double num1) {
        double result = 1;
        for(int i = 1; i <= num1; ++i) {
            result *= i;
        }
        logger.info("[FACTORIAL OF] : " + num1 + " [RESULT] : " + result);
        return  result;
    }

    public double squareRoot(double num1) {
        double result;
        result=Math.sqrt(num1);
        logger.info("[SQUARE ROOT OF] : " + num1 + " [RESULT] : " + result);
        return result;
    }

    public double naturalLog(double num1) {
        double result;
        result = Math.log(num1);
        logger.info("[NATURAL LOG OF] : " + num1 + " [RESULT] : " + result);
        return result;
    }

    public double powerFunction(double num1, double num2) {
        double result;
        result = Math.pow(num1,num2);
        logger.info("[POWER OF " + num1 + " TO " + num2 + "] [RESULT] : " + result);
        return result;
    }

}