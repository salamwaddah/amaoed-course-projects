/**
 * ITE6104 - Lab 5
 * Odd and Even Numbers in the Array
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Create a program that displays the odd and even numbers from the elements stored in the array.
 * You are required to use an array and loop statement for this activity.
 * The program should prompt the user to enter 10 numbers.
 * Those numbers should be stored in an array.
 * Traverse the array using loop statement to identify the odd and even numbers.
 * Then display the even and odd numbers separately.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Lab5OddEvenNumbers {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] numbers = new int[arraySize];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] odds = new int[arraySize];
        int[] evens = new int[arraySize];

        for (int n = 0; n < numbers.length; n++) {
            if (numbers[n] % 2 == 0) { // remainder is zero so it's even
                evens[n] = numbers[n];
            } else {
                odds[n] = numbers[n];
            }
        }

        System.out.println("Even numbers: ");
        for (int e = 0; e < evens.length; e++) {
            if (evens[e] != 0) {
                System.out.println(evens[e]);
            }
        }

        System.out.println();

        System.out.println("Odd numbers: ");
        for (int o = 0; o < odds.length; o++) {
            if (odds[o] != 0) {
                System.out.println(odds[o]);
            }
        }
    }
}
