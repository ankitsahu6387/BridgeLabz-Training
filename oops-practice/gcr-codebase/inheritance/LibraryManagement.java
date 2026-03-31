class Book{
    String title;
    String publicationYear;
    public Book(String title, String publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Publication Year: "+publicationYear);
    }
}
class Author extends Book{
    String authorName;
    String bio;
    public Author(String title, String publicationYear, String authorName, String bio){
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name: "+authorName);
        System.out.println("Bio: "+bio);
    }
}
    public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book("Ego is the Enemy", "2011");
        b1.displayInfo();
        Author a1 = new Author("ABC","2012" , "XYZZ", "Good Book");
        a1.displayInfo();
    }
}
