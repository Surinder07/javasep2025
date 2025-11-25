package testAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsMain {
    public static void main(String[] args) {
        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products("p1", "Galaxy Buds", "Samsung", 199.00));
        productsList.add(new Products("p2","Galaxy s20","Samsung",2200.50));
        productsList.add(new Products("p3","Pixel 5","Google",1700.20));
        productsList.add(new Products("p4","Airpods","Apple",400.20));
        productsList.add(new Products("p5", "Dell XPS 13", "Dell", 1599.00));

        Products maxPriceProduct = null;
        double maxPrice = Double.MIN_VALUE;

        List<Products> productBrand = new ArrayList<>();

        for (Products p : productsList) {
            if(p.getBrand().equals("Apple")){
                productBrand.add(p);
            }
            if(p.getPrice() > maxPrice){
                maxPrice = p.getPrice();
                maxPriceProduct=p;
            }
        }
        productsList.removeIf(p -> p.getPrice()<500);
        Collections.sort(productsList,new PriceComparator());

        System.out.println("Product with Highest Price: " + maxPriceProduct);
        System.out.println("Apple Brand Products: " + productBrand);
        System.out.println("Products after removing price < 500: " + productsList);
        System.out.println("Sorted Products: " + productsList);
    }
}
