package products;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Products {
    int id;
    String name;
    String brand;
    Double price;

    public Products(int id, String name, String brand, Double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
    public Products() {

    }

    ArrayList<Products> allAppleProducts(ArrayList<Products> list) {
        ArrayList<Products>  allAppProd = new ArrayList<>();
        for(Products item : list) {
            if(item.brand.matches("Apple")) {
                allAppProd.add(item);
            }
        }
        return allAppProd;
    }

    ArrayList<Products> sortByPrice(ArrayList<Products> list) {

        list.sort(Comparator.comparingDouble(p -> p.price));

        return list;

    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
