public class SelectionSort {

    static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int scores[] = {78, 92, 65, 88, 70, 95};

        selectionSort(scores);

        System.out.println("Sorted Exam Scores:");
        System.out.println(java.util.Arrays.toString(scores));
    }
}
