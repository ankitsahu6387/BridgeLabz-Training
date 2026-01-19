import java.util.Arrays;

public class LinearBinaryChallenge {
    // Linear Search: Find first missing positive integer
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        // Step 1: Replace negatives and zeros with n+1
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) arr[i] = n + 1;
        }
        // Step 2: Mark visited numbers
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }
        // Step 3: Find first positive index
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) return i + 1;
        }
        return n + 1;
    }

    // Binary Search: Find index of target in sorted array
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr); // sort the array first
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;
        // Linear Search
        int missing = firstMissingPositive(arr.clone());
        System.out.println("First missing positive: " + missing);
        // Binary Search
        int index = binarySearch(arr.clone(), target);
        System.out.println("Index of target " + target + ": " + index);
    }
}
