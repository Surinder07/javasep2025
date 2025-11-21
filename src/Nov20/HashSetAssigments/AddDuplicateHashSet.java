package Nov20.HashSetAssigments;

import java.util.HashSet;
import java.util.Scanner;

public class AddDuplicateHashSet {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("Enter the total numbers for HashSet : ");
        int num = scanner.nextInt();
        System.out.println("Enter the numbers for HashSet : ");

        for (int i = 0; i < num ; i++)
        {
            hashSet.add(scanner.nextInt());
        }
        System.out.println("The updated list are : " + hashSet);
    }
}
