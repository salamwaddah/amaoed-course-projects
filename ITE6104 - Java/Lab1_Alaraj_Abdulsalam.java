/**
 * ITE6104 - Lab 1
 * Abdulsalam Alaraj
 * AMA Computer University
 */

// Declare Class, class name must match the file name, Lab1AlarajAbdulsalam
public class Lab1_Alaraj_Abdulsalam {
    public static void main(String[] args) {
        // Call task one
        taskOne();

        // New line to separate task one from task 2
        System.out.println("\n");

        // Call task two
        taskTwo();
    }

    /**
     * Task 1
     * Write a program that will display the text below.
     */
    public static void taskOne() {
        System.out.println("I am writing a program that will display \"text\" with escape characters.");
        System.out.print("\tAt the beginning of this sentence it has tab escape character.");
        System.out.println("\n\n");
        System.out.println("There are two new lines before this sentence and you also have to include 'single quote' and \\back slash\\ characters in this sentence.");
    }

    /**
     * Task 2
     * From the given the table below, write a program that display the variable names together with the values.
     * The variables should have valid names (should follow coding guidelines),
     * correct initial value and data types that fit on the initial value.
     * Write comments for each statement.
     * The comment should clearly describe the statement.
     */
    public static void taskTwo() {
        // declare double variable for gross sales
        double grossSales = 0.0;

        // declare integer variable for age
        int age = 1;

        // declare boolean variable for final, we called it isFinal because the identifier final is a booked java word
        boolean isFinal = false;

        // Integer hexadecimal literal
        int location = 0x11;

        // Integer octal literal, evaluates to literal 55
        int oldFile = 067;

        // Char type for the variable default, we called it _default because the identifier default is booked java word
        char _default = 'a';

        // Just a string for name
        String name = "noname";

        // Printing the report. the '+' is to concatenate
        System.out.println("Gross sales = " + grossSales);
        System.out.println("Age = " + age);
        System.out.println("Final = " + isFinal);
        System.out.println("Location = " + location);
        System.out.println("Old File = " + oldFile);
        System.out.println("Default = " + _default);
        System.out.println("Name = " + name);
    }
}
