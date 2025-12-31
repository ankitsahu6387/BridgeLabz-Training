class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

class EBook extends Book2 {
    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void displayEBookDetails() {
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
        System.out.println("Author (private via getter): " + getAuthor());
        System.out.println("Format: " + format);
        System.out.println();
    }

    public static void main(String[] args) {
        Book2 book1 = new Book2("12345", "Java Programming", "James Gosling");
        book1.displayBookDetails();

        EBook e1 = new EBook("67890", "Data Science", "Riya Sharma", "PDF");
        e1.displayEBookDetails();
    }
}
