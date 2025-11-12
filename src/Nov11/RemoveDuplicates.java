package Nov11;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {


    public static void main (String[] args)
    {
        List<Integer> list = Arrays.asList(10,23,434,53,6,343,534,64,43,23,53);
        Set<Integer> numbers = new TreeSet<>();
        Set<Integer> NumDup = new TreeSet<>();

        for (Integer num : list) {
            if (!numbers.add(num)) {
                NumDup.add(num);
            }
        }
        System.out.println("Actual numbers are: " + list);
        System.out.println("Duplicates numbers are: " + NumDup);


    }
}
