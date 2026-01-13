public class Main {
    public static void main(String[] args) {

        CircularRoundabout roundabout = new CircularRoundabout();
        VehicleQueue waitingQueue = new VehicleQueue(3);

        waitingQueue.enqueue("CAR-101");
        waitingQueue.enqueue("CAR-102");
        waitingQueue.enqueue("CAR-103");
        waitingQueue.enqueue("CAR-104"); // Overflow

        // Move vehicles from queue to roundabout
        while (!waitingQueue.isEmpty()) {
            roundabout.addVehicle(waitingQueue.dequeue());
        }

        roundabout.printRoundabout();

        roundabout.removeVehicle(); // Exit one car
        roundabout.printRoundabout();
    }
}
