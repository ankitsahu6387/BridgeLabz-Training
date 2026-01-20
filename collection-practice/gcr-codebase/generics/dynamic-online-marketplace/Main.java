public class Main {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000, new GadgetCategory());
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);
        System.out.println(book.getDetails());
        System.out.println(shirt.getDetails());
        System.out.println(phone.getDetails());
    }
}
