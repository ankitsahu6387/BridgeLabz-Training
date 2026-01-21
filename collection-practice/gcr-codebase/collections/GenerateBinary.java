import java.util.*;
public class GenerateBinary {
    public static void main(String[] args) {
        int N = 5;
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }
        System.out.println(result);
    }
}
