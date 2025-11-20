package Nov19.LinkedListAssignments;

import java.util.LinkedList;
import java.util.Scanner;

public class StoreCityNames {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> strCities = new LinkedList<>();

        System.out.println("Enter the number of cities you would like to enter : ");
        int numCities = scanner.nextInt();
        System.out.println("Enter the list of cities : " );
        scanner.nextLine();
        for (int i = 0 ; i <= numCities ; i++)
        {
            strCities.add(scanner.nextLine());
        }

        System.out.println("The list of Cities are : " + strCities);
        System.out.println("Enter the First city you want to insert : ");
        String firstCity = scanner.nextLine();
        strCities.addFirst(firstCity);

        System.out.println("Enter the Last city you want to insert : ");
        String lastCity = scanner.nextLine();
        strCities.addLast(lastCity);

        System.out.println("The new list of Cities are : " + strCities);
    }

}
