import java.util.*;

public class CinemaTime {
    private List<String> titles = new ArrayList<>();
    private List<String> times = new ArrayList<>();

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        validateTime(time);
        titles.add(title);
        times.add(time);
    }

    public void searchMovie(String keyword) {
        boolean found = false;
        try {
            for (int i = 0; i < titles.size(); i++) {
                if (titles.get(i).contains(keyword)) {
                    System.out.println(formatMovie(i));
                    found = true;
                }
            }
            if (!found) {
                throw new IndexOutOfBoundsException("Movie not found");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Search Error: " + e.getMessage());
        }
    }

    public void displayAllMovies() {
        for (int i = 0; i < titles.size(); i++) {
            System.out.println(formatMovie(i));
        }
    }

    public void printReport() {
        String[] report = titles.toArray(new String[0]);
        System.out.println("\nPrintable Movie Report:");
        for (int i = 0; i < report.length; i++) {
            System.out.println(report[i] + " at " + times.get(i));
        }
    }

    private String formatMovie(int index) {
        return String.format("Movie: %s | Time: %s", titles.get(index), times.get(index));
    }

    private void validateTime(String time) throws InvalidTimeFormatException {
        if (!time.matches("([01]\\d|2[0-3]):[0-5]\\d")) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
    }
}
