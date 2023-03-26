/**
 * ITE6104 - Lab 4
 * Number to words
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Create a program that converts number to words.
 * The program will prompt the user to input a number and display the equivalent number in words.
 * The program can accept numbers from 1 to 100,000. Negative numbers, zero and numbers greater than 100,000 are invalid input.
 * The program should display the message “Number is out of range!” should loop back to data entry when an invalid input is encountered.
 */

import java.util.Scanner;

public class Lab4NumberToWords {
    public static void main(String[] args) {
        boolean invalid;

        do {
            invalid = false;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = scan.nextInt();

            if (number < 1 || number > 100000) {
                invalid = true;
                System.out.println("Number is out of range!");
            } else {
                System.out.println(convertNumberToWords(number));
            }
        } while (invalid);
    }

    /**
     * This is a recursive method that isn't yet taught in the course.
     * I am using this kind of method because it's the most efficient for this task
     * Hope you don't mind
     * Abdulsalam Alaraj, AMA University computer student
     */
    private static String convertNumberToWords(int number) {
        String wordsResult = "";

        String[] unitsArray = {
                "Zero", // array index starts at zero
                "One",
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Eight",
                "Nine",
                "Ten",
                "Eleven",
                "Twelve",
                "Thirteen",
                "Fourteen",
                "Fifteen",
                "Sixteen",
                "Seventeen",
                "Eighteen",
                "Nineteen"
        };

        String[] tensArray = {
                "Zero",
                "Ten",
                "Twenty",
                "Thirty",
                "Forty",
                "Fifty",
                "Sixty",
                "Seventy",
                "Eighty",
                "Ninety"
        };

        if ((number / 1000000) > 0) {
            wordsResult += convertNumberToWords(number / 1000000) + " Million ";
            number %= 1000000;
        }

        if ((number / 1000) > 0) {
            wordsResult += convertNumberToWords(number / 1000) + " Thousand ";
            number %= 1000;
        }

        if ((number / 100) > 0) {
            wordsResult += convertNumberToWords(number / 100) + " Hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                wordsResult += unitsArray[number];
            } else {
                wordsResult += tensArray[number / 10];
                if ((number % 10) > 0) {
                    wordsResult += " " + unitsArray[number % 10];
                }
            }
        }

        return wordsResult;
    }
}