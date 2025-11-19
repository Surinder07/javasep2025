package Nov18.HashMapAssigments;

import java.util.Scanner;
import java.util.HashMap;

public class StringFrequencyCount {

public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();
    HashMap<Character, Integer> freqMap = new HashMap<>();

    for (char ch : input.toCharArray()) {
        if (freqMap.containsKey(ch)) {
            freqMap.put(ch, freqMap.get(ch) + 1);
        } else {
            freqMap.put(ch, 1);
        }
    }
    System.out.println("\nCharacter Frequencies:");
    for (char ch : freqMap.keySet()) {
        System.out.println(ch + " → " + freqMap.get(ch));
    }
    sc.close();
}
}
