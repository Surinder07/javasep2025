package Nov21.TreeSet;

import java.util.*;

public class SortedNamesAlphabetical {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        names.add("Arun");
        names.add("Bubli");
        names.add("Celena");
        names.add("Amina");
        names.add("Raya");
        names.add("Praghati");

        System.out.println("The list of names are : " +names);
        TreeSet<String> hashSet = new TreeSet<>(names);
        System.out.println("The names are alphabetically : " +hashSet);
    }
}
