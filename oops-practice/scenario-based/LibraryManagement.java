class LibraryManagement {

    String title;
    String author;
    boolean isAvailable;

    LibraryManagement(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    static void displayBooks(LibraryManagement[] books) {
        for (LibraryManagement b : books) {
            System.out.println(b.title + " | " + b.author + " | "
                    + (b.isAvailable ? "Available" : "Checked Out"));
        }
    }

    static void searchBook(LibraryManagement[] books, String keyword) {
        boolean found = false;
        for (LibraryManagement b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + b.title);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with given title");
        }
    }

    static void checkoutBook(LibraryManagement[] books, String title) {
        for (LibraryManagement b : books) {
            if (b.title.equalsIgnoreCase(title) && b.isAvailable) {
                b.isAvailable = false;
                System.out.println(title + " has been checked out");
                return;
            }
        }
        System.out.println("Book not available");
    }

    public static void main(String[] args) {

        LibraryManagement[] books = {
                new LibraryManagement("Java Programming", "James Gosling"),
                new LibraryManagement("Data Structures", "Mark Allen"),
                new LibraryManagement("Clean Code", "Robert Martin")
        };

        displayBooks(books);
        searchBook(books, "java");
        checkoutBook(books, "Java Programming");
        displayBooks(books);
    }
}
