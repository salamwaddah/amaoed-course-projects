/**
 * ITE6104 - Lab 8
 * Abdulsalam Alaraj
 * AMA Computer University
 */
public class Lab8StudentRecord {
    private String name;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    public Lab8StudentRecord() {

    }

    /**
     * Overload the StudentRecord constructor with one that accepts 4 parameters
     * namely the name, mathGrade, englishGrade and scienceGrade.
     */
    public Lab8StudentRecord(String name, double mathGrade, double englishGrade, double scienceGrade) {
        setName(name);
        setMathGrade(mathGrade);
        setEnglishGrade(englishGrade);
        setScienceGrade(scienceGrade);
    }

    public double computeAverageGrade() {
        return (getMathGrade() + getEnglishGrade() + getScienceGrade()) / 3;
    }

    public String getName() {
        return name;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }
}
