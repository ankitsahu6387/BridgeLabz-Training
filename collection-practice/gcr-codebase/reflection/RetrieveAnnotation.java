import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

// Apply the annotation to a class
@Author(name = "John Doe")
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }
}

public class RetrieveAnnotation {

    public static void main(String[] args) {
        try {
            // Get the Class object
            Class<Book> clazz = Book.class;

            // Check if @Author is present
            if (clazz.isAnnotationPresent(Author.class)) {
                Author author = clazz.getAnnotation(Author.class);
                System.out.println("Author Name: " + author.name());
            } else {
                System.out.println("No @Author annotation found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}   