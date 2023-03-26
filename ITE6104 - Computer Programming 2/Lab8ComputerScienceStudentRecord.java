/**
 * ITE6104 - Lab 8
 * Abdulsalam Alaraj
 * AMA Computer University
 * Create a class that will inherit the attributes and methods of the StudentRecord class
 * and name it ComputerScienceStudentRecord.
 * Use the extends keyword for inheritance.
 */
public class Lab8ComputerScienceStudentRecord extends Lab8StudentRecord {
    // The  ComputerScienceStudentRecord class will only have a comprogGrade attribute of double data type.
    private double comProgGrade;

    // Its constructor should accept 5 parameters namely the name, mathGrade, englishGrade, scienceGrade and comprogGrade.
    public Lab8ComputerScienceStudentRecord(String name, double mathGrade, double englishGrade, double scienceGrade, double comProgGrade) {
        // Inside the ComputerScienceStudentRecord constructor, use the super keyword to call on the constructor of the StudentRecord and be able to assign the first 4 parameters.
        super(name, mathGrade, englishGrade, scienceGrade);

        // The value of the last parameter will be assigned to comprogGrade.
        setComProgGrade(comProgGrade);
        printReport();
    }

    /**
     * Override the computeAverageGrade method of the StudentRecord class in the ComputerScienceStudentRecord class.
     * The result should be the average grade from the 4 subjects, Math, English, Science and Computer Programming.
     */
    public double computeAverageGrade() {
        return (getMathGrade() + getEnglishGrade() + getScienceGrade() + getComProgGrade()) / 4;
    }

    public void printReport() {
        System.out.println("Name: " + getName());
        System.out.println("Math: " + getMathGrade());
        System.out.println("English: " + getEnglishGrade());
        System.out.println("Science: " + getScienceGrade());
        System.out.println("Computer Programming: " + getComProgGrade());
        System.out.println("AVERAGE GRADE: " + computeAverageGrade());
    }

    public double getComProgGrade() {
        return comProgGrade;
    }

    public void setComProgGrade(double comProgGrade) {
        this.comProgGrade = comProgGrade;
    }
}
