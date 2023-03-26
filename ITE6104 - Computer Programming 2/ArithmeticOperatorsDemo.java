public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int x = 13;
        int y = 9;
        double result = 0;

        System.out.println("Variable values:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("result = " + result);
        System.out.println();

        System.out.println("Arithmetic operation");
        result = x + y;
        System.out.println("Addition: x + y = " + result);

        result = x - y;
        System.out.println("Subtraction: x - y = " + result);

        result = x * y;
        System.out.println("Multiplication: x * y = " + result);

        result = x / y;
        System.out.println("Division: x / y = " + result);

        result = x % y;
        System.out.println("Modulus: x % y = " + result);

        result = x++;
        System.out.println("Increment: x + 1 = " + result);
    }
}
