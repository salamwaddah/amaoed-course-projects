import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MP3_Client {
    public static void main(String[] args) {
        List<MP3_SavingsAccount> accountList = new ArrayList<>();

        boolean loop;
        Scanner scanner = new Scanner(System.in);

        do {
            displayMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Opening a new account: ");
                    MP3_SavingsAccount newAccount = new MP3_SavingsAccount();
                    System.out.print("Name: ");
                    newAccount.setAccountName(scanner.next());
                    System.out.print("Address: ");
                    newAccount.setAddress(scanner.next());
                    System.out.print("Birthday: ");
                    newAccount.setBirthday(scanner.next());
                    System.out.print("Contact number: ");
                    newAccount.setContactNumber(scanner.next());

                    newAccount.initialDeposit();

                    int newAccountNumber = newAccount.generateAccountNumber();
                    newAccount.setAccountNo(newAccountNumber);
                    accountList.add(newAccount);
                    newAccount.getClientDetails(newAccount);
                    System.out.print("\nAccount created successfully!\n");

                    loop = true;
                    break;
                case 2:
                    if (accountList.size() == 0) {
                        System.out.print("Error: Can't search for balance, no accounts added");
                        loop = true;
                        break;
                    }

                    System.out.print("Input account number to get balance: ");
                    int accountNumberToFind = scanner.nextInt();

                    if (MP3_SavingsAccount.validateAcctNumber(accountNumberToFind, accountList)) {
                        for (MP3_SavingsAccount account : accountList) {
                            if (account.getAccountNo() == accountNumberToFind) {
                                System.out.println("Account Found!!");
                                System.out.println("Name: " + account.getAccountName());
                                System.out.println("Balance: PHP" + account.getBalance());
                                break;
                            }
                        }
                    } else {
                        System.out.println("This account number " + accountNumberToFind + " does not exist!!");
                    }

                    loop = true;
                    break;
                case 3:
                    if (accountList.size() == 0) {
                        System.out.print("Error: Can't deposit, no accounts added");
                        loop = true;
                        break;
                    }

                    System.out.print("Input account number for deposit: ");
                    int accountNumberToDeposit = scanner.nextInt();

                    if (MP3_SavingsAccount.validateAcctNumber(accountNumberToDeposit, accountList)) {
                        for (MP3_SavingsAccount account : accountList) {
                            if (account.getAccountNo() == accountNumberToDeposit) {
                                account.deposit();
                                break;
                            }
                        }
                    } else {
                        System.out.println("Cannot deposit in account " + accountNumberToDeposit + " because it does not exist!!");
                    }

                    loop = true;
                    break;
                case 4:
                    if (accountList.size() == 0) {
                        System.out.print("Error: Can't withdraw, no accounts added");
                        loop = true;
                        break;
                    }

                    System.out.print("Input account number to withdraw: ");
                    int accountNumberToWithdraw = scanner.nextInt();

                    if (MP3_SavingsAccount.validateAcctNumber(accountNumberToWithdraw, accountList)) {
                        for (MP3_SavingsAccount account : accountList) {
                            if (account.getAccountNo() == accountNumberToWithdraw) {
                                account.withdraw();
                                break;
                            }
                        }
                    } else {
                        System.out.println("Cannot withdraw from account " + accountNumberToWithdraw + " because it does not exist!!");
                    }

                    loop = true;
                    break;
                case 5:
                    if (accountList.size() == 0) {
                        System.out.print("Error: Can't get profile, no accounts added");
                        loop = true;
                        break;
                    }

                    System.out.print("Input account number to get profile: ");
                    int accountNumberToProfile = scanner.nextInt();

                    if (MP3_SavingsAccount.validateAcctNumber(accountNumberToProfile, accountList)) {
                        for (MP3_SavingsAccount account : accountList) {
                            if (account.getAccountNo() == accountNumberToProfile) {
                                account.getClientDetails(account);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Cannot get the profile of account " + accountNumberToProfile + " because it does not exist!!");
                    }

                    loop = true;
                    break;
                case 6:
                    if (accountList.size() == 0) {
                        System.out.print("Error: No accounts added yet");
                        loop = true;
                        break;
                    }

                    System.out.print("Input account number to get close: ");
                    int accountNumberToClose = scanner.nextInt();

                    if (MP3_SavingsAccount.validateAcctNumber(accountNumberToClose, accountList)) {
                        for (MP3_SavingsAccount account : accountList) {
                            if (account.getAccountNo() == accountNumberToClose) {
                                account.closeAccount();
                                break;
                            }
                        }
                    } else {
                        System.out.println("Cannot close account " + accountNumberToClose + " because it does not exist!!");
                    }

                    loop = true;
                    break;
                case 7:
                    System.out.println("\nGood bye!\n");
                    loop = false;
                    break;
                default:
                    displayInvalidMenuOptionError();
                    loop = true;
                    break;
            }
        } while (loop);
    }

    public static void displayMainMenu() {
        System.out.println("\n\nJBank Main Menu");
        System.out.println("[1] New Account");
        System.out.println("[2] Balance Inquiry");
        System.out.println("[3] Deposit");
        System.out.println("[4] Withdraw");
        System.out.println("[5] Client Profile");
        System.out.println("[6] Close Account");
        System.out.println("[7] Exit\n");
    }

    public static void displayInvalidMenuOptionError() {
        System.out.println("\nInvalid menu item, please select from menu\n");
    }
}
