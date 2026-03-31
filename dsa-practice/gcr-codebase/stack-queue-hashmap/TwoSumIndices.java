import java.util.HashMap;

public class TwoSumIndices {
    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{}; // no solution
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(arr, target);
        if (res.length == 2) {
            System.out.println("Indices: " + res[0] + ", " + res[1]);
        } else {
            System.out.println("No solution");
        }
    }
}
