/**
 * ITE6104 - Lab 4
 * Print half pyramid using *
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Create a program that prints half pyramid using *.
 * The program will prompt the user to input a number,
 * the user’s input will be the number of * that will serve as the base of the half pyramid.
 * Values less than 2 are invalid input.
 * The program should display an error message and should loop back to data entry when an invalid input is encountered.
 */

import java.util.Scanner;

public class Lab4PrintHalfPyramid {
    public static void main(String[] args) {
        boolean invalid;

        do {
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
        } while (invalid);
    }
}
