import java.util.*;

class Product {
    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return name + " | " + category + " | ₹" + price;
    }
}
    class ECommerceSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone 14", "Mobile", 79999));
        products.add(new Product("Samsung Galaxy S22", "Mobile", 69999));
        products.add(new Product("Dell Inspiron", "Laptop", 59999));
        products.add(new Product("Sony Headphones", "Accessories", 4999));
        products.add(new Product("Logitech Mouse", "Accessories", 999));

        System.out.print("Enter keyword to search: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (Product p : products) {
            if (p.name.toLowerCase().contains(keyword) || p.category.toLowerCase().contains(keyword)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found for keyword: " + keyword);
        }

        sc.close();
    }
}
