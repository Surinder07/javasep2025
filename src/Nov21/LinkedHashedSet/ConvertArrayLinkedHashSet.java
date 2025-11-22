package Nov21.LinkedHashedSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class ConvertArrayLinkedHashSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter how many numbers you are to sort :");
        int sortNum = scanner.nextInt();
        System.out.println("Enter the numbers to be sorted using LinkedHastSet : ");

        for (int i = 0; i < sortNum; i++) {
            list.add(scanner.nextInt());
        }

        LinkedHashSet<Integer> lnkHash = new LinkedHashSet<>(list);

        System.out.println("The sorted numbers are : " + lnkHash);

    }
}
