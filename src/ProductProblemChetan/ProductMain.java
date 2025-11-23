package ProductProblemChetan;

import java.util.ArrayList;
import java.util.Collections;


public class ProductMain {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "Ipad", "Apple", 2500.35));
        list.add(new Product(2, "Iphone", "Apple", 2000.35));
        list.add(new Product(3, "Airpod", "Apple", 329.45));
        list.add(new Product(4, "Macbook", "Apple", 3550.99));
        list.add(new Product(5, "Galaxy Phone", "Samsung", 2000.35));
        list.add(new Product(6, "Galaxy buds", "Samsung", 400.75));

        System.out.println("Primary Products list :");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            Product a = list.get(i);
            if (a.getPrice() < 500) {
                list.remove(a);
            }
        }
        System.out.println();
        System.out.println("List of products having price more than $500 :");
        System.out.println(list);

        double maxPrice = 0;
        String highestPriceProduct = "";
        for (Product b : list) {
            if (b.getPrice() > maxPrice) {
                maxPrice = b.getPrice();
                highestPriceProduct = b.getName();
            }
        }
        System.out.println();
        System.out.println("Highest Price product is :" + highestPriceProduct);

        ArrayList<Product> appleProducts = new ArrayList<>();
        for (Product a : list) {
            if (a.getBrand() == "Apple") {
                appleProducts.add(a);
            }
        }
        System.out.println();
        System.out.println("List of Apple Products :");
        System.out.println(appleProducts);

        Collections.sort(appleProducts, new ProductPriceComparator());
        System.out.println(appleProducts);

    }
}



