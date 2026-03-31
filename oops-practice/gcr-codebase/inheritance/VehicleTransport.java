class Vehicle{
    int maxSpeed;
    String fuelType;
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo(){
        System.out.println("Max Speed: " +maxSpeed);
        System.out.println("Fuel Type: "+ fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo(){
        System.out.println("Car");
        super.displayInfo();
        System.out.println("Seat Capacity: "+ seatCapacity);
    }
}
class Truck extends Vehicle{
    int seatCapacity;
    public Truck(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo(){
        System.out.println("Truck");
        super.displayInfo();
        System.out.println("Seat Capacity: "+ seatCapacity);
    }
}
class Motorcycle extends Vehicle{
    int seatCapacity;
    public Motorcycle(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo(){
        System.out.println("Motorcycle");
        super.displayInfo();
        System.out.println("Seat Capacity: "+ seatCapacity);
    }
}
public class VehicleTransport {
    public static void main(String[] args) {
        Car c1 = new Car(200, "Diesel", 5);
        c1.displayInfo();
        Truck t1 = new Truck(160, "Diesel", 3);
        t1.displayInfo();
        Motorcycle m1 = new Motorcycle(160, "Petrol", 2);
        m1.displayInfo();
    }
}
