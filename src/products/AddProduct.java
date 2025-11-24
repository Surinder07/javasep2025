package products;

import java.util.ArrayList;
import java.util.Comparator;

public class AddProduct {

    public static void main(String[] args) {

        Products products = new Products();
        Products productWithHP = new Products();

        ArrayList<Products> list = new ArrayList<>();

        list.add(new Products(1, "Macbook", "Apple", 3000.80));
        list.add(new Products(2, "Airbook", "Apple", 2000.60));
        list.add(new Products(3, "HP", "Windows", 1200.10));
        list.add(new Products(4, "Airpod", "Apple", 300.50));
        list.add(new Products(5, "Azer", "Window", 1000.70));
        list.add(new Products(6, "Probook", "Window", 200.15));
        list.add(new Products(7, "Iphone", "Apple", 1300.40));


        double maxProduct = Double.MIN_VALUE;


        for(int i =  list.size() - 1; i >=0; i--) {
            Products item = list.get(i);
            if(item.price < 500) {
                list.remove(i);
            }
            if(item.price > maxProduct) {
                productWithHP = item;
            }
        }

        //listing all apple products
        var appleProducts = products.allAppleProducts(list);

        //sorting all apple products by price in ascending order
        var sortedProd = products.sortByPrice(list);

       System.out.println("Prod price greater than 500 " + list);
        System.out.println();

       System.out.println("Product with highest price " + productWithHP);
        System.out.println();

        System.out.println("All Apple products" + appleProducts);
        System.out.println();

        System.out.println("sorted in asc by price " + sortedProd);


    }
}
