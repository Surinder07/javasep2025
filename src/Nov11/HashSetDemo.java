package Nov11;
import javax.swing.*;
import java.util.HashSet;
public class HashSetDemo {

    public static void main (String[] args) {
        HashSet<Integer> Hashset = new HashSet<>();
        Hashset.add(10);
        Hashset.add(20);
        Hashset.add(30);
        Hashset.add(40);
        Hashset.add(50);
        System.out.println(Hashset);
        System.out.println(Hashset.remove(new Integer("300")));
        System.out.println(Hashset);
        System.out.println(Hashset.contains(100));
        System.out.println(Hashset.size());
    }
}
