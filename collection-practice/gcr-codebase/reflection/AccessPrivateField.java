import java.lang.reflect.Field;
class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    // Optional: normal getter for verification
    public int getAge() {
        return age;
    }
}
public class AccessPrivateField {

    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            System.out.println("Original age: " + person.getAge());

            // Access the private field "age"
            Field ageField = Person.class.getDeclaredField("age");

            // Make it accessible
            ageField.setAccessible(true);

            // Modify the private field value
            ageField.setInt(person, 40);

            // Retrieve the updated value
            int modifiedAge = ageField.getInt(person);
            System.out.println("Modified age: " + modifiedAge);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}