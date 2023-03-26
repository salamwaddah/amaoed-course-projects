import java.util.List;
import java.util.Scanner;

public class MP3_SavingsAccount extends MP3_BankAccount {
    int accountNo;
    double balance;
    double interestRate;

    public MP3_SavingsAccount() {
        setInterestRate(0.05);
    }

    public void balanceInquiry() {

    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        boolean validDeposit;

        do {
            validDeposit = false;

            System.out.print("How much to deposit (Min PHP100): ");
            double amount = scanner.nextDouble();

            if (amount < 100) {
                System.out.println("Error: Deposit must be more than PHP100, try again!");
                validDeposit = true;
            } else {
                System.out.println("Old Balance: PHP" + getBalance());

                double newBalance = getBalance() + amount;
                setBalance(newBalance);

                double interest = newBalance * getInterestRate();
                setBalance(getBalance() + interest);

                System.out.println("New Balance: PHP" + getBalance());
            }
        } while (validDeposit);
    }

    public void initialDeposit() {
        Scanner scanner = new Scanner(System.in);
        boolean validDeposit;

        do {
            validDeposit = false;
            System.out.print("Input initial deposit (Minimum PHP5,000): ");
            double initialDeposit = scanner.nextDouble();

            if (initialDeposit < 5000) {
                System.out.println("Error: Initial deposit must be more than PHP5,000, try again!");
                validDeposit = true;
            } else {
                setBalance(initialDeposit);
            }
        } while (validDeposit);
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        boolean validWithdraw;

        do {
            validWithdraw = false;
            System.out.print("Input withdraw amount (Minimum PHP100): ");
            double amount = scanner.nextDouble();

            if (amount < 100) {
                System.out.println("Error: You cannot withdraw less than PHP100, try again");
                validWithdraw = true;
            } else {
                double remainder = getBalance() - amount;
                if (remainder < 5000) {
                    System.out.println("Must maintain balance: cannot withdraw PHP" + amount + " because you will have less than PHP5,000");
                    validWithdraw = true;
                } else if (amount > getBalance()) {
                    System.out.println("You don't have enough balance to withdraw PHP" + amount);
                    validWithdraw = true;
                } else {
                    setBalance(getBalance() - amount);
                    System.out.println("Successfully withdrawn PHP" + amount);
                    System.out.println("Amount left in account is PHP" + getBalance());
                }
            }
        } while (validWithdraw);
    }

    public static boolean validateAcctNumber(int accountNumber, List<MP3_SavingsAccount> accounts) {
        boolean isValid = false;

        for (MP3_SavingsAccount account : accounts) {
            if (account.getAccountNo() == accountNumber) {
                isValid = true;
                break;
            }
        }

        return isValid;
    }

    public void closeAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Confirm account closure (y/n): ");
        String answer = scanner.next();

        if (answer.equals("y")) {
            setBalance(0);
            System.out.println("Account closed!! Balance is zero");
        } else {
            System.out.println("\nConfirmation not received");
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
