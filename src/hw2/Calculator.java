package hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1, operand2;
        String sign;

        System.out.println("Enter the value of the operand 1: ");
        operand1 = scanner.nextInt();

        System.out.println("Enter the value of the operand 2: ");
        operand2 = scanner.nextInt();

        System.out.println("Enter operation sign: ");
        sign = scanner.next();

        System.out.println();

        switch (sign) {
            case "+":
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("You are dividing by zero. This is mistake!");
                    break;
                }
                System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                break;
            default:
                System.out.println("You entered an invalid operation sign.");
        }
    }
}
