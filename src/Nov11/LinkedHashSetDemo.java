package Nov11;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main (String[] args)
    {
        LinkedHashSet<Integer> LinkedHash = new LinkedHashSet<>();
        LinkedHash.add(10);
        LinkedHash.add(20);
        LinkedHash.add(30);
        LinkedHash.add(40);
        LinkedHash.add(50);
        System.out.println(LinkedHash);
        System.out.println(LinkedHash.remove(new Integer("40")));
        System.out.println(LinkedHash);
        System.out.println(LinkedHash.contains(20));
        System.out.println(LinkedHash.size());
    }
}
