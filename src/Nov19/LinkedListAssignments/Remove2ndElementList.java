package Nov19.LinkedListAssignments;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class Remove2ndElementList {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> Elements = new LinkedList<>();
        System.out.println("Enter the number of elements : ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("The elements are : ");

        for (int i = 0; i< num ; i++)
        {
            Elements.add(scanner.nextInt());
        }

        Elements.remove(1);
        System.out.println("After removing the 2nd element, the final list of elements are : " + Elements);

        }
}
