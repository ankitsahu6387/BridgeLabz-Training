import java.util.ArrayList;

public class SuppressWarning {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Raw ArrayList (no generics)
        ArrayList list = new ArrayList();

        list.add("Java");
        list.add(100);   // Different data types allowed

        // Type casting causes unchecked warning (suppressed)
        ArrayList<String> stringList = list;

        for (String item : stringList) {
            System.out.println(item);
        }
    }
}