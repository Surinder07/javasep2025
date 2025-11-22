package Nov21.LinkedHashedSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class OperationsHashSetPerformance {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = 1_00_000;
        Random random = new Random();

        HashSet<Integer> hashSet = new HashSet<>();
        long startTime = System.nanoTime();
        for (int i =0; i < size; i++)
        {
            hashSet.add(random.nextInt(size));
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet Add Time : " +(endTime-startTime)/1_00_000 + "ms");
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++)
        {
            hashSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet Remove Time: " +(endTime - startTime)/1_00_000 + "ms");

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        startTime = System.nanoTime();
        for (int i =0 ; i < size; i++)
        {
            linkedHashSet.add(random.nextInt(size));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Add time: " +(endTime-startTime)/1_00_000 + "ms");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++)
        {
            linkedHashSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHash remove Time : " +(endTime-startTime)/1_00_000 + "ms");

    }
}
