public class Main {
    public static void main(String args[]){
        System.out.println("Welcome to address book program");
        Contact contact1 = new Contact("Ankit", "Sahu", "gla", "Mathura", "UP", "210421", "6387xxxxx", "ankit@gmail.com");
        AddNewContact addContact = new AddNewContact(contact1);
        addContact.addContact();
        addContact.display();
        addContact.editContact("Ankit", "Sahu", "gla", "Noida", "UP", "210421", "9999xxxxx", "ankitnew@gmail.com");
        addContact.display();
        Contact c2 = new Contact("")
    }
}