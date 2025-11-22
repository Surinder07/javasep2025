package Nov21.LinkedHashedSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class DuplicateElementsOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> lnkHash = new LinkedHashSet<>();
        System.out.println("Enter how many numbers you are to sort :");
        int sortNum = scanner.nextInt();
        System.out.println("Enter the numbers to be sorted using LinkedHastSet : ");

        for (int i = 0; i < sortNum; i++) {
            lnkHash.add(scanner.nextInt());
        }

        System.out.println("The sorted numbers are : " + lnkHash);

    }
}
