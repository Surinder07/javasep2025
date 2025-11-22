package Nov22;

import java.util.*;

public class CollectionClass {
    public static void main (String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Chetan");
        arrayList.add("Indrani");
        arrayList.add("Zeel");
        arrayList.add("Ahanjit");
        arrayList.add("Indrani");
        arrayList.add("Divya");
        arrayList.add("Edafe");
        arrayList.add("Mike");
        Collections.sort(arrayList);
        System.out.println("Numbers are : " + arrayList);
      /*Collections.reverse(arrayList);
        System.out.println(arrayList);
        List<Integer> unmodifiableList = Collections.unmodifiableList(arrayList);
        System.out.println(unmodifiableList);
        // unmodifiableList.add(10);
        List<Object> objects = Collections.emptyList();
        // objects.add(10);
        System.out.println(objects);
        System.out.println("Frequency : "+Collections.frequency(arrayList,3));*/
        String Frequent = "";
        int highestCount = 0;
        for (String name : arrayList) {
            int freq = Collections.frequency(arrayList, name);
            if (freq > highestCount) {
                highestCount = freq;
                Frequent = name;
            }
        }
        System.out.println("The name with highest frequency is : " + Frequent);
        System.out.println("No. of frequency: " + highestCount);
    }
 }
