import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {

            ReliefCenter center = new ReliefCenter("Central Relief Hub");

            // Add stock
            center.addResource("Food", 100);
            center.addResource("Water", 200);
            center.addResource("MedicalKit", 50);

            // Area 1 Request
            Map<String, Integer> area1Items = new HashMap<>();
            area1Items.put("Food", 30);
            area1Items.put("Water", 50);

            // Area 2 Request
            Map<String, Integer> area2Items = new HashMap<>();
            area2Items.put("Food", 40);
            area2Items.put("MedicalKit", 20);

            center.addRequest(new AreaRequest("Area A", area1Items));
            center.addRequest(new AreaRequest("Area B", area2Items));

            // Allocate FIFO
            center.allocateResources();

            // Report
            center.generateReport();

        } catch (InsufficientResourceException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
