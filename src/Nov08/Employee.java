package Nov08;

public class Employee {

    int id;
    String firstName;
    String lastName;
    String email;
    Double Salary;

    public Employee(int id, String Fname, String Lname, String Email, double salary) {
        this.id = id;
        this.firstName = Fname;
        this.lastName = Lname;
        this.email = Email;
        this.Salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int SetId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail() {
        return email;
    }

    public double getSalary() {
        return Salary;
    }

    public double setSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + id +
                ", Name='" + firstName + " " + lastName + '\'' +
                ", Email='" + email + '\'' +
                ", Salary=" + Salary +
                '}';

    }
}