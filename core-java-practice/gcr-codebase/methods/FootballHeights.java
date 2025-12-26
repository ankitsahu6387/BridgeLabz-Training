public class FootballHeights {

    static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }
    static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }
    static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }
    static int findShortest(int[] arr) {
        int min = arr[0];
        for (int n : arr) min = Math.min(min, n);
        return min;
    }
    static int findTallest(int[] arr) {
        int max = arr[0];
        for (int n : arr) max = Math.max(max, n);
        return max;
    }
    public static void main(String[] args) {
        int[] heights = generateHeights();
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean: " + findMean(heights));
    }
}
