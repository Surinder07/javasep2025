package Nov20.HashSetAssigments;

import java.util.HashSet;
import java.util.Scanner;

public class SearchNamesListHashSet {
    public static void main (String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Rahul");
        hashSet.add("Seema");
        hashSet.add("Liza");
        hashSet.add("Liza");
        hashSet.add("Soumen");
        System.out.println("The list of names are : " +hashSet);
        System.out.println("Enter the name to search for : ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();

        if (hashSet.contains(searchName))
        {
            System.out.println("Exists : " +searchName);
        } else
        {
            System.out.println("Not Exists : " +searchName);
        }

    }
}
