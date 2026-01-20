public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Fiction", new Book("101", "The Alchemist", "Paulo Coelho"));
        library.addBook("Fiction", new Book("102", "1984", "George Orwell"));
        library.addBook("Technology", new Book("201", "Clean Code", "Robert Martin"));
        library.addBook("Technology", new Book("201", "Clean Code", "Robert Martin")); // duplicate
        library.showCatalog();
        library.borrowBook("Fiction", "102");
        library.showCatalog();
        library.addBook("Fiction", new Book("103", "The Kite Runner", "Khaled Hosseini"));
        library.showCatalog();
    }
}
