class BookNode {
    int id;
    String title;
    String author;
    String genre;
    boolean available;
    BookNode next;
    BookNode prev;

    BookNode(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

class LibraryDoublyList {
    private BookNode head;
    private BookNode tail;
    private int count = 0;

    void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        count++;
    }

    void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        count++;
    }

    void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos <= 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }
        if (pos > count) {
            addAtEnd(id, title, author, genre, available);
            return;
        }
        BookNode node = new BookNode(id, title, author, genre, available);
        BookNode temp = head;
        for (int i = 1; i < pos - 1; i++) temp = temp.next;
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
        count++;
    }

    void removeById(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                count--;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) printBook(temp);
            temp = temp.next;
        }
    }

    void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) printBook(temp);
            temp = temp.next;
        }
    }

    void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    int totalBooks() {
        return count;
    }

    private void printBook(BookNode b) {
        System.out.println(b.id + " | " + b.title + " | " + b.author + " | " + b.genre + " | " + (b.available ? "Available" : "Issued"));
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryDoublyList library = new LibraryDoublyList();

        library.addAtEnd(1, "Clean Code", "Robert Martin", "Programming", true);
        library.addAtBeginning(2, "Effective Java", "Joshua Bloch", "Programming", true);
        library.addAtPosition(2, 3, "The Alchemist", "Paulo Coelho", "Fiction", false);

        library.displayForward();
        System.out.println();

        library.updateAvailability(3, true);
        library.searchByAuthor("Joshua Bloch");
        System.out.println();

        library.removeById(1);
        library.displayReverse();
        System.out.println();

        System.out.println("Total Books: " + library.totalBooks());
    }
}
