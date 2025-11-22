package Nov21.LinkedHashedSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratePrintNumbers {

    public static void main (String[] args)
    {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(100);
        linkedHashSet.add(500);
        linkedHashSet.add(80);
        linkedHashSet.add(30);
        linkedHashSet.add(200);
        System.out.println("Numbers are : " +linkedHashSet);
        Iterator<Integer> iterator = linkedHashSet.iterator();
        System.out.println("Numbers insertion order : ");
        for (Integer num : linkedHashSet)
        {
            System.out.println(num);
        }

    }

}
