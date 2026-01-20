public class Furniture extends WarehouseItem {

    private String material;

    public Furniture(String id, String name, String material) {
        super(id, name);
        this.material = material;
    }

    @Override
    public String getDetails() {
        return "Furniture Item: " + getName() + ", Material: " + material;
    }
}
