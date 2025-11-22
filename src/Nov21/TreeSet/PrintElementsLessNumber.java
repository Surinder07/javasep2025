package Nov21.TreeSet;

import java.util.*;

public class PrintElementsLessNumber {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> list = new TreeSet<>();
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

        System.out.println("Enter the number you want the other less than numbers : ");
        int lessNum = scanner.nextInt();

        Set<Integer> sort = list.headSet(lessNum);

        System.out.println("The numbers less than " +lessNum + " are :" + sort);
    }
    }




