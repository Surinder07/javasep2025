package Nov01;


import java.util.Scanner;

public class DriverExaminer {

    int age;

    public String bookTest(int age) {
       if (age <= 15)
        {
            throw new InvalidAgeException("Invalid age for booking exception !");
        }
       return  "You can book exam !";
    }

    public void payment(){
        System.out.println("Need to pay fee for booking the exam !");
    }






}
