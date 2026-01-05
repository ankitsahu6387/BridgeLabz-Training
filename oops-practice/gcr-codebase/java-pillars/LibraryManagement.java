import java.util.*;
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String reservedBy;
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            reservedBy = borrowerName;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book already reserved by " + reservedBy);
        }
    }
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String reservedBy;
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 7;
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            reservedBy = borrowerName;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine already reserved by " + reservedBy);
        }
    }
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String reservedBy;
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 3;
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            reservedBy = borrowerName;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD already reserved by " + reservedBy);
        }
    }
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "Java Programming", "Alice"));
        items.add(new Magazine("M001", "Science Today", "Bob"));
        items.add(new DVD("D001", "Inception", "Christopher Nolan"));
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem("John Doe");
                System.out.println("Available after reservation: " + reservable.checkAvailability());
            }
            System.out.println();
        }
    }
}
