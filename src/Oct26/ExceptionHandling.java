package Oct26;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of the array !");
        for (int i = 0;i<arr.length; i++)
        {
            arr[i]= scanner.nextInt();
        }

       System.out.println("Printing the array !");

        for (int i=0; i<20;i++)
        {
            try
            {
                System.out.println(arr[i]);

            } catch (ArrayIndexOutOfBoundsException e)
            {
               // e.printStackTrace();
                System.out.println("Caught exception: " + e.getMessage());
            }

        }
        System.out.println("Loop finished!");


    }
}
