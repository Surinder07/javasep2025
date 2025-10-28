package sept9;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("For English Press 1; for French press 2: ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            System.out.println("For List of options enter the numbers below");
            System.out.println("For sales press 1." );
            System.out.println("For Tech support press 2: ");
            System.out.println("For billing press 3: ");
            System.out.println("for feedback press 4");
            int options = scanner.nextInt();

            switch(options) {
                case 1:

                        System.out.println("Select any of these sales:");
                        System.out.println("For offers press 1");
                        System.out.println("For mobile press 2");
                        String sales = scanner.next();
                        System.out.println("You selected: " + sales);
                        System.out.println("Team will reach out to you shortly. Thanks");
                        break;

                case 2:
                        System.out.println("Select issues below: ");
                        System.out.println("press 1 for Internet issues");
                        System.out.println("press 2 for other issue");
                        int support = scanner.nextInt();
                        if(support == 1) {
                            System.out.println("You entered: " + support + " which is related to Internet Issues");
                            return;
                        }
                        System.out.println("You entered: " + support + " which is related to other issue");
                        break;

                case 3:
                        System.out.println("Select bills options: ");
                        System.out.println("Press 1 for Payment plan");
                        System.out.println("press 2 Bill Payment");
                        int payment = scanner.nextInt();
                        if(payment == 1) {
                            System.out.println("You entered: " + payment + " Which is PAYMENT PLAN");
                            return;
                        }
                        System.out.println("You entered: " + payment + " Which is BILL PAYMENT");
                        break;

                default:
                    System.out.println("press 1 for Kudos");
                    System.out.println("press 2 for complaints");
                    int feedback = scanner.nextInt();
                    if(feedback == 1) {
                        System.out.println("Thanks for the feedback");
                        return;
                    }
                    System.out.println("You complaints have been forwarded");

            }

        }else {
            System.out.println("French speaker isn't available right now please select 1");
        }


    }
}
