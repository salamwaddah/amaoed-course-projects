/**
 * ITE6104 - Lab 3
 * Abdulsalam Alaraj
 * AMA Computer University
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3_Alaraj_Abdulsalam {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    /**
     * Task 1
     * Circle Calculator.
     * Write a circle calculator program that computes the area, circumference and diameter of a circle.
     * The program will accept input number (radius) and that number will be used to get the area, circumference and diameter of a circle.
     * Use this formula to find the area, circumference and diameter of a circle:
     */
    public static void taskOne() {
        double PI = 3.14; // constant

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the circle radius: ");
        int radius = scan.nextInt();

        double area = PI * (radius * radius);
        double diameter = 2 * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println();
        System.out.println("Result");
        System.out.println("Area: " + area);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
    }

    /**
     * Task 2
     * Using JOptionPane,
     * create a program that will ask the user to enter their personal information, such as name, age, address and contact number.
     * The program should display all the information that the user have entered.:
     */
    public static void taskTwo() {
        String name;
        name = JOptionPane.showInputDialog("Name: ");

        String age;
        age = JOptionPane.showInputDialog("Age: ");

        String address;
        address = JOptionPane.showInputDialog("Address: ");

        String contactNumber;
        contactNumber = JOptionPane.showInputDialog("Contact number: ");

        String message = "User's personal information: \n\nName: " + name + "\nAge: " + age + "\nAddress: " + address + "\nContact number: " + contactNumber;

        JOptionPane.showMessageDialog(null, message);
    }
}
