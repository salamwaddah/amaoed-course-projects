import java.util.Scanner;

public class GetInputUsingScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Your name is: " + name);
    }
}
