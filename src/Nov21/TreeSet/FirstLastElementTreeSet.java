package Nov21.TreeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class FirstLastElementTreeSet {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter how many numbers you are to sort :");
        int sortNum = scanner.nextInt();
        System.out.println("Enter the number s to be sorted using TreeSet : ");
        for (int i=0; i< sortNum; i++)
        {
            list.add(scanner.nextInt());

        }
        System.out.println("The random numbers are : " +list);
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        System.out.println("The sorted numbers are : " +treeSet);
        int firstNum = treeSet.first();
        int lastNum = treeSet.last();
        System.out.println("The first element of TreeSet is : " +firstNum);
        System.out.println("The last element of TreeSet is : " +lastNum);
    }
}
