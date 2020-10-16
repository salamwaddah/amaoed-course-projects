import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * ITE6104 - Lab 7
 * Abdulsalam Alaraj
 * AMA Computer University
 */
public class Lab7_AddressBookTest {
    public static void main(String[] args) {
        boolean loop;
        List<Lab7_AddressBook> entries = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        do {
            String noEntriesText = "";
            int entryCount = entries.size();

            if (entries.size() == 0) {
                noEntriesText = " (No entries/Not available)";
            }

            System.out.println("\nMain Menu");
            System.out.println("1. Add Entry");
            System.out.println("2. Delete Entry" + noEntriesText);
            System.out.println("3. View All Entries" + noEntriesText);
            System.out.println("4. Update An Entry" + noEntriesText);
            System.out.println("5. Exit");

            System.out.print("\nChoose an option from the menu: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    Lab7_AddressBook entry = new Lab7_AddressBook();
                    System.out.print("Name: ");
                    entry.setName(scan.next());
                    System.out.print("Address: ");
                    entry.setAddress(scan.next());
                    System.out.print("Mobile Number: ");
                    entry.setMobileNumber(scan.nextInt());
                    System.out.print("Email Address: ");
                    entry.setEmailAddress(scan.next());
                    entries.add(entry);
                    loop = true;
                    break;
                case 2:
                    if (entryCount == 0) {
                        System.out.println("******************************************");
                        System.out.println("You cannot delete if there are no entries");
                        System.out.println("******************************************");
                        loop = true;
                        break;
                    }

                    System.out.println("Enter entry index to remove");
                    int indexToDelete = scan.nextInt();
                    entries.remove(indexToDelete);
                    System.out.println("Removed!!");
                    loop = true;
                    break;
                case 3:
                    if (entryCount == 0) {
                        System.out.println("*******************************************");
                        System.out.println("You cannot view all if there are no entries");
                        System.out.println("*******************************************");
                        loop = true;
                        break;
                    }

                    for (Lab7_AddressBook lab7_addressBook : entries) {
                        lab7_addressBook.showEntry();
                    }

                    loop = true;
                    break;
                case 4:
                    if (entryCount == 0) {
                        System.out.println("****************************************");
                        System.out.println("You cannot edit if there are no entries");
                        System.out.println("****************************************");
                        loop = true;
                        break;
                    }

                    System.out.println("Enter entry index to update");
                    int indexToUpdate = scan.nextInt();

                    Lab7_AddressBook newEntry = new Lab7_AddressBook();
                    System.out.print("Name: ");
                    newEntry.setName(scan.next());
                    System.out.print("Address: ");
                    newEntry.setAddress(scan.next());
                    System.out.print("Mobile Number: ");
                    newEntry.setMobileNumber(scan.nextInt());
                    System.out.print("Email Address: ");
                    newEntry.setEmailAddress(scan.next());

                    entries.set(indexToUpdate, newEntry);
                    loop = true;
                    break;
                case 5:
                    System.out.println("Exit");
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    loop = true;
                    break;
            }

        } while (loop);
    }
}
