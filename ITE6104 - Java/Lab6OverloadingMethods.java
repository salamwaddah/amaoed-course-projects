/**
 * ITE6104 - Lab 6
 * Overloading methods
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Write a program that calls overloading methods named average.
 * The average methods return the computed average value of the parameters.
 * The average methods can be called with 3,4,5 or 6 int arguments.
 */

public class Lab6OverloadingMethods {
    public static void main(String[] args) {
        double firstMethod = average(1, 2);
        double secondMethod = average(1, 2, 3);

        System.out.println(firstMethod);
        System.out.println(secondMethod);
    }

    public static double average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public static double average(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber) / 3;
    }
}
