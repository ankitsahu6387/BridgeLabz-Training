public class Book {
    static String libraryName;
    String title;
    String author;
    final String isbn;
    static void displayLibraryName(){
        System.out.println("Library Name is: "+libraryName);

    }
    Book(String libraryName,String title, String author, String isbn){
        Book.libraryName = libraryName;
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }
    void displayDetails(){
        if(this instanceof Book ){
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: "+ author);
            System.out.println("ISBN: "+ isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Egmore Library","Effective Java","Joshua Bloch", "978-0134685991");
        b1.displayDetails();
    }
} 
