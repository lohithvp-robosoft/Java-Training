package Task2;

import java.util.*;

class T1_Using_HashMap {
    public static void calcTotalValue(List<HashMap<String, Object>> products) {
        double totalValue = 0;
        for (HashMap<String, Object> prod : products) {
            if ((prod.get("inStock").equals(true))) {
                totalValue += (double) prod.get("Price");
            }
        }
        System.out.println("Total value of Stock is $" + totalValue);
    }

    public static String[] expProduct(List<HashMap<String, Object>> products) {
        double maxPrice = -1;
        int id = -1;
        for (HashMap<String, Object> prod : products) {
            if (maxPrice < (double) prod.get("Price")) {
                maxPrice = (double) prod.get("Price");
                id = (int) prod.get("Id");
            }
        }
        HashMap<String, Object> product = products.get(id - 1);
        return new String[]{(String) product.get("Name"), String.valueOf((double) product.get("Price"))};
    }

    public static void aboveThresholdPrice(List<HashMap<String, Object>> products, double thresholdPrice) {
        int cnt = 0;
        for (HashMap<String, Object> prod : products) {
            if ((double) prod.get("Price") > thresholdPrice) cnt++;
        }
        System.out.println("The number of products above threshold $" + thresholdPrice + " is " + cnt);
    }

    public static HashMap<String, Object> createProduct(int id, String name, double price, boolean inStock) {
        HashMap<String, Object> product = new HashMap<>();
        product.put("Id", id);
        product.put("Name", name);
        product.put("Price", price);
        product.put("inStock", inStock);

        return product;
    }

    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> products = new ArrayList<>();

        products.add(createProduct(1, "Laptop", 999.99, true));
        products.add(createProduct(2, "Smartphone", 499.99, false));
        products.add(createProduct(3, "Tablet", 299.99, true));


        // CASE 1
        calcTotalValue(products);

        //CASE 2
        String[] expProdPrice = expProduct(products);
        System.out.println(Arrays.toString(expProdPrice));

        // CASE 3
        aboveThresholdPrice(products, 400);
    }
}
