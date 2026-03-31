class Device{
    int deviceId;
    String status;
    Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus(){
        System.out.println("Device ID: "+deviceId);
        System.out.println("Status: "+status);
    }
}
class Thermostat extends Device{
    String temperatureSetting;
    Thermostat(int deviceId, String status, String temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    void displayStatus(){
        super.displayStatus();
        System.out.println("temperature Setting: "+temperatureSetting);
    }
}
public class SmartHome {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat(2, "Working","45");
        t1.displayStatus();
    }
}
