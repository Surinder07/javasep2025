package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {


    public static void main (String[] args)

    {
        List<Product> products = new ArrayList<>();

        products.add(new Product("101", "Apple"," Airpods max", 600.5));
        products.add(new Product("102", "Samsung"," Galaxy ", 900));
        products.add(new Product("103", "Apple"," Macbook Air", 1200));
        products.add(new Product("104", "LG"," Monitor", 460));
        products.add(new Product("105", "Sony"," Headphones", 500));

        Collections.sort(products);
        System.out.println(products);

    }
}
