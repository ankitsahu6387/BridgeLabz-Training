public class Electronics extends WarehouseItem {
    private int warrantyYears;
    public Electronics(String id, String name, int warrantyYears) {
        super(id, name);
        this.warrantyYears = warrantyYears;
    }
    @Override
    public String getDetails() {
        return "Electronics item: ID=" + getId() + ", Name=" + getName() + ", Warranty Years=" + warrantyYears;
    }
}
