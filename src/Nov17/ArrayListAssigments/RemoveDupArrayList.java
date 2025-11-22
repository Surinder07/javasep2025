package Nov17.ArrayListAssigments;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDupArrayList {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> dupArr = new ArrayList<>();

        System.out.println("Enter the number of arrays : ");
        int numbers = scanner.nextInt();

        System.out.println("Enter the array list numbers are : ");
        for (int i =0; i < numbers; i++)
        {
            arr.add(scanner.nextInt());
        }

        System.out.println("The array list numbers are : " + arr);
        for (int n : arr)
        {
            if (! dupArr.contains(n) )
            {
                dupArr.add(n);

            }
        }
        System.out.println("The duplicate numbers are : " + dupArr);
    }
}
