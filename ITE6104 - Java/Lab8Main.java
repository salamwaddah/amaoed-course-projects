/**
 * ITE6104 - Lab 8
 * Abdulsalam Alaraj
 * AMA Computer University
 * Create a class that would contain the main method and name it Lab8Main.
 */
public class Lab8Main {
    /**
     * In the main method, instantiate a ComputerScienceStudentRecord object that has 5 parameters.
     */
    public static void main(String[] args) {
        new Lab8ComputerScienceStudentRecord("Anna Manna", 71.23, 82.34, 93.45, 95.67);

        System.out.println();

        new Lab8Circle(4);
        new Lab8Square(5);
    }
}
