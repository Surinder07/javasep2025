package Nov11;
import javax.swing.*;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main (String[] args)
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        System.out.println(treeSet);
        System.out.println(treeSet.remove(new Integer("300")));
        System.out.println(treeSet);
        System.out.println(treeSet.contains(100));
        System.out.println(treeSet.size());
    }
}
