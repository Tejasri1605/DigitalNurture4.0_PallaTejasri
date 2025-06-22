import java.util.Arrays;

class Product {
    int id;
    String name;
    String category;
    double price;

    Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return "Product [ID: " + id + 
               ", Name: " + name + 
               ", Category: " + category + 
               ", Price: $" + price + "]";
    }
}

public class EcommerceSearch {

    static int linearSearch(Product[] list, String name) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(Product[] list, String name) {
        int left = 0;
        int right = list.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = list[mid].name.compareToIgnoreCase(name);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] items = {
            new Product(101, "Laptop", "Electronics", 59999.99),
            new Product(102, "Phone", "Electronics", 19999.50),
            new Product(103, "Shirt", "Clothing", 999.99),
            new Product(104, "Book", "Education", 499.00),
            new Product(105, "Shoes", "Footwear", 2499.75)
        };

        int foundIndexLinear = linearSearch(items, "Book");
        System.out.println("Linear Search: " + (foundIndexLinear != -1 ? items[foundIndexLinear] : "Not Found"));

        Arrays.sort(items, (a, b) -> a.name.compareToIgnoreCase(b.name));

        int foundIndexBinary = binarySearch(items, "Book");
        System.out.println("Binary Search: " + (foundIndexBinary != -1 ? items[foundIndexBinary] : "Not Found"));
    }
}
