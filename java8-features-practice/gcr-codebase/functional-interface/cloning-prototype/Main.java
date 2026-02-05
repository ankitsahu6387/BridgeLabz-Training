public class Main {
    public static void main(String[] args) {
        Vehicle prototype = new Vehicle("Tesla", 120);
        try {
            Vehicle copy1 = (Vehicle) prototype.clone();
            Vehicle copy2 = (Vehicle) prototype.clone();
            copy1.display();
            copy2.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
