/**
 * ITE6104 - Lab 9
 * Abdulsalam Alaraj
 * AMA Computer University
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab9CircleCalculator {
    public static void main(String[] args) {
        System.out.println("****** CIRCLE CALCULATOR ******");
        boolean valid;

        do {
            valid = false;

            try {
                double PI = 3.14;
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter the circle radius: ");
                int radius = scan.nextInt();

                double area = PI * (radius * radius);
                double diameter = 2 * radius;
                double circumference = 2 * PI * radius;

                System.out.println("Radius: " + radius);
                System.out.println();
                System.out.println("Result");
                System.out.println("\tArea: " + area);
                System.out.println("\tDiameter: " + diameter);
                System.out.println("\tCircumference: " + circumference);
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT!");
                valid = true;
            }
        } while (valid);
    }
}
