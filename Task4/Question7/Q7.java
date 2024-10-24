//7. Write a program that demonstrates the concept of composition.

package Task4.Question7;

public class Q7 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Rahul", 97321954385d, "Udupi Karnataka");

        customer1.addProduct(new Product(customer1.getId(), "Sony TV", 70000, 1));

        customer1.addProduct(new Product(customer1.getId(), "Nikon Camera", 80000, 1));

    }
}
