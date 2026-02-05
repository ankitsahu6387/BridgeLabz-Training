public class FlightUtil {
    public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{
        if(!flightNumber.matches("FL-[0-9]{3}")){
            throw new InvalidFlightException("Invalid Flight Number: " + flightNumber);
        }
        return true;
    }
    public boolean validateFlightName(String flightName) throws InvalidFlightException{
        if(!(flightName.equalsIgnoreCase("SpiceJet") ||
            flightName.equalsIgnoreCase("Vistara") ||
            flightName.equalsIgnoreCase("IndiGo") ||
            flightName.equalsIgnoreCase("Air Arabia"))){
            throw new InvalidFlightException("Invalid Flight Name: " + flightName);
        }
        return true;
    }
    public boolean validdatePassangerCount(int passengerCount, String flightName) throws InvalidFlightException{
        int maxCapacity = 0;
        if(flightName.equalsIgnoreCase("SpiceJet")) maxCapacity = 396;
        else if(flightName.equalsIgnoreCase("Vistara")) maxCapacity = 615;
        else if(flightName.equalsIgnoreCase("IndiGo")) maxCapacity = 230;
        else if(flightName.equalsIgnoreCase("Air Arabia")) maxCapacity = 130;
        if(passengerCount <=0 || passengerCount > maxCapacity){
            throw new InvalidFlightException("Invalid Passenger Count: " + passengerCount + " for Flight: " + flightName);
        }
        return true;
    }
    public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException{
        double tankCapacity = 0;
        if(flightName.equalsIgnoreCase("SpiceJet")) tankCapacity = 200000;
        else if(flightName.equalsIgnoreCase("Vistara")) tankCapacity = 300000;
        else if(flightName.equalsIgnoreCase("IndiGo")) tankCapacity = 250000;
        else if(flightName.equalsIgnoreCase("Air Arabia")) tankCapacity = 150000;
        if(currentFuelLevel < 0 || currentFuelLevel > tankCapacity){
            throw new InvalidFlightException("Invalid Fuel Level: " + currentFuelLevel + " for Flight: " + flightName);
        }
        return tankCapacity - currentFuelLevel;
    }
}
