import java.util.*;
public class AddNewContact{
    private Contact contact;
    public AddNewContact(Contact contact) {
        this.contact = contact;
    }
    List<Contact> contacts = new ArrayList<>();
    public void addContact() {
        contacts.add(contact);
    }   
    void editContact(String firstName, String lastName, String address, String city, String state, String zip, String newPhoneNumber, String newEmail) {
        for(Contact c : contacts) {
            if(c.firstName.equals(firstName) && c.lastName.equals(lastName)) {
                c.city = city;
                c.phoneNumber = newPhoneNumber;
                c.email = newEmail;
            }
        }
    }
    void display() {
        for(Contact c : contacts) {
            System.out.println("Name: " + c.firstName + " " + c.lastName);
            System.out.println("Address: " + c.address + ", " + c.city + ", " + c.state + ", " + c.zip);
            System.out.println("Phone: " + c.phoneNumber);
            System.out.println("Email: " + c.email);
        }
    }
}
