import java.util.*;

abstract class Vehicle {
    private String VehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String VehicleNumber, String type, double rentalRate) {
        this.VehicleNumber = VehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return VehicleNumber;
    }
    public String getType() {
        return type;
    }
    public double getRentalRate() {
        return rentalRate;
    }
    public abstract double calculateRentalCost(int days);
}
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Car(String VehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(VehicleNumber, insurancePolicyNumber, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        // Just an example formula: 5% of rental rate per day
        return getRentalRate() * 0.05;
    }
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // Bike gets 10% discount
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.03;
    }
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // Truck has 20% extra charge
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000, "C-INS-001"));
        vehicles.add(new Bike("BIKE456", 500, "B-INS-002"));
        vehicles.add(new Truck("TRUCK789", 2000, "T-INS-003"));
        int rentalDays = 3;
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
