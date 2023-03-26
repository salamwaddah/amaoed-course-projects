/**
 * ITE6104 - Lab 8
 * Abdulsalam Alaraj
 * AMA Computer University
 */
public abstract class Lab8Shape {
    protected double unit;

    public Lab8Shape(double unit) {
        this.unit = unit;
    }

    public String getName() {
        return "";
    }

    public double getArea() {
        return this.unit;
    }
}
