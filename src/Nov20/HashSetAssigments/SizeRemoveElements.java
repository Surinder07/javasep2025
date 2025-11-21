package Nov20.HashSetAssigments;

import java.util.HashSet;

public class SizeRemoveElements {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Rahul");
        hashSet.add("Seema");
        hashSet.add("Liza");
        hashSet.add("Lisa");
        hashSet.add("Soumen");
        System.out.println("Size of the names before removal : " + hashSet.size());

        hashSet.remove("Liza");

        System.out.println("Size of the names after removal : " + hashSet.size());




    }
}
