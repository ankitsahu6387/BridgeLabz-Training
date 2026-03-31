import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService();

        System.out.println("Welcome to Address Book Program!");
        System.out.println("START Master Branch");

        // Add Default Address Book
        service.addAddressBook("Default");

        AddressBook currentBook = service.getAddressBook("Default");

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Add Contact\n2. Edit Contact\n3. Delete Contact\n4. View All\n5. Search by City\n6. Search by State\n7. Sort By Name\n8. Sort By City\n9. Sort By State\n10. Sort By Zip\n11. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: //UC 2: Add Contact
                    System.out.print("First Name: "); String fName = sc.nextLine();
                    System.out.print("Last Name: "); String lName = sc.nextLine();
                    System.out.print("Address: "); String address = sc.nextLine();
                    System.out.print("City: "); String city = sc.nextLine();
                    System.out.print("State: "); String state = sc.nextLine();
                    System.out.print("ZIP: "); String zip = sc.nextLine();
                    System.out.print("Phone: "); String phone = sc.nextLine();
                    System.out.print("Email: "); String email = sc.nextLine();

                    ContactPerson person = new ContactPerson(fName, lName, address, city, state, zip, phone, email);
                    currentBook.addContact(person);
                    break;

                case 2: //UC 3: Edit Contact
                    System.out.print("Enter first name to edit: "); String ef = sc.nextLine();
                    System.out.print("Enter last name to edit: "); String el = sc.nextLine();
                    System.out.println("Enter new details: ");
                    System.out.print("First Name: "); String nf = sc.nextLine();
                    System.out.print("Last Name: "); String nl = sc.nextLine();
                    System.out.print("Address: "); String na = sc.nextLine();
                    System.out.print("City: "); String nc = sc.nextLine();
                    System.out.print("State: "); String ns = sc.nextLine();
                    System.out.print("ZIP: "); String nz = sc.nextLine();
                    System.out.print("Phone: "); String np = sc.nextLine();
                    System.out.print("Email: "); String ne = sc.nextLine();

                    ContactPerson updated = new ContactPerson(nf, nl, na, nc, ns, nz, np, ne);
                    currentBook.editContact(ef, el, updated);
                    break;

                case 3: //UC 4: Delete Contact
                    System.out.print("Enter first name to delete: "); String df = sc.nextLine();
                    System.out.print("Enter last name to delete: "); String dl = sc.nextLine();
                    currentBook.deleteContact(df, dl);
                    break;

                case 4: //View All Contacts
                    System.out.println("Contacts in Address Book:");
                    for (ContactPerson p : currentBook.getAllContacts()) {
                        System.out.println(p);
                    }
                    break;

                case 5: //Search by City
                    System.out.print("Enter city: "); String sCity = sc.nextLine();
                    List<ContactPerson> cityResult = service.searchByCityAcrossBooks(sCity);
                    cityResult.forEach(System.out::println);
                    break;

                case 6: //Search by State
                    System.out.print("Enter state: "); String sState = sc.nextLine();
                    List<ContactPerson> stateResult = service.searchByStateAcrossBooks(sState);
                    stateResult.forEach(System.out::println);
                    break;
                
                case 7:
                    currentBook.sortByName();
                    System.out.println("Sorted by Name:");
                    currentBook.getAllContacts().forEach(System.out::println);
                    break;
                
                case 8:
                    currentBook.sortByCity();
                    System.out.println("Sorted by City:");
                    currentBook.getAllContacts().forEach(System.out::println);
                    break;
                
                case 9:
                    currentBook.sortByState();
                    System.out.println("Sorted by State:");
                    currentBook.getAllContacts().forEach(System.out::println);
                    break;

                case 10:
                    currentBook.sortByZip();
                    System.out.println("Sorted by Zip:");
                    currentBook.getAllContacts().forEach(System.out::println);
                    break;

                case 11: //Exit
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
        System.out.println("Exiting Address Book Program!");
    }
}
