class Vehicle {
    String maxSpeed;
    String model;
    public Vehicle(String maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model= model;
    }
    void display(){
        System.out.println("Max Speed: "+maxSpeed);;
        System.out.println("Model: "+model);
    }
}
interface Refuelable {
    public void refuel();    
}
class ElectricVehicle extends Vehicle{
    public ElectricVehicle(String maxSpeed, String model){
        super(maxSpeed, model);
    }
    void charge(){
        System.out.println("VEhicle is charging");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    public PetrolVehicle(String maxSpeed, String model){
        super(maxSpeed, model);
    }
    public void refuel(){
        System.out.println("Vehicle is refuled");
    }
}
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle e1 = new ElectricVehicle("200", "EV1");
        e1.display();
        e1.charge();
        PetrolVehicle p1 = new PetrolVehicle("260", "P012");
        p1.display();
        p1.refuel();
    }    
}
