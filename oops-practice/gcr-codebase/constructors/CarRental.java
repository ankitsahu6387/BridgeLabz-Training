class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        this("Customer", "Hatchback", 1);
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        double rate;
        if (carModel.equalsIgnoreCase("Sedan"))
            rate = 1500;
        else if (carModel.equalsIgnoreCase("SUV"))
            rate = 2000;
        else
            rate = 1000;

        return rate * rentalDays;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println();
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Ankit", "SUV", 4);

        r1.display();
        r2.display();
    }
}
