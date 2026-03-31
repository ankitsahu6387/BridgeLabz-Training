import java.lang.reflect.Constructor;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class DynamicObjectCreation {

    public static void main(String[] args) {
        try {
            // Get the Class object for Student
            Class<?> studentClass = Class.forName("Student");

            // Get the constructor with parameters (String, int)
            Constructor<?> constructor = studentClass.getConstructor(String.class, int.class);

            // Create an instance dynamically
            Object studentObj = constructor.newInstance("Alice", 101);

            // Invoke the display method
            studentClass.getMethod("display").invoke(studentObj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}