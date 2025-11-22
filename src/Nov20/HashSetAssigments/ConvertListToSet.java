package Nov20.HashSetAssigments;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvertListToSet {
    public static void main (String[] args)
    {
        List<String> Str = new ArrayList<>();
        Str.add("Apple");
        Str.add("Banana");
        Str.add("Orange");
        Str.add("Berry");

        System.out.println("Original List : " +Str);
        Set<String> ListSet = new HashSet<>(Str);
        System.out.println("The set are : " +ListSet);
        List<String> FruitList = new ArrayList<>(ListSet);
        System.out.println("Converted list is : " +FruitList);
    }
}
