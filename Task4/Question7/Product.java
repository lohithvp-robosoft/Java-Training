package Task4.Question7;

public class Product {
    private int id;
    private String productName;
    private double price;
    private int quantity;

    public Product(int id, String productName, double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductName(String product) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "{" + "Product: " + this.productName + ", " + "Price: " + this.price + ", " + "Quantity: " + this.quantity + "}";
    }
}
