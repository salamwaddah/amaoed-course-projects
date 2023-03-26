/**
 * ITE6104 - Lab 5
 * Student Information List
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Given the following multidimensional array that contains Student information list:
 * String entry = {{"010", "John", "Male", "21"},
 * {"011", "Mary", "Female", "25"},
 * {"012", "Joseph", "Male", "24"},
 * {"013", "Peter", "Male", "22"}};
 * Use nested loops in dsiplaying the entries on screen with the following format:
 * ID: 010
 * Name: John
 * Gender: Male
 * Age: 21
 */

public class Lab5StudentInformation {
    public static void main(String[] args) {
        String[][] entries = {
                {"010", "John", "Male", "21"},
                {"011", "Mary", "Female", "25"},
                {"012", "Joseph", "Male", "24"},
                {"013", "Peter", "Male", "22"}
        };

        for (int row = 0; row < entries.length; row++) {
            System.out.println();
            System.out.println("ID: " + entries[row][0]);
            System.out.println("Name: " + entries[row][1]);
            System.out.println("Gender: " + entries[row][2]);
            System.out.println("Age: " + entries[row][3]);
        }
    }
}
