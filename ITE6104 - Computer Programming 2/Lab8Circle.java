/**
 * ITE6104 - Lab 8
 * Abdulsalam Alaraj
 * AMA Computer University
 */
public class Lab8Circle extends Lab8Shape {
    final double PI = 3.14;

    public Lab8Circle(double unit) {
        super(unit);
        System.out.println("Area of " + getName() + " is " + getArea());
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return this.unit * this.unit * this.PI;
    }
}
