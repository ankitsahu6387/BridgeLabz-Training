import java.util.*;

public class SearchPerformance {
    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random rand = new Random();
        for (int n : sizes) {
            int[] data = new int[n];
            for (int i = 0; i < n; i++) data[i] = rand.nextInt(n * 2);
            int target = data[rand.nextInt(n)]; // pick a random target
            // Linear Search
            long start = System.nanoTime();
            linearSearch(data, target);
            long end = System.nanoTime();
            double linearTime = (end - start) / 1e6; // ms
            // Binary Search (sort first)
            int[] sortedData = data.clone();
            Arrays.sort(sortedData);
            start = System.nanoTime();
            binarySearch(sortedData, target);
            end = System.nanoTime();
            double binaryTime = (end - start) / 1e6; // ms
            System.out.printf("Dataset Size: %,d | Linear Search: %.4f ms | Binary Search: %.4f ms%n", n, linearTime, binaryTime);
        }
    }
}
