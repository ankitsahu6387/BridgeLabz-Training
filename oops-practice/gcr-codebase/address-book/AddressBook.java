import java.util.*;

public class AddressBook {
    private List<ContactPerson> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // UC 1 & UC 6: Add Contact
    public boolean addContact(ContactPerson person) {
        if (contacts.contains(person)) {
            System.out.println("Duplicate Contact! Cannot add.");
            return false;
        }
        contacts.add(person);
        return true;
    }