package Nov19.LinkedListAssignments;


import java.util.Iterator;
import java.util.LinkedList;

public class FruitsIterator {

    public static void main (String[] args)
    {
        LinkedList <String> FruitsList = new LinkedList<>();
        FruitsList.add("Apple");
        FruitsList.add("Banana");
        FruitsList.add("Orange");
        FruitsList.add("Grapes");
        FruitsList.add("Berry");

       Iterator<String> It = FruitsList.iterator();
       System.out.println("The list of fruits are : ");

       while (It.hasNext())
       {
           String fruit = It.next();
           System.out.println(fruit);
       }
    }
}
