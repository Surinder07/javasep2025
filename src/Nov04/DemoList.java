package Nov04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(3455);
        System.out.println(List);
        List.add(6, 1256);
        System.out.println(List.get(0));


        int max = List.get(0);

        for (int num : List) {
            if (num > max) {
                max = num;
            }

            System.out.println("The maximun number is :" + max);
        }
    }
}

