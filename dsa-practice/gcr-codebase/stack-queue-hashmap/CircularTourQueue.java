import java.util.*;

public class CircularTourQueue {
    static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> q = new LinkedList<>();
        int surplus = 0;
        int i = 0, count = 0;
        while (count < 2 * n) { 
            int idx = i % n;
            q.offer(idx);
            surplus += petrol[idx] - distance[idx];
            while (!q.isEmpty() && surplus < 0) {
                int front = q.poll();
                surplus -= (petrol[front] - distance[front]);
            }
            if (q.size() == n) {
                return q.peek();
            }
            i++;
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};
        System.out.println(findStartingPoint(petrol, distance)); // Output: 2
    }
}
