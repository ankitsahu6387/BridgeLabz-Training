import java.util.*;

public class AddressBookService {
    private Map<String, AddressBook> addressBooks;

    public AddressBookService() {
        addressBooks = new HashMap<>();
    }

    // UC 5: Add Address Book
    public boolean addAddressBook(String name) {
        if (addressBooks.containsKey(name)) {
            System.out.println("Address Book already exists!");
            return false;
        }
        addressBooks.put(name, new AddressBook());
        return true;
    }
    // Get Address Book by Name
    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }

    // Search by City 
    public List<ContactPerson> searchByCityAcrossBooks(String city) {
        List<ContactPerson> result = new ArrayList<>();
        for (AddressBook book : addressBooks.values()) {
            result.addAll(book.searchByCity(city));
        }
        return result;
    }
    // Search by State
    public List<ContactPerson> searchByStateAcrossBooks(String state) {
        List<ContactPerson> result = new ArrayList<>();
        for (AddressBook book : addressBooks.values()) {
            result.addAll(book.searchByState(state));
        }
        return result;
    }
}
