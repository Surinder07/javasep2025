package sept9;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to be print out in the while loop: ");
        int userInput = scanner.nextInt();

        int printedNum = 1;
        int sumOfPrintedNum = 1;
        int sumOfEven = 0;
        int sumOfPrime = 0;

        String text1 = " * ";
        String text2 = " = ";

        while(printedNum <= userInput ) {
            System.out.println("number is: " + printedNum);
            sumOfPrintedNum += printedNum;

            if(printedNum % 2 ==0) {
                sumOfEven += printedNum;
            }else {
                sumOfPrime += printedNum;
            }

            int result = userInput * printedNum;
            String multiplyInput = userInput + text1 + printedNum + text2 + result;
            System.out.println(multiplyInput);

            System.out.println(" ");

            printedNum++;
        }
        //sum of printed number
        System.out.println("input number sum: " + sumOfPrintedNum);


        System.out.println("Even number sum " + sumOfEven);
        System.out.println("Prime number sum " + sumOfPrime);
    }
}
