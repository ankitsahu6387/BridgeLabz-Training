public class CountingSortAges {

    static void countingSort(int arr[]) {
        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];

        // Count frequency of each age
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (stable sort)
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int ages[] = {12, 15, 10, 18, 14, 11, 16, 13};

        countingSort(ages);

        System.out.println("Sorted Student Ages:");
        System.out.println(java.util.Arrays.toString(ages));
    }
}
