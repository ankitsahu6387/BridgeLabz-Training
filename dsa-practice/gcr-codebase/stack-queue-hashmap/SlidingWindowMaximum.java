import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    static int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            // Remove elements outside window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            // Store max once first window is completed
            if (i >= k - 1) {
                result[idx++] = arr[dq.peekFirst()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = maxSlidingWindow(arr, k);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
