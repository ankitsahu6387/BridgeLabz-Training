import java.util.HashSet;

public class LongestConsecutiveSequence {
    static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int longest = 0;
        for (int x : set) {
            // Start only if x is the beginning
            if (!set.contains(x - 1)) {
                int curr = x;
                int count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // Output: 4
    }
}
