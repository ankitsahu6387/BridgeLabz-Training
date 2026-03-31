import java.util.*;

public class SearchComparison {

    public static void main(String[] args) {

        int size = 100000;
        int target = size - 1;

        // Array
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array search
        long start = System.nanoTime();
        linearSearch(array, target);
        long arrayTime = System.nanoTime() - start;

        // HashSet search
        start = System.nanoTime();
        hashSet.contains(target);
        long hashSetTime = System.nanoTime() - start;

        // TreeSet search
        start = System.nanoTime();
        treeSet.contains(target);
        long treeSetTime = System.nanoTime() - start;

        System.out.println("Array Search Time: " + arrayTime + " ns");
        System.out.println("HashSet Search Time: " + hashSetTime + " ns");
        System.out.println("TreeSet Search Time: " + treeSetTime + " ns");
    }

    // Linear search for array
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
