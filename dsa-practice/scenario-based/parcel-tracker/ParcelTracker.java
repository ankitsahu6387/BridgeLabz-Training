public class ParcelTracker {

    private ParcelStage head;

    public void addStage(String stageName) {
        ParcelStage newStage = new ParcelStage(stageName);
        if (head == null) {
            head = newStage;
            return;
        }
        ParcelStage temp = head;
        while (temp.getNext() != null) temp = temp.getNext();
        temp.setNext(newStage);
    }

    public void addCheckpoint(String afterStage, String checkpointName) {
        ParcelStage temp = head;
        while (temp != null) {
            if (temp.getStageName().equalsIgnoreCase(afterStage)) {
                ParcelStage newStage = new ParcelStage(checkpointName);
                newStage.setNext(temp.getNext());
                temp.setNext(newStage);
                System.out.println("Checkpoint '" + checkpointName + "' added after '" + afterStage + "'.");
                return;
            }
            temp = temp.getNext();
        }
        System.out.println("Stage '" + afterStage + "' not found.");
    }

    public void trackParcel() {
        if (head == null) {
            System.out.println("No stages defined for this parcel!");
            return;
        }
        System.out.println("\nParcel Tracking Stages:");
        ParcelStage temp = head;
        while (temp != null) {
            System.out.print(temp.getStageName());
            if (temp.getNext() != null) System.out.print(" - ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
