/**
 * ITE6104 - Lab 4
 * Factorial
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Create a program that computes for the factorial of a number.
 * Factorial is the product of an integer and all the integers below it;
 * e.g., factorial four ( 4! ) is equal to 24 (4*3*2*1=24).
 * The factorial of 0 and 1 is 1.
 * Negative values are invalid input.
 * The program should display an error message and should loop back to data entry when an invalid input is encountered.
 */

import java.util.Scanner;

public class Lab4Factorial {
    public static void main(String[] args) {
        boolean again;

        do {
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
        } while (again);
    }
}
