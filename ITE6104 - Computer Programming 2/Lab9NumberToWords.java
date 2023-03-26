/**
 * ITE6104 - Lab 9
 * Abdulsalam Alaraj
 * AMA Computer University
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab9NumberToWords {
    public static void main(String[] args) {
        boolean invalid;

        do {
            try {
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
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT!");
                invalid = true;
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