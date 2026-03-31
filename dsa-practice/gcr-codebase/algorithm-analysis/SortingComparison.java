import java.util.*;

public class SortingComparison {
    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // Merge Sort
    static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
    // Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int n = 10000;
        Random rand = new Random();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) data[i] = rand.nextInt(n);
        int[] a1 = data.clone();
        int[] a2 = data.clone();
        int[] a3 = data.clone();
        long start, end;
        start = System.currentTimeMillis();
        bubbleSort(a1);
        end = System.currentTimeMillis();
        System.out.println("Bubble Sort Time: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        mergeSort(a2);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort Time: " + (end - start) + " ms");
        start = System.currentTimeMillis();
        quickSort(a3, 0, a3.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (end - start) + " ms");
    }
}
