public class CircularRoundabout {
    private VehicleNode tail = null;

    // Add vehicle to roundabout
    public void addVehicle(String vehicleNo) {
        VehicleNode newNode = new VehicleNode(vehicleNo);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove vehicle from roundabout
    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode head = tail.next;
        if (head == tail) {
            tail = null;
        } else {
            tail.next = head.next;
        }
    }

    // Print roundabout state
    public void printRoundabout() {
        if (tail == null) {
            System.out.println("Roundabout empty");
            return;
        }

        VehicleNode temp = tail.next;
        do {
            System.out.print(temp.vehicleNo + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("(back to start)");
    }
}
