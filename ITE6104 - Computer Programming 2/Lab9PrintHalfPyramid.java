/**
 * ITE6104 - Lab 9
 * Abdulsalam Alaraj
 * AMA Computer University
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab9PrintHalfPyramid {
    public static void main(String[] args) {
        boolean invalid;

        do {
            try {
                invalid = false;
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter number: ");

                int number = scan.nextInt();

                if (number < 3) {
                    invalid = true;
                    System.out.println("Invalid input: number must be more than 2");
                } else {
                    for (int row = 1; row <= number; row++) {
                        int column = row;
                        String stars = "";

                        while (column > 0) {
                            stars += "* ";
                            column--;
                        }
                        System.out.println(stars);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT!");
                invalid = true;
            }
        } while (invalid);
    }
}
