import java.util.*;
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String msg){
        super(msg);
    }
}
interface FareCalculator{
    public double calculateFare(double ditance);
}
class NormalFare implements FareCalculator{
    public double calculateFare(double distance){
        return distance*10;
    }
}
class PeakFare implements FareCalculator{
    public double calculateFare(double distance){
        return distance*15;
    }
}
class User{
    int userId;
    String name;
    User(int userId, String name){
        this.userId = userId;
        this.name = name;
    }
}
class Driver{
    int driverId;
    String name;
    boolean available = true;
    Driver(int driverId, String name){
        this.driverId = driverId;
        this.name = name;
    }
}
class Ride {
    User user;
    Driver driver;
    double distance;
    double fare;
    Ride(User user, Driver driver, double distance, FareCalculator calculator){
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = calculator.calculateFare(distance);
    }
}
// CRUD
class RideService{
    List<Driver> drivers = new ArrayList<>();
    List<Ride> rideHistory = new ArrayList<>();
    void addDriver(Driver driver){
        drivers.add(driver);
    }
    Driver assignDriver() throws NoDriverAvailableException{
        for(Driver d : drivers){
            if(d.available){
                d.available = false;
                return d;
            }
        }
        throw new NoDriverAvailableException("No Driver available right now");
    }
    void bookRide(User user, double distance, boolean isPeak){
        try{
            Driver driver = assignDriver();
            FareCalculator calculator = isPeak ? new PeakFare(): new NormalFare();
            Ride ride = new Ride(user, driver, distance, calculator);
            rideHistory.add(ride);
            System.out.println("Ride booked for " + user.name);
            System.out.println("Driver: " + driver.name);
            System.out.println("Fare: " + ride.fare + " Rupees");
        } catch (NoDriverAvailableException e){
            System.out.println(e.getMessage());
        }
    }
}

public class CarBooking {
    public static void main(String[] args) {
        RideService service = new RideService();
        service.addDriver(new Driver(1, "Rahul"));
        service.addDriver(new Driver(2, "Amit"));

        User user1 = new User(101, "Ankit");

        service.bookRide(user1, 12, false); // normal
        service.bookRide(user1, 8, true);   // peak
        service.bookRide(user1, 5, false);  // no driver
    }
}
