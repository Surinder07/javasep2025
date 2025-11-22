package Nov20.HashSetAssigments;

import java.util.HashSet;

public class CommonElementsHashSet {
    public static void main (String[] args)
    {
        HashSet<Integer> Set1 = new HashSet<>();
        Set1.add(10);
        Set1.add(20);
        Set1.add(30);
        Set1.add(40);
        Set1.add(50);
        System.out.println("The elements of first HashSet are : " +Set1);

        HashSet<Integer> Set2 = new HashSet<>();
        Set2.add(30);
        Set2.add(40);
        Set2.add(50);
        Set2.add(60);
        Set2.add(70);
        Set2.add(80);
        System.out.println(("The elements of the 2nd HashSet are : " +Set2));

        HashSet<Integer> common = new HashSet<>(Set1);
        common.retainAll(Set2);

        System.out.println("The common elements are : " +common);

    }
}
