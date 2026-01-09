class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;
    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}
class MovieDoublyLinkedList {
    private MovieNode head;
    private MovieNode tail;
    private int size = 0;
    void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }
    void addAtEnd(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }
    void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        if (position > size) {
            addAtEnd(title, director, year, rating);
            return;
        }
        MovieNode node = new MovieNode(title, director, year, rating);
        MovieNode temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }
    void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
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
                size--;
                return;
            }
            temp = temp.next;
        }
    }
    void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                printMovie(temp);
            }
            temp = temp.next;
        }
    }
    void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                printMovie(temp);
            }
            temp = temp.next;
        }
    }
    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }
    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }
    private void printMovie(MovieNode m) {
        System.out.println(m.title + " | " + m.director + " | " + m.year + " | " + m.rating);
    }
}
public class MovieManagement{
    public static void main(String[] args) {
        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();
        movies.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.8);
        movies.displayForward();
        System.out.println();
        movies.updateRating("Avatar", 8.0);
        movies.searchByDirector("Christopher Nolan");
        System.out.println();
        movies.removeByTitle("Inception");
        movies.displayReverse();
    }
}
