class Vehicle implements Cloneable {
    String model;
    int speed;
    public Vehicle(String model, int speed){
        this.model = model;
        this.speed = speed;
    }
    @Override 
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    void display(){
        System.out.println("Model: " + model + ", Speed: " + speed);
    }
}