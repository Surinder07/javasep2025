package Nov01;

import java.util.Scanner;

public class DriverExamMain {

    public static void main(String[] args) {
        System.out.println("Welcome !");
        DriverExaminer driverExaminer = new DriverExaminer();

        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Please enter your age: ");
            int age = scanner.nextInt();
            System.out.println(driverExaminer.bookTest(age));
        } catch (RuntimeException e)
        {
            e.printStackTrace();
        }

        driverExaminer.payment();
        System.out.println("End Of Session !");


    }
}
