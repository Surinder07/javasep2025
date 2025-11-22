package Nov08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<>();
        List.add("Toronto");
        List.add("Mississuaga");
        List.add("Brampton");
        List.add("Niagara");
       // List.addFirst("Pickering");
       // String lastElement = List.getLast();
      //  System.out.println("The last element is : " +lastElement);

        LinkedList<Integer> Numbers = new LinkedList<>();
        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(30);
        Numbers.add(40);
        Numbers.add(50);

        LinkedList<Object> Obj = new LinkedList<>();
        Obj.addAll(List);
        Obj.addAll(Numbers);
     // Obj.add("London");
     // Obj.remove("Brampton");
        System.out.println(Obj);
    }
}
