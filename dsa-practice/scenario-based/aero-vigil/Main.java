import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        FlightUtil util = new FlightUtil();
        System.out.println("Enter Flight Details:");
        String input = sc.nextLine();
        try {
            String[] data = input.split(":");
            String flightNumber = data[0];
            String flightName = data[1];
            int passengerCount = Integer.parseInt(data[2]);
            double fuelLevel = Double.parseDouble(data[3]);

            util.validateFlightNumber(flightNumber);
            util.validateFlightName(flightName);
            util.validdatePassangerCount(passengerCount, flightName);

            double fuelRequired = util.calculateFuelToFillTank(flightName, fuelLevel);
            System.out.println("Fuel required to fill the tank: " + fuelRequired + " liters");
        }
        catch(InvalidFlightException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}
