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
    
    // UC 2: Edit Contact
    public boolean editContact(String firstName, String lastName, ContactPerson updatedPerson) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equalsIgnoreCase(firstName) &&
                contacts.get(i).getLastName().equalsIgnoreCase(lastName)) {
                contacts.set(i, updatedPerson);
                return true;
            }
        }
        return false;
    }