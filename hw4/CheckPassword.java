package ua.ithillel.lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckPassword {
    static String password = "qwerty123";
    static String inputtedPassword;
    //

    public static void main(String[] args) {

        while (true) {
            System.out.println("Please input the password");
            Scanner scanner = new Scanner(System.in);
            if (scanner.next().equals(password)) {
                System.out.println("Password is correct");
                break;
            } else {
                System.out.println("Password is invalid");
            }
        }
    }
}
