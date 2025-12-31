class Book {
    String title;
    String author;
    int price;
    boolean availability;


    public Book(){
        System.out.println("Default constructor");
    }

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }
    public void display(){
        System.out.println("title = "+ title);
        System.out.println("author = "+ author);
        System.out.println("price = "+ price);
        System.out.println("Available: " + availability);
    }
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }
    public static void main(String[] args) {
        Book b1 = new Book("Home Coming", "ABC", 50);
        b1.borrowBook();
        b1.display();
    }
}