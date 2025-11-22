package Nov17.ArrayListAssigments;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxArrayListValue {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the number of Arrays you want to enter :");
        int num = scanner.nextInt();

        System.out.println("Enter the ArrayList numbers :");
        for (int i = 0; i < num ; i++ ) {
           arr.add(scanner.nextInt());
        }

        int max = arr.get(0);
        for (int n : arr){
            if (n > max)
            {
                max = n ;
            }
        }

        System.out.println("The maximum array number is : " + max);
    }
}
