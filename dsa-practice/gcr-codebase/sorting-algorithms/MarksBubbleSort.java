import java.util.Arrays;

public class MarksBubbleSort {
    public static void main(String[] args) {
        int[] marks = { 85, 42, 73, 91, 66 };

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Marks:");
        System.out.println(Arrays.toString(marks));
    }
}
