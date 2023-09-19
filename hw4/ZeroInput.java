package ua.ithillel.lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZeroInput {
    static double sum = 0;
    static double number; //

    public static void main(String[] args) {

        while (true) {
            System.out.println("Please input the number");
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextDouble();
                if (number == 0) {
                    break;
                }
                sum += number;
            } catch (InputMismatchException e) {
                System.out.println("The entered value is not a number");
            }
        }
        System.out.println("Sum of all numbers is " + sum);
    }
}
