public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new PetrolCar();
        v1.diplaySpeed();
        v1.displayBatteryPercentage();
        
        Vehicle v2 = new ElectricCar();
        v2.diplaySpeed();
        v2.displayBatteryPercentage();
    }
}
