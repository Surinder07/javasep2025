package Nov17.ArrayListAssigments;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CountOfStringsStartA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrStr = new ArrayList<>();
        System.out.println("Enter the number of arrayStrings you want to enter : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Strings : ");

        for (int i =0; i < count ; i++)
        {
            String str = scanner.nextLine();
            arrStr.add(str);
        }

        int number = 0;

        for (String s : arrStr)
        {
               if(s.startsWith("A"))
               {
                   number ++;
               }
        }

        System.out.println("The Strings name which starts with 'A' are : " +number);

   }

}
