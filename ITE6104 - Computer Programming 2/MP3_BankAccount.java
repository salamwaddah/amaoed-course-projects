/**
 * 1. Define the following attributes and methods of the BankAccount class:
 * Attributes: accountName, address, birthday, contactNumber
 * Constructor
 * Setter and Getter methods
 * getClientDetails method
 */

public class MP3_BankAccount {
    String accountName;
    String address;
    String birthday;
    String contactNumber;

    public MP3_BankAccount() {

    }

    public int generateAccountNumber() {
        int min = 1000;
        int max = 9999;
        int number = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("New account number generated: " + number);
        return number;
    }

    public void getClientDetails(MP3_SavingsAccount account) {
        System.out.println("\n=========================");
        System.out.println("==== Account Summary ====");
        System.out.println("Account Number:\t" + account.getAccountNo());
        System.out.println("Name:\t\t" + account.getAccountName());
        System.out.println("Address:\t" + account.getAddress());
        System.out.println("Birthday:\t" + account.getBirthday());
        System.out.println("Contact Number:\t" + account.getContactNumber());
        System.out.println("Balance:\t" + account.getBalance());
        System.out.println("=========================");
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
