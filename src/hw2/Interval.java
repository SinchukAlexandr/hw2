package hw2;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter integer value:");
        number = scanner.nextInt();
        if (-1 < number && number < 15) {
            System.out.println("You entered a number in between [0-14]");
        } else if (14 < number && number < 36) {
            System.out.println("You entered a number in between [15-35]");
        } else if (35 < number && number < 51) {
            System.out.println("You entered a number in between [36-50]");
        } else if (50 < number && number < 101) {
            System.out.println("You entered a number in between [51-100]");
        } else System.out.println("The entered number is less than zero or greater than 100.");
    }
}
