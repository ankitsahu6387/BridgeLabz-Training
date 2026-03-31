class Item {

    String itemCode;
    String itemName;
    double price;

    void displayItem() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + itemName);
        System.out.println("----------------------------");
    }
}

public class InventoryTracker {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemCode = "01AA";
        item1.itemName = "Water bottle";
        item1.price = 500.0;

        Item item2 = new Item();
        item2.itemCode = "01BB";
        item2.itemName = "Rice";
        item2.price = 700.0;

        Item item3 = new Item();
        item3.itemCode = "02AA";
        item3.itemName = "blackboard";
        item3.price = 400.0;

        item1.displayItem();
        item2.displayItem();
        item3.displayItem();
    }
}
