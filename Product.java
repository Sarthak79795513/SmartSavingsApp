public class Product {
    public String name;
    public double price;
    public String storeName;

    public Product(String name, double price, String storeName) {
        this.name = name;
        this.price = price;
        this.storeName = storeName;
    }

    public String toString() {
        return name + " - ₹" + price + " @ " + storeName;
    }
}
