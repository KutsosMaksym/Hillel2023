package ua.ithillel.lesson4;
import java.util.Scanner;

public class InputZero {
    static double sum = 0;
    static double number;
    static String scanResult;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please input the number");
            try {
                scanResult = scanner.next();
                number = Double.parseDouble(scanResult);
                if (number == 0) {
                    break;
                }
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("The entered value is not a number");
            }
        }
        System.out.println("Sum of all numbers is " + sum);
    }
}
