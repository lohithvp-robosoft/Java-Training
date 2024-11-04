package Task7.Question2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {

        List<Product> productsData = Arrays.asList(
                new Product("Mobile", 95000d),
                new Product("AC", 25000d),
                new Product("Laptop", 65000d),
                new Product("Mobile",9000d)
        );


        Collections.sort(productsData, new NameCompare());
        System.out.println(productsData);
    }
}
