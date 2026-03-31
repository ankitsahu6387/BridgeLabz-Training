public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("E01", "Laptop", 2));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("G01", "Rice", "15-03-2026"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("F01", "Table", "Wood"));

        System.out.println("Warehouse Items: ");
        WarehouseUtil.displayItems(electronicsStorage.getItems());
        WarehouseUtil.displayItems(groceryStorage.getItems());
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}