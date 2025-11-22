package Nov18.HashMapAssigments;

import java.util.HashMap;
import java.util.Scanner;

public class StudentSearchHashMap {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();
        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            studentMap.put(roll, name);
        }

        System.out.print("\n Enter a roll number to search: ");
        int searchRoll = sc.nextInt();
        if (studentMap.containsKey(searchRoll)) {
            System.out.println("Student Name: " + studentMap.get(searchRoll));
        } else {
            System.out.println("No student found with roll number " + searchRoll);
        }
        sc.close();
    }

}
