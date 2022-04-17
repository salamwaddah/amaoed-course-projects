/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author salam
 */
public class CreditAlaraj {

    int creditAccNo;
    String name;
    double annualIncome;
    double creditLimit;
    int creditBalance;

    public int getAccountNo() {
        return creditAccNo;
    }

    public void setAccountNo(int accountNo) {
        this.creditAccNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnnualIncome() {
        return creditAccNo;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public void setAnnualIncome(double annualIncome) throws Exception {
        if (annualIncome < 200000) {
            throw new Exception("Annual income below 200,000 is not eligible for the credit.");
        }

        if (annualIncome >= 200000 && annualIncome < 300000) {
            setCreditLimit(30000);
        }

        if (annualIncome >= 300000 && annualIncome < 500000) {
            setCreditLimit(50000);
        }

        if (annualIncome >= 500000) {
            setCreditLimit(100000);
        }

        Random rand = new Random();
        int upperbound = 9999;
        this.setAccountNo(1000 + rand.nextInt(upperbound));

        this.annualIncome = annualIncome;
    }

    public String getCreditLimit() {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(this.creditLimit);
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void printNewAccountDetails() {
        System.out.print("Your four-digit credit account number: ");
        System.out.println(getAccountNo());
        System.out.print("Your credit limit: ");
        System.out.println(getCreditLimit());
    }

    public void printCreditBalanceDetails() {
        System.out.print("Name: ");
        System.out.println(getName());
        printNewAccountDetails();
        System.out.print("Credit balance: ");
        System.out.println(getCreditBalance());

    }

    public void closeAccount() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To confirm account closure you must pay your credit balance " + getCreditBalance() + " ... type (yes) to confirm ");

        String answer = scanner.next();

        if (answer.equals("yes")) {
            System.out.println("Thank you for your payment! Account closed!!");
        } else {
            throw new Exception("Account closure not confirmed");
        }
    }

    public void credit() throws Exception {
        if (getCreditBalance() == 0) {
            throw new Exception("Your credit balance is zero. You dont need to pay anything");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input amount of payment no less than (PHP 1) and not greater than " + getCreditBalance() + ": ");

        int creditAmount = scanner.nextInt();

        if (creditAmount < 1) {
            throw new Exception("You cannot pay less than PHP 1");
        }

        if (creditAmount > getCreditBalance()) {
            throw new Exception("You cannot pay more than your credit balance: " + getCreditBalance());
        }

        setCreditBalance(getCreditBalance() - creditAmount);

        System.out.println("Amount of " + creditAmount + " is paid. Your new credit balance is " + getCreditBalance());
    }

    public int allowedPurchaseLimit() {
        return (int) this.creditLimit - creditBalance;
    }

    public void purchase() throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input purchase amount of payment no less than (PHP 1) and not greater than allowed purchase ammount " + allowedPurchaseLimit() + ": ");

        int purchaseAmount = scanner.nextInt();

        if (purchaseAmount > allowedPurchaseLimit()) {
            throw new Exception("You cannot purchase more than your allow purchase limit");
        }

        setCreditBalance(getCreditBalance() + purchaseAmount);

        double interest = getCreditBalance() * 0.03;

        setCreditBalance(getCreditBalance() + (int) interest);
    }

}
