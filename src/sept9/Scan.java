package sept9;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first num: ");
        int x = scanner.nextInt();

        System.out.println("enter second num: ");
        int y = scanner.nextInt();

        System.out.println("enter last number: ");
        int z = scanner.nextInt();

        if(x > y && x > z) {
            System.out.println("Largest number is X " + x);
        } else if (y > z) {
            System.out.println("largest number is Y " + y);
        }else if(x == y && x == z) {
            System.out.println("All numbers are equal: None is greater");
        }
        else {
            System.out.println("largest number is: Z " + z);
        }


    }
}
