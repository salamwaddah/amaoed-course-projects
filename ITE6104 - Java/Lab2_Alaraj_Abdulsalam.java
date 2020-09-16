/**
 * ITE6104 - Lab 2
 * Abdulsalam Alaraj
 * AMA Computer University
 */


public class Lab2_Alaraj_Abdulsalam {
    public static void main(String[] args) {
        oddOrEven();
        computeTaskTwo();
    }

    /**
     * Task 1
     * Write a program that will identify odd or even number.
     * You need to declare a variable with initial value, that value will be checked whether it is odd or even number.
     * You can use ? operator to test whether the number is odd or even. The sample output is:
     * number: 5
     * 5 is an odd number
     */
    public static void oddOrEven() {
        int number = 5;
        String result;

        result = (number % 2) > 0 ? "odd" : "even";

        System.out.println("Task one");
        System.out.println(number + " is an " + result + " number");
        System.out.println();
    }

    /**
     * Task 2
     * Write a program that will declare and initialize 2 integer variables.
     * The program should compute the sum, difference, product, quotient (first integer/second integer) and average of the 2 integers.
     * It should also determine the maximum (higher value) and the minimum (smaller value) between the two.
     * Use the ? operator to implement the max and min value.
     */
    public static void computeTaskTwo() {
        int firstInteger = 25;
        int secondInteger = 3;

        int sum = firstInteger + secondInteger;
        int difference = firstInteger - secondInteger;
        int product = firstInteger * secondInteger;
        double quotient = (double) firstInteger / (double) secondInteger;
        float average = (firstInteger + secondInteger) / 2;
        int maxInteger = (firstInteger > secondInteger) ? firstInteger : secondInteger;
        int minInteger = (firstInteger < secondInteger) ? firstInteger : secondInteger;

        System.out.println("Task two");

        System.out.println("First integer: " + firstInteger);
        System.out.println("Second integer: " + secondInteger);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Average: " + average);
        System.out.println("Max integer: " + maxInteger);
        System.out.println("Min integer: " + minInteger);
    }
}
