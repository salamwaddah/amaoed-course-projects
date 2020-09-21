/**
 * ITE6104 - Lab 5
 * Minimum and Maximum Number in the Array
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Create a program that displays the minimum and maximum number to the elements stored in the array.
 * You are required to use an array and loop statement for this activity.
 * The program should prompt the user to enter 10 numbers.
 * Those numbers should be stored in an array.
 * Traverse the array using loop statement to find the minimum and maximum number.
 * Then display the found minimum and maximum number.
 */

import java.util.Scanner;

public class Lab5MinimumMaximumNumber {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] numbers = new int[arraySize];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int n = 0; n < numbers.length; n++) {
            if (numbers[n] < min) {
                min = numbers[n];
            }

            if (numbers[n] > max) {
                max = numbers[n];
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
