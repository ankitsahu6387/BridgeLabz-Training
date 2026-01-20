public class Groceries extends WarehouseItem {
    private String expiryDate;
    public Groceries(String id, String name, String expiryDate) {
        super(id, name);
        this.expiryDate = expiryDate;
    }
    @Override
    public String getDetails() {
        return "Grocery item: ID=" + getId() + ", Name=" + getName() + ", Expiry Date=" + expiryDate;
    }
}
