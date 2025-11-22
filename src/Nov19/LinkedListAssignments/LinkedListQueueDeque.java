package Nov19.LinkedListAssignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LinkedListQueueDeque {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> Queue = new LinkedList<>();
        Queue<Integer> Dequeue = new LinkedList<>();
        System.out.println("Enter the number of Queue you want to enter : ");
        int QueueNum = scanner.nextInt();

        System.out.println("Enter the queues VALUES : ");
       for (int i = 0; i<QueueNum ; i++)
        {
            Queue.add(scanner.nextInt());
        }
        System.out.println("The list of numbers in a Queue are : " +Queue);

       for (int i = 0; i<QueueNum ; i++) {
            int removed = Queue.remove();
            System.out.println("Dequeued : " + removed);
        }
        System.out.println("The list of numbers in a Queue are dequeued : " + Queue);
    }
}
