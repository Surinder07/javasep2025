package Nov08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Peter", "Parker", "peter@gmail.com", 100000));
        employees.add(new Employee(102, "Rajiv", "Bhatt", "rajiv@gmail.com", 150000));
        employees.add(new Employee(103, "Atlas", "M", "atlas@gmail.com", 120000));
        employees.add(new Employee(104, "Rita", "Mellon", "Rita@gmail.com", 115000));
        employees.add(new Employee(105, "Hellen", "Parker", "Hellen@gmail.com", 105000));

 double Salary = Integer.MIN_VALUE;
     for (Employee emp : employees) {
            if (emp.Salary > Salary) {
            //    Salary = emp.getSalary();
               System.out.println(emp.Salary);

            }

        }

        System.out.println(employees);


    }




}
