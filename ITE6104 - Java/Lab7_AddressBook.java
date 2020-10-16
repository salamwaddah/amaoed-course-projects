/**
 * ITE6104 - Lab 7
 * Abdulsalam Alaraj
 * AMA Computer University
 */
public class Lab7_AddressBook {
    private String name;
    private String address;
    private int mobileNumber;
    private String emailAddress;

    public Lab7_AddressBook() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void showEntry() {
        System.out.println();
        System.out.println("*************");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getMobileNumber());
        System.out.println("Email: " + getEmailAddress());
        System.out.println("*************");
        System.out.println();
    }
}
