package Nov18.HashMapAssigments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestMarksHashMap {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> marksMap = new HashMap<>();
        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();// consume newline

            marksMap.put(name, marks);
        }

        // Find the key with highest value
        String topStudent = null;
        int highestMarks = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            if (entry.getValue() > highestMarks) {
                highestMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        // Display result
        System.out.println("\nStudent with highest marks:");
        System.out.println(topStudent + " → " + highestMarks);

        sc.close();
    }

    }

