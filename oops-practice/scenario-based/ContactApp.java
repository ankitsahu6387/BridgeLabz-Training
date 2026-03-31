import java.util.*;
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
class ContactManager {
    private List<Contact> contacts = new ArrayList<>();
    public void addContact(String name, String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("\\d{10}")) throw new InvalidPhoneNumberException("Phone must be 10 digits");
        for (Contact c : contacts) {
            if (c.phoneNumber.equals(phone)) {
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }
        contacts.add(new Contact(name, phone));
        System.out.println("Contact added: " + name);
    }
    public void searchContact(String phone) {
        for (Contact c : contacts) {
            if (c.phoneNumber.equals(phone)) {
                System.out.println("Found: " + c.name + " - " + c.phoneNumber);
                return;
            }
        }
        System.out.println("Contact not found");
    }
    public void deleteContact(String phone) {
        boolean removed = contacts.removeIf(c -> c.phoneNumber.equals(phone));
        if (removed) System.out.println("Contact deleted");
        else System.out.println("Contact not found");
    }
}
public class ContactApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();
        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Add Contact\n2. Search Contact\n3. Delete Contact\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    try {
                        manager.addContact(name, phone);
                    } catch (InvalidPhoneNumberException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.print("Enter phone number to search: ");
                    String phone = sc.nextLine();
                    manager.searchContact(phone);
                }
                case 3 -> {
                    System.out.print("Enter phone number to delete: ");
                    String phone = sc.nextLine();
                    manager.deleteContact(phone);
                }
                case 4 -> exit = true;
                default -> System.out.println("Invalid option");
            }
        }
        sc.close();
        System.out.println("Exiting Contact Organizer.");
    }
}
