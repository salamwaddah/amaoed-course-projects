/**
 * ITE6104 - Lab 9
 * Abdulsalam Alaraj
 * AMA Computer University
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab9Factorial {
    public static void main(String[] args) {
        boolean again;

        do {
            try {
                again = false;
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int inputtedNumber = scan.nextInt();

                if (inputtedNumber < 0) {
                    again = true;
                    System.out.println("Invalid number");
                } else {
                    int number = inputtedNumber;
                    int result = 1;

                    while (number > 0) {
                        result *= number;
                        number--;
                    }

                    System.out.println("The factorial of " + inputtedNumber + " is " + result);
                }
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT!");
                again = true;
            }
        } while (again);
    }
}
