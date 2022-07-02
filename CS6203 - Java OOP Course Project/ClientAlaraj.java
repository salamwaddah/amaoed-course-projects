/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author salam
 */
public class ClientAlaraj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<CreditAlaraj> accountList = new ArrayList<>();

        boolean loop = false;

        do {
            displayMainMenu();

            boolean validChoice;
            int choice = 0;

            do {
                validChoice = true;

                try {
                    Scanner scanner = new Scanner(System.in);
                    choice = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("INVALID INPUT: menu choice");
                    validChoice = false;
                }

            } while (!validChoice);

            switch (choice) {
                case 1 -> {
                    CreditAlaraj newAccount = new CreditAlaraj();

                    boolean validName;
                    String name = "";
                    do {
                        validName = true;
                        System.out.println("Name: ");

                        try {
                            Scanner nameScanner = new Scanner(System.in);
                            name += nameScanner.nextLine();

                            if (name.equals("")) {
                                System.out.println("INVALID INPUT: name must not be empty");
                                validName = false;
                            }

                            newAccount.setName(name);
                        } catch (Exception e) {
                            System.out.println("INVALID INPUT: name");
                            validName = false;
                        }

                    } while (!validName);


                    boolean validAnnualIncome;
                    do {
                        System.out.println("Annual Income: ");

                        validAnnualIncome = true;

                        try {
                            Scanner incomeScanner = new Scanner(System.in);
                            newAccount.setAnnualIncome(incomeScanner.nextDouble());
                            System.out.println("Credit account successfully created!\n");
                            newAccount.printNewAccountDetails();
                            accountList.add(newAccount);

                        } catch (Exception e) {
                            if (e.getMessage() == null) {
                                System.out.println("INVALID INPUT: annual income try again");
                            } else {
                                System.out.println(e.getMessage());
                            }

                            validAnnualIncome = false;
                        }

                    } while (!validAnnualIncome);
                    loop = true;
                }

                case 2 -> {
                    if (accountList.isEmpty()) {
                        System.out.println("Error: No accounts added yet");
                        loop = true;
                        break;
                    }

                    boolean validAccountNumber;
                    int accountNumberToFind = 0;

                    do {
                        validAccountNumber = true;

                        System.out.println("Input account number to get balance: ");

                        try {
                            Scanner accountNumberScanner = new Scanner(System.in);
                            accountNumberToFind = accountNumberScanner.nextInt();

                            if (accountNumberToFind < 1000) {
                                System.out.println("INVALID INPUT: account number must be 4 digits");
                                validAccountNumber = false;
                            }
                        } catch (Exception e) {
                            System.out.println("INVALID INPUT: account number");
                            validAccountNumber = false;
                        }

                    } while (!validAccountNumber);

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
                }
                case 3 -> {
                    if (accountList.isEmpty()) {
                        System.out.println("Error: No accounts added yet");
                        loop = true;
                        break;
                    }

                    boolean validAccountNumber;
                    int accountNumberToPurchase = 0;

                    do {
                        validAccountNumber = true;

                        System.out.println("Input account number to get purchases: ");

                        try {
                            Scanner accountNumberScanner = new Scanner(System.in);
                            accountNumberToPurchase = accountNumberScanner.nextInt();

                            if (accountNumberToPurchase < 1000) {
                                System.out.println("INVALID INPUT: account number must be 4 digits");
                                validAccountNumber = false;
                            }

                        } catch (Exception e) {
                            System.out.println("INVALID INPUT: account number");
                            validAccountNumber = false;
                        }


                    } while (!validAccountNumber);

                    if (validateAcctNumber(accountNumberToPurchase, accountList)) {
                        for (CreditAlaraj account : accountList) {
                            if (account.getAccountNo() == accountNumberToPurchase) {

                                try {
                                    account.purchase();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());

                                }
                            }
                        }
                    } else {
                        System.out.println("Cannot find purchases for account " + accountNumberToPurchase + " because it does not exist!!");
                    }


                }
                case 4 -> {
                    if (accountList.isEmpty()) {
                        System.out.println("Error: No accounts added yet");
                        loop = true;
                        break;
                    }

                    boolean validDepositAccount;
                    int accountNumberToDeposit = 0;

                    do {
                        validDepositAccount = true;

                        System.out.println("Input account number: ");

                        try {

                            Scanner depositScanner = new Scanner(System.in);
                            accountNumberToDeposit = depositScanner.nextInt();

                            if (accountNumberToDeposit < 1000) {
                                System.out.println("INVALID INPUT: account number must be 4 digits");
                                validDepositAccount = false;
                            }
                        } catch (Exception e) {
                            System.out.println("INVALID INPUT: deposit account number");
                            validDepositAccount = false;
                        }

                    } while (!validDepositAccount);


                    if (validateAcctNumber(accountNumberToDeposit, accountList)) {

                        for (CreditAlaraj account : accountList) {
                            if (account.getAccountNo() == accountNumberToDeposit) {
                                try {
                                    account.credit();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    break;
                                }

                                break;
                            }
                        }
                    } else {
                        System.out.println("Cannot deposit in account " + accountNumberToDeposit + " because it does not exist!!");
                    }
                }
                case 5 -> {
                    if (accountList.isEmpty()) {
                        System.out.println("Error: No accounts added yet");
                        loop = true;
                        break;
                    }

                    boolean validClosureNumber;
                    int accountNumberToClose = 0;

                    do {
                        validClosureNumber = true;

                        System.out.println("Input account number to get close: ");

                        try {
                            Scanner closureScanner = new Scanner(System.in);
                            accountNumberToClose = closureScanner.nextInt();

                            if (accountNumberToClose < 1000) {
                                System.out.println("INVALID INPUT: account number must be 4 digits");
                                validClosureNumber = false;
                            }

                        } catch (Exception e) {
                            System.out.println("INVALID INPUT: account number to close");
                            validClosureNumber = false;
                        }

                    } while (!validClosureNumber);

                    if (validateAcctNumber(accountNumberToClose, accountList)) {
                        for (CreditAlaraj account : accountList) {
                            if (account.getAccountNo() == accountNumberToClose) {

                                try {
                                    account.closeAccount();
                                    accountList.remove(account);
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    break;
                                }

                                break;
                            }
                        }
                    } else {
                        System.out.println("Cannot close account " + accountNumberToClose + " because it does not exist!!");
                    }
                }
                case 6 -> {
                    System.out.println("\nGood bye!\n");
                    loop = false;
                }
                default -> {
                    displayInvalidMenuOptionError();
                    loop = true;
                }
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
