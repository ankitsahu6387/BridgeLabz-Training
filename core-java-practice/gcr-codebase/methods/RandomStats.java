public class RandomStats {

    static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }
    static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
        double[] result = findAverageMinMax(nums);
        System.out.println("Average: " + result[0]);
        System.out.println("Min: " + (int)result[1]);
        System.out.println("Max: " + (int)result[2]);
    }
}
