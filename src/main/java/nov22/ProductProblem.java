package nov22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ProductProblem {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(101, "Galaxy", "Samsung", 1340.00));
        list.add(new Product(102, "Iphone", "Apple", 1288.60));
        list.add(new Product(103, "Edge", "Motorola", 424.50));
        list.add(new Product(104, "Xperia", "Sony", 499.50));
        list.add(new Product(105, "Pixel", "Google", 999.99));
        list.add(new Product(106, "Ipad", "Apple", 1580.00));


        for (Product p : list) {
            System.out.println(p);
        }
        //Remove all products whose price is less than 500
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPrice() < 500) {
                iterator.remove();
            }
        }
        System.out.println("\nProducts over 500 Price are : ");
        for (Product p : list) {
            System.out.println(p);

        }
        // Find the product with the highest price.
        Product max = list.get(0);
        for (Product rate : list) {
            if (rate.getPrice() > max.getPrice()) {
                max = rate;
            }
        }
        System.out.println("\nHighest price " + max);

        // Return a new List containing only the Apple brand products.

        List<Product> appleProduct = new ArrayList<>();
        for (Product apple : list) {
            if (apple.getBrand().equals("Apple")) {
                appleProduct.add(apple);
            }
        }
        for (Product apple : appleProduct) {
            System.out.println("\nApple Products are : " + apple);
        }

        // Sort the list by price in ascending order.
        Collections.sort(list, new ProductComparator());
        System.out.println("\nSorted list in ascending order : " + list);
    }
}

