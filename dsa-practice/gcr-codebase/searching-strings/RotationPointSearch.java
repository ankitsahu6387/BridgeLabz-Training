public class RotationPointSearch {

    public static int findRotationIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;   // smallest element is on the right side
            } else {
                right = mid;      // smallest element is on the left side or mid
            }
        }
        return left; // index of smallest element
    }
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int index = findRotationIndex(arr);
        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }
}
