/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author salam
 */
public class ClientAlaraj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<CreditAlaraj> accountList = new ArrayList<>();

        boolean loop;

        Scanner scanner = new Scanner(System.in);

        do {
            displayMainMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CreditAlaraj newAccount = new CreditAlaraj();

                    System.out.println("Name: ");
                    newAccount.setName(scanner.next());

                    System.out.println("Annual Income: ");

                    try {
                        newAccount.setAnnualIncome(scanner.nextDouble());

                        System.out.println("Credit account successfully created!\n");
                        newAccount.printNewAccountDetails();
                        accountList.add(newAccount);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        loop = true;
                        break;
                    }

                    loop = true;
                    break;
                case 2:
                    if (accountList.isEmpty()) {
                        System.out.println("Error: No accounts added yet");
                        loop = true;
                        break;
                    }

                    System.out.println("Input account number to get balance: ");
                    int accountNumberToFind = scanner.nextInt();

                    if (validateAcctNumber(accountNumberToFind, accountList)) {
                        for (CreditAlaraj account : accountList) {
                            if (account.getAccountNo() == accountNumberToFind) {
                                System.out.println("Account Found!!");
                                account.printCreditBalanceDetails();
                                break;
                            }
                        }
                    } else {
                        System.out.println("This account number " + accountNumberToFind + " does not exist!!");
                    }

                    loop = true;
                    break;

                case 3:
                    if (accountList.isEmpty()) {
                        System.out.println("Error: No accounts added yet");
                        loop = true;
                        break;
                    }

                    System.out.println("Input account number: ");
                    int accountNumberToPurchase = scanner.nextInt();

                    if (validateAcctNumber(accountNumberToPurchase, accountList)) {

                        for (CreditAlaraj account : accountList) {
                            if (account.getAccountNo() == accountNumberToPurchase) {
                                try {
                                    account.purchase();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    loop = true;
                                    break;
                                }

                                break;
                            }
                        }
                    } else {
                        System.out.println("Cannot deposit in account " + accountNumberToPurchase + " because it does not exist!!");
                    }

                    loop = true;
                    break;
                case 4:
                    if (accountList.isEmpty()) {
                        System.out.println("Error: No accounts added yet");
                        loop = true;
                        break;
                    }

                    System.out.println("Input account number: ");
                    int accountNumberToDeposit = scanner.nextInt();

                    if (validateAcctNumber(accountNumberToDeposit, accountList)) {

                        for (CreditAlaraj account : accountList) {
                            if (account.getAccountNo() == accountNumberToDeposit) {
                                try {
                                    account.credit();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    loop = true;
                                    break;
                                }

                                break;
                            }
                        }
                    } else {
                        System.out.println("Cannot deposit in account " + accountNumberToDeposit + " because it does not exist!!");
                    }

                    loop = true;
                    break;
                case 5:
                    if (accountList.isEmpty()) {
                        System.out.println("Error: No accounts added yet");
                        loop = true;
                        break;
                    }

                    System.out.println("Input account number to get close: ");
                    int accountNumberToClose = scanner.nextInt();

                    if (validateAcctNumber(accountNumberToClose, accountList)) {
                        for (CreditAlaraj account : accountList) {
                            if (account.getAccountNo() == accountNumberToClose) {

                                try {
                                    account.closeAccount();
                                    accountList.remove(account);
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    loop = true;
                                    break;
                                }

                                break;
                            }
                        }
                    } else {
                        System.out.println("Cannot close account " + accountNumberToClose + " because it does not exist!!");
                    }

                    loop = true;
                    break;

                case 6:
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
        System.out.println("\n\nJava Credit Main Menu");
        System.out.println("[1] New Credit Account");
        System.out.println("[2] Credit Inquiry");
        System.out.println("[3] Purchases");
        System.out.println("[4] Payment");
        System.out.println("[5] Close Credit Account");
        System.out.println("[6] Exit\n");
    }

    public static void displayInvalidMenuOptionError() {
        System.out.println("\nInvalid menu item, please select from menu\n");
    }

    public static boolean validateAcctNumber(int accountNumber, List<CreditAlaraj> accounts) {
        boolean isValid = false;

        for (CreditAlaraj account : accounts) {
            if (account.getAccountNo() == accountNumber) {
                isValid = true;
                break;
            }
        }

        return isValid;
    }
}
