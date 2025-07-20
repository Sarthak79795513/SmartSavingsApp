import java.util.*;

public class ProductStore {
    private static List<Product> productList = new ArrayList<>();

    public static void addProduct(Product p) {
        productList.add(p);
    }

    public static List<Product> getAllProducts() {
        return productList;
    }
}
