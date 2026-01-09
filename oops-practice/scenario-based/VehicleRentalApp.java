interface IRentable {
    double calculateRent(int days);
}
// Base Class
class Vehicle implements IRentable {
    protected int id;
    protected String brand;
    protected double rentPerDay;
    public Vehicle(int id, String brand, double rentPerDay) {
        this.id = id;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }
    @Override
    public double calculateRent(int days) {
        return days * rentPerDay;
    }
    public void displayInfo() {
        System.out.println("Vehicle: " + brand + ", Rent/Day: " + rentPerDay);
    }
}
class Bike extends Vehicle {
    public Bike(int id, String brand, double rentPerDay) {
        super(id, brand, rentPerDay);
    }
}
class Car extends Vehicle {
    public Car(int id, String brand, double rentPerDay) {
        super(id, brand, rentPerDay);
    }
}
class Truck extends Vehicle {
    public Truck(int id, String brand, double rentPerDay) {
        super(id, brand, rentPerDay);
    }
}
class Customer {
    int customerId;
    String name;
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
}

public class VehicleRentalApp {
    public static void main(String[] args) {
        Vehicle bike = new Bike(1, "Yamaha", 300);
        Vehicle car = new Car(2, "Honda", 1200);
        Vehicle truck = new Truck(3, "Tata", 2500);

        bike.displayInfo();
        System.out.println("Rent for 3 days: " + bike.calculateRent(3));

        car.displayInfo();
        System.out.println("Rent for 2 days: " + car.calculateRent(2));

        truck.displayInfo();
        System.out.println("Rent for 1 day: " + truck.calculateRent(1));
    }
}
