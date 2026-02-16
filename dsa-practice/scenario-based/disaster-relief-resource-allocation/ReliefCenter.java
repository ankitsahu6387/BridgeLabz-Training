import java.util.*;

class ReliefCenter {

    private String centerName;
    private Map<String, Integer> resources = new HashMap<>();
    private Queue<AreaRequest> requestQueue = new LinkedList<>();

    public ReliefCenter(String centerName) {
        this.centerName = centerName;
    }

    // Add stock
    public void addResource(String item, int quantity) {
        resources.put(item, resources.getOrDefault(item, 0) + quantity);
    }

    // Add request (FIFO)
    public void addRequest(AreaRequest request) {
        requestQueue.offer(request);
    }

    // Allocate resources
    public void allocateResources() throws InsufficientResourceException {

        while (!requestQueue.isEmpty()) {

            AreaRequest request = requestQueue.poll(); // FIFO
            System.out.println("Processing request for: " + request.getAreaName());

            for (Map.Entry<String, Integer> entry : request.getRequestedItems().entrySet()) {

                String item = entry.getKey();
                int requiredQty = entry.getValue();
                int availableQty = resources.getOrDefault(item, 0);

                if (availableQty < requiredQty) {
                    throw new InsufficientResourceException(
                            "Insufficient " + item + " for area: " + request.getAreaName());
                }

                resources.put(item, availableQty - requiredQty);

                System.out.println("Allocated " + requiredQty + " " + item);
            }
        }
    }

    // Allocation Report
    public void generateReport() {
        System.out.println("\nRemaining Stock Report:");
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
