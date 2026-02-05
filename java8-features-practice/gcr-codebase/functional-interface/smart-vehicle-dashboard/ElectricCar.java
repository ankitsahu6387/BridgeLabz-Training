public class ElectricCar implements Vehicle {
    public void diplaySpeed() {
        System.out.println("Speed: 70 km/h ");
    }
    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery Percentage: 85%");
    }    
}
