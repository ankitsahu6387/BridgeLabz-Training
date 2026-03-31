import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class Library {

    private Map<String, LinkedList<Book>> catalog;
    private HashSet<String> isbnTracker;

    public Library() {
        catalog = new HashMap<>();
        isbnTracker = new HashSet<>();
    }

    public void addBook(String genre, Book book) {
        if (!isbnTracker.add(book.getIsbn())) {
            System.out.println("Duplicate book ignored: " + book);
            return;
        }
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        System.out.println("Added: " + book + " [" + genre + "]");
    }

    public void borrowBook(String genre, String isbn) {
        LinkedList<Book> books = catalog.get(genre);
        if (books == null) return;

        books.removeIf(book -> {
            if (book.getIsbn().equals(isbn)) {
                isbnTracker.remove(isbn);
                System.out.println("Borrowed: " + book);
                return true;
            }
            return false;
        });
    }

    public void showCatalog() {
        System.out.println("\n--- Library Catalog ---");
        for (String genre : catalog.keySet()) {
            System.out.println(genre + ": " + catalog.get(genre));
        }
    }
}
