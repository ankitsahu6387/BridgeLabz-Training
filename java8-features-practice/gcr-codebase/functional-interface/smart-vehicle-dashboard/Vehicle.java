interface Vehicle {
    void diplaySpeed();
    default void displayBatteryPercentage() {
        System.out.println("Battery information not available");
    }    
}
