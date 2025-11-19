package Nov17.ArrayListAssigments;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListValueExistPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Toronto");
        arrList.add("Vancouver");
        arrList.add("Montreal");
        arrList.add("Ottawa");
        arrList.add("Calgary");
        System.out.println("The list of Cities are : " +arrList);
        System.out.println("Enter the City to search the index of : ");
        String search = scanner.nextLine();

        if (arrList.contains(search)){
            int index = arrList.indexOf(search);
            System.out.println("The " +search + " has index at " +index);
        }else
        {
            System.out.println(search + " Not found");
        }
        scanner.close();
    }
}

