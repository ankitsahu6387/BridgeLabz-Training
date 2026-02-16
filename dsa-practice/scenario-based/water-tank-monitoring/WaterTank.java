class WaterTank {
    private String tankID;
    private int capacity;
    private int currentLvl;
    public WaterTank(String tankID, int capacity, int currentLvl) throws InvalidWaterLevelException {
        if(currentLvl> capacity){
            throw new InvalidWaterLevelException("Water level exceeds tank capacity");
        }
        this.tankID = tankID;
        this.capacity = capacity;
        this.currentLvl = currentLvl;
    }    
    public String getTankId(){
        return tankID;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getCurrentLvl(){
        return currentLvl;
    }
    //usage percentage
    public double getUsagePercentage(){
        return ((double) currentLvl/capacity)*100;
    }
    // alert 
    public void checkAlert(){
        if(getUsagePercentage() < 20){
            System.out.println("Alert: Tank "+tankID+ " below 20%");
        }
    }
    @Override
    public String toString() {
        return "Tank ID: " + tankID + ", Capacity: " + capacity;
    }
}
