package Nov01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        OnlineWebApp onlineWebApp = new OnlineWebApp();
        System.out.println("Enter the Email address : ");
        String email = scanner.next();
        System.out.println("Enter the Username : ");
        String username = scanner.next();
        onlineWebApp.ecomApp(email,username,PaymentMethod.CREDIT_CARD);
        onlineWebApp.ecomApp(email,username,PaymentMethod.MASTER_CARD);

        System.out.println("browse more ...");
        System.out.println("End of App ...");

    }
}
