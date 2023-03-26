/**
 * ITE6104 - Lab 9
 * Abdulsalam Alaraj
 * AMA Computer University
 */

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab9JOptionPane {
    public static void main(String[] args) {
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
