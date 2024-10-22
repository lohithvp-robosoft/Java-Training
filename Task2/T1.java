package Task2;
import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;
    private boolean inStock;

    public Product(int id, String name, double price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}

class T1 {
    public static void calcTotalValue(List<Product> products) {
        double totalValue = 0;
        for (int i = 0; i < products.size(); i++) {
            Product ele = products.get(i);
            if (ele.isInStock()) totalValue += ele.getPrice();
        }
        System.out.println("Total value of Stock is $" + totalValue);
    }

    public static String[] expProduct(List<Product> products) {
        double maxPrice = -1;
        int id = -1;
        for (Product ele : products) {
            if (maxPrice < ele.getPrice()) {
                maxPrice = ele.getPrice();
                id = ele.getId();
            }
        }
        Product product = products.get(id - 1);
        return new String[]{
                product.getName(), String.valueOf(product.getPrice())
        };
    }

    public static void aboveThresholdPrice(List<Product> products, double thresholdPrice) {
        int cnt = 0;
        int i = 0;
        while (i < products.size()) {
            Product ele = products.get(i);
            if (ele.getPrice() > thresholdPrice) cnt++;
            i++;
        }
        System.out.println("The number of products above threshold $" + thresholdPrice + " is " + cnt);
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add((new Product(1, "Laptop", 999.99, true)));
        products.add((new Product(2, "Smartphone", 499.99, false)));
        products.add((new Product(3, "Tablet", 299.99, true)));

        // CASE 1
        calcTotalValue(products);

        //CASE 2
        String[] expProdPrice = expProduct(products);
        System.out.println(Arrays.toString(expProdPrice));

        // CASE 3
        aboveThresholdPrice(products, 400);
    }
}
