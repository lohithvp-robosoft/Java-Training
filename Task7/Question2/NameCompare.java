package Task7.Question2;

import java.util.Comparator;

public class NameCompare implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {

        if (o1.getName().equals(o2.getName())) {
            return Double.compare(o2.getPrice(), o1.getPrice());

        }
        return o1.getName().compareTo(o2.getName());
    }
}
