package Nov18.HashMapAssigments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IteratorHashMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();
        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

       for (int i = 0; i < n; i++)
       {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            studentMap.put(roll, name);
        }

        System.out.println("\nIterating using keySet():");
        for (Integer key : studentMap.keySet()) {
            System.out.println("Roll: " + key + " → Name: " + studentMap.get(key));
        }

        System.out.println("\nIterating using values():");
        for (String value : studentMap.values()) {
            System.out.println("Name: " + value);
        }

        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll: " + entry.getKey() + " → Name: " + entry.getValue());
        }
        sc.close();
    }
}

