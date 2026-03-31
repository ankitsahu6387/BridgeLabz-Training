class Person{
    String name;
    int id;
    Person(String name, int id){
        this.name = name;
        this.id = id;
    }
}
interface Worker{
    public void performDuties();    
}
class Chef extends Person implements Worker{
    Chef(String name, int id){
        super(name, id);
    }
    public void performDuties(){
        System.out.println("Chef cook the food.");
    }
}
class Waiter extends Person implements Worker{
    Waiter(String name, int id){
        super(name, id);
    }
    public void performDuties(){
        System.out.println("Waiter serve the food.");
    }
}
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef c1 = new Chef("Chefu", 1);
        c1.performDuties();
        Waiter w1 = new Waiter("Waitu", 2);
        w1.performDuties();
    }
}
