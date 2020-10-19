/**
 * ITE6104 - Lab 8
 * Abdulsalam Alaraj
 * AMA Computer University
 */
public class Lab8Square extends Lab8Shape {
    public Lab8Square(double unit) {
        super(unit);
        System.out.println("Area of " + getName() + " is " + getArea());
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return this.unit * this.unit;
    }
}
