package Task4.Question7;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private double contactNumber;
    private String address;
    private List<Product> products;

    {
        products = new ArrayList<>();
    }

    Customer(String name, double contactNumber, String address) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
//        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        displayProduct();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        System.out.println(products);
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void displayProduct() {
        System.out.println("{");
        products.forEach(System.out::println);
        System.out.println("}\n");
    }
}
