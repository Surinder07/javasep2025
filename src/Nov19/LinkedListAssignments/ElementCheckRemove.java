package Nov19.LinkedListAssignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ElementCheckRemove {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> FruitsList = new LinkedList<>();
        FruitsList.add("Apple");
        FruitsList.add("Banana");
        FruitsList.add("Orange");
        FruitsList.add("Grapes");
        FruitsList.add("Berry");

        System.out.println("The list of fruits are : " +FruitsList);
        System.out.println("Enter the fruit to be removed :");
        String target = scanner.nextLine().trim();
        Iterator<String> It = FruitsList.iterator();
        boolean search = false;
        while (It.hasNext()) {
            if (It.next().equalsIgnoreCase(target)) {
                It.remove();
                search = true;
            }
        }
            if (search)
                System.out.println("Removed " +target);
            else
                System.out.println(target+"Not found");

            System.out.println("Final List of fruits : " +FruitsList);


        scanner.close();
    }
}
