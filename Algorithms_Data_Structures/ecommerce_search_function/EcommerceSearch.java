package Algorithms_Data_Structures.ecommerce_search_function;

import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "ID: " + productId +
               ", Name: " + productName +
               ", Category: " + category;
    }
}

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(104, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(105, "Headphones", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(103, "Bag", "Fashion")
        };

        int targetId = 103;

        Product linearResult = linearSearch(products, targetId);

        System.out.println("Linear Search Result:");
        System.out.println(linearResult);

        Product[] sortedProducts = products.clone();

        Arrays.sort(sortedProducts,
                Comparator.comparingInt(p -> p.productId));

        Product binaryResult = binarySearch(sortedProducts, targetId);

        System.out.println("\nBinary Search Result:");
        System.out.println(binaryResult);
    }
}
