package Nov11;

import Nov08.Employee;
import java.util.TreeSet;
import java.util.*;

public class EmployeeDuplicates {

    public static void main(String[] args) {
        List<EmployeeList> employees = Arrays.asList(
                new EmployeeList("Peter", "peter@gmail.com", 12365478),
                new EmployeeList("Rajiv", "rajiv@gmail.com", 36985745),
                new EmployeeList("Atlas", "atlas@gmail.com", 896544452),
                new EmployeeList("Rajiv", "rajiv@gmail.com", 36985745),
                new EmployeeList("Atlas", "atlas@gmail.com", 896544452)
        );

        Set<EmployeeList> RightEmployees = new HashSet<>();

        for (EmployeeList emp : employees) {
                      if (!RightEmployees.add(emp)) {
                System.out.println("Duplicates found: " + emp);
            }
        }
    }

}










