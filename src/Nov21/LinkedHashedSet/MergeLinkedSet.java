package Nov21.LinkedHashedSet;

import java.util.LinkedHashSet;

public class MergeLinkedSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("D");
        set2.add("E");
        set2.add("B");

        set1.addAll(set2);
        System.out.println("Merged LinkedHashSet (order preserved):");
        for (String item : set1)
        {
           System.out.println(item);
        }
    }
}
