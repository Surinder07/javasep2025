package Nov22;

import java.util.*;

public class Main {

        public static void main(String[] args) {

            List<Product> products = new ArrayList<Product>();
            products.add(new Product("1001", "iPhone", "Apple", 1999));
            products.add(new Product("1002", "Galaxy", "Samsung", 1799));
            products.add(new Product("1003", "MacBook", "Apple", 1299));


            System.out.println("The List are :" + products);


            List<Product> toRemove = new ArrayList<Product>();
            for (Product p : products) {
                if (p.getPrice() < 1500) {
                    toRemove.add(p);
                }
            }
            products.removeAll(toRemove);

            System.out.println("\nAfter removing products : " + products);


         Product maxPriceProduct = null;
            for (Product p : products) {
                if (maxPriceProduct == null || p.getPrice() > maxPriceProduct.getPrice()) {
                    maxPriceProduct = p;
                }
            }
            System.out.println("\nHighest priced product:" +maxPriceProduct);

            List<Product> appleProducts = new ArrayList<Product>();
            for (Product p : products) {
                if ("Apple".equalsIgnoreCase(p.getBrand())) {
                    appleProducts.add(p);
                }
            }
            System.out.println("\nApple products:" + appleProducts);

                Collections.sort(products, new Comparator<Product>() {
                public int compare(Product p1, Product p2) {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                }
            });

            System.out.println("\nProducts sorted by price:" + products);
              }

          private static void printList(List<Product> list) {
            for (Product p : list) {
                System.out.println(p);
            }
        }
    }


