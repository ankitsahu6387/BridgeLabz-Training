public class Main {

    public static void main(String[] args) {
        ParcelTracker parcel = new ParcelTracker();
        // Add standard delivery stages
        parcel.addStage("Packed");
        parcel.addStage("Shipped");
        parcel.addStage("In Transit");
        parcel.addStage("Delivered");
        // Display initial stages
        parcel.trackParcel();
        // Add custom intermediate checkpoints automatically
        parcel.addCheckpoint("Shipped", "Sorting Facility");
        parcel.addCheckpoint("In Transit", "Custom Inspection");
        parcel.trackParcel();
        // Simulate another checkpoint addition
        parcel.addCheckpoint("Packed", "Quality Check");
        parcel.trackParcel();
        // Final tracking summary
        System.out.println("\nFinal Parcel Tracking Summary:");
        parcel.trackParcel();
    }
}
