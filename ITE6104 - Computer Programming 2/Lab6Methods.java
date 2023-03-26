/**
 * ITE6104 - Lab 6
 * Methods
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Write a circle calculator program that computes the area, circumference and diameter of a circle.
 * The program will accept input number (radius) and that number will be used to get the area,
 * circumference and diameter of a circle. This time you are going to use separate methods for each computation.
 * For example, to get the value of area you need to write method area that has radius parameter and returns double value.
 * Use this formula to find the area, circumference and diameter of a circle:
 * 1.	Π = 3.14
 * 2.	Area = πr2
 * 3.	Diameter = 2r
 * 4.	Circumference = 2πr
 */

import java.util.Scanner;

public class Lab6Methods {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the circle radius: ");
        int radius = scanner.nextInt();

        double area = computeArea(radius);
        double diameter = computeDiameter(radius);
        double circumference = computeCircumference(radius);

        System.out.println("The area is: " + area);
        System.out.println("The diameter is: " + diameter);
        System.out.println("The circumference is: " + circumference);
    }

    public static double computeArea(int radius) {
        return PI * (radius * radius);
    }

    public static double computeDiameter(int radius) {
        return 2 * radius;
    }

    public static double computeCircumference(int radius) {
        return 2 * PI * radius;
    }
}
