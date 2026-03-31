import java.util.*;

public class AddressBook {
    private List<ContactPerson> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // UC 2 : Add Contact
    public boolean addContact(ContactPerson person) {
        if (contacts.contains(person)) {
            System.out.println("Duplicate Contact! Cannot add.");
            return false;
        }
        contacts.add(person);
        return true;
    }

    // UC 3: Edit Contact
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

    // UC 4: Delete Contact
    public boolean deleteContact(String firstName, String lastName) {
        return contacts.removeIf(p -> p.getFirstName().equalsIgnoreCase(firstName) && p.getLastName().equalsIgnoreCase(lastName));
    }

    // Get All Contacts
    public List<ContactPerson> getAllContacts() {
        return contacts;
    }

    // UC 8 & UC 9: Search by City or State
    public List<ContactPerson> searchByCity(String city) {
        List<ContactPerson> result = new ArrayList<>();
        for (ContactPerson p : contacts) {
            if (p.getCity().equalsIgnoreCase(city)) {
                result.add(p);
            }
        }
        return result;
    }
    // Search by State
    public List<ContactPerson> searchByState(String state) {
        List<ContactPerson> result = new ArrayList<>();
        for (ContactPerson p : contacts) {
            if (p.getState().equalsIgnoreCase(state)) {
                result.add(p);
            }
        }
        return result;
    }
    // Count by City or State
    public int countByCity(String city) {
        return searchByCity(city).size();
    }
    // Count by State
    public int countByState(String state) {
        return searchByState(state).size();
    }
    //  UC 11: Sort Contacts by First Name
    public void sortByName() {
        Collections.sort(contacts, Comparator.comparing(ContactPerson::getFirstName));
    }
    // UC 12: Sort by City
    public void sortByCity() {
        Collections.sort(contacts, Comparator.comparing(ContactPerson::getCity));
    }
    // Sort by State
    public void sortByState() {
        Collections.sort(contacts, Comparator.comparing(ContactPerson::getState));
    }
    // Sort by Zip
    public void sortByZip() {
        Collections.sort(contacts, Comparator.comparing(ContactPerson::getZip));
    }
}