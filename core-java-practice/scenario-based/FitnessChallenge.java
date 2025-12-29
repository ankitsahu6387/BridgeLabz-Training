public class FitnessChallenge {
    public static void main(String[] args) {
        int[] pushUps = {20, 0, 15, 25, 0, 30, 10};
        int total = 0;
        int days = 0;
        for (int count : pushUps) {
            if (count == 0) {
                continue;
            }
            total += count;
            days++;
        }
        double average = (days == 0) ? 0 : (double) total / days;
        System.out.println("Total push-ups (excluding rest days): " + total);
        System.out.println("Average push-ups per active day: " + average);
    }
}
