import java.util.Scanner;

public class MP2_Fraction {
    private int numerator;
    private int denominator;

    public MP2_Fraction() {
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void showFractionForm() {
        boolean again;
        Scanner scan = new Scanner(System.in);
        do {
            again = false;

            System.out.print("Enter the numerator --> ");
            setNumerator(scan.nextInt());
            System.out.print("Enter the denominator --> ");
            setDenominator(scan.nextInt());

            System.out.println("****************OUTPUT****************");
            System.out.println("\t NUMERATOR \t\t: " + getNumerator());
            System.out.println("\t DENOMINATOR \t\t: " + getDenominator());
            System.out.println("\t FRACTION \t\t: " + determineFraction());
            System.out.println("\t LOWEST TERM \t\t: " + determineLowestTerm());
            System.out.println("\t DECIMAL EQUIVALENT \t: " + determineDecimalEquivalent());
            System.out.println("\t FRACTION TYPE \t\t: " + determineFractionType());


            System.out.print("\n Input again? [y/n] --> ");
            Scanner scanner = new Scanner(System.in);
            String inputAgain = scanner.nextLine();

            if (inputAgain.equals("y")) {
                again = true;
            }
        } while (again);
    }

    public String determineFraction() {
        return getNumerator() + "/" + getDenominator();
    }

    public String determineLowestTerm() {
        if (determineFractionType().equals("Improper Fraction")) {
            return "0/0";
        }

        if (getDenominator() > getNumerator()) {
            return "1/" + getDenominator() / getNumerator();
        }

        return getNumerator() / getDenominator() + "/1";
    }

    public double determineDecimalEquivalent() {
        return (double) getNumerator() / (double) getDenominator();
    }

    /**
     * The fraction types are as follows:
     * a. Proper Fraction – numerator is less than the denominator
     * b. Improper Fraction – numerator is greater than the denominator, but the quotient is a real number (ex: 3.45)
     * c. Whole Number – numerator is greater than the denominator, but the quotient has no decimal part
     */
    public String determineFractionType() {
        if (getNumerator() < getDenominator()) {
            return "Proper Fraction";
        }

        if (determineDecimalEquivalent() % 1 == 0) {
            return "Whole Number";
        }

        return "Improper Fraction";
    }
}
