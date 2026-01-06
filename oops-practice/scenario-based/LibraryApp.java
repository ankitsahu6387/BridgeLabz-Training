import java.util.*;
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class Book {
    String title;
    String author;
    boolean isAvailable;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}
class LibraryManager {
    private List<Book> books = new ArrayList<>();
    public void addBooks(Book[] bookArray) {
        for (Book b : bookArray) books.add(b);
    }
    public void searchBooks(String keyword) {
        System.out.println("Search results for \"" + keyword + "\":");
        boolean found = false;
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("- " + b.title + " by " + b.author + " | " + (b.isAvailable ? "Available" : "Checked Out"));
                found = true;
            }
        }
        if (!found) System.out.println("No books found matching keyword.");
    }
    public void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.isAvailable) throw new BookNotAvailableException("Book \"" + title + "\" is already checked out!");
                b.isAvailable = false;
                System.out.println("Book \"" + title + "\" checked out successfully!");
                return;
            }
        }
        System.out.println("Book not found in library.");
    }
    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book b : books) {
            System.out.println("- " + b.title + " by " + b.author + " | " + (b.isAvailable ? "Available" : "Checked Out"));
        }
    }
}
public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] bookArray = {
            new Book("Java Basics", "Ankit Sahu"),
            new Book("Data Structures", "Rahul Sharma"),
            new Book("Algorithms in Java", "Amit Kumar"),
            new Book("Web Development", "Priya Singh")
        };
        LibraryManager library = new LibraryManager();
        library.addBooks(bookArray);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Display all books\n2. Search books\n3. Checkout book\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> library.displayBooks();
                case 2 -> {
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    library.searchBooks(keyword);
                }
                case 3 -> {
                    System.out.print("Enter book title to checkout: ");
                    String title = sc.nextLine();
                    try {
                        library.checkoutBook(title);
                    } catch (BookNotAvailableException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 4 -> exit = true;
                default -> System.out.println("Invalid option.");
            }
        }
        System.out.println("Exiting Library Management System.");
        sc.close();
    }
}
