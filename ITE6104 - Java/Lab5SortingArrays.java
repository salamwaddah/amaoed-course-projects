/**
 * ITE6104 - Lab 5
 * Sorting Arrays
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Create a program that sort array of numbers in ascending or descending order.
 * The program should prompt the user to enter length of the array, then prompt the user to enter a list of numbers.
 * The value that the user has entered in the length of the array will be the basis for the number of times the user will enter.
 * For example, the user has entered 3 for the length of the array,
 * the user again will be asked to enter 3 numbers. After the user enters a list of numbers,
 * ask the user if it’s going to sort the array in ascending or descending order.
 * Then display the sorted number based from the user's choice
 */

import java.util.Scanner;

public class Lab5SortingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Sort array in ascending order? [1 = yes, 0 = no]: ");
        int sortingInput = scanner.nextInt();
        String order = sortingInput == 1 ? "ascending" : "descending";

        System.out.println("Sorted elements in " + order + " order: ");

        int tmp;
        if (sortingInput == 1) {
            for (int i = 0; i < arraySize; i++) {
                for (int j = i + 1; j < arraySize; j++) {
                    if (numbers[i] > numbers[j]) {
                        tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                    }
                }
            }
        } else {
            for (int i = 0; i < arraySize; i++) {
                for (int j = i + 1; j < arraySize; j++) {
                    if (numbers[i] < numbers[j]) {
                        tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                    }
                }
            }
        }

        for (int n = 0; n < numbers.length; n++) {
            System.out.println(numbers[n]);
        }
    }
}
