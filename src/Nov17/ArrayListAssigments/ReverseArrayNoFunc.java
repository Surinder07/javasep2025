package Nov17.ArrayListAssigments;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayNoFunc {

    public static void main (String[] args)
    {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> arrLst = new ArrayList<>();

            System.out.println("Enter the number of array's : ");
            int num = scanner.nextInt();

            System.out.println("Enter the array list : ");
            for (int i =0; i < num ; i++)

            {
                arrLst.add(scanner.nextInt());

            }
            int leftRev = 0;
            int rightRev = arrLst.size() - 1 ;
            while (leftRev < rightRev)
            {
                int temp = arrLst.get(leftRev);
                arrLst.set(leftRev, arrLst.get(rightRev));
                arrLst.set(rightRev,temp);

                leftRev ++;
                rightRev --;
            }
          System.out.println("Reversed list : " +arrLst);
    }
}
