package Nov18.HashMapAssigments;

import  java.util.Scanner;
import java.util.HashMap;

public class ProductPriceUpdate {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> productMap = new HashMap<>();
        System.out.print("How many products do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String product = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            productMap.put(product, price);
        }

        System.out.print("\nEnter product name to update price: ");
        String updateProduct = sc.nextLine();

        if (productMap.containsKey(updateProduct)) {
            System.out.print("Enter new price: ");
            double newPrice = sc.nextDouble();
            productMap.put(updateProduct, newPrice);
            System.out.println("Price updated successfully!");
            System.out.println(updateProduct + " → " + newPrice);
        } else {
            System.out.println("Product not found in the list.");
        }
        sc.close();
    }
}
