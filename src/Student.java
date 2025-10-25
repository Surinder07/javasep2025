public class Student {
    private String id;
    private String name;
    private double cash;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cash=" + cash +
                '}';
    }

    public Student(String id, String name, double cash) {
        this.id = id;
        this.name = name;
        this.cash = cash;
    }

    public String getId() {git status

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
