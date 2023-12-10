package MidtermPractice.TaskOne;

import java.util.ArrayList;
import java.util.List;

class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getters and setters (not shown for brevity)

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return 0;
    }
}

class ProductManager {
    public List<Product> filterProductsByPrice(List<Product> products, double maxPrice) {
        List<Product> filteredProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating some sample products
        Product product1 = new Product(1, "Laptop", 1200.0);
        Product product2 = new Product(2, "Smartphone", 700.0);
        Product product3 = new Product(3, "Headphones", 50.0);
        Product product4 = new Product(4, "Tablet", 300.0);

        // Creating a list of products
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        // Creating an instance of ProductManager
        ProductManager productManager = new ProductManager();

        // Filtering products by price (e.g., maximum price of 500.0)
        double maxPrice = 500.0;
        List<Product> filteredProducts = productManager.filterProductsByPrice(productList, maxPrice);

        // Displaying the filtered products
        System.out.println("Products with a price less than or equal to " + maxPrice + ":");
        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }
}

