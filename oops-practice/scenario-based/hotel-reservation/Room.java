public abstract class Room {
    protected int roomNo;
    protected boolean available = true;
    protected double basePrice;

    public Room(int roomNo, double basePrice) {
        this.roomNo = roomNo;
        this.basePrice = basePrice;
    }
}
