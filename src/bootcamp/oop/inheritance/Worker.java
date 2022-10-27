package bootcamp.oop.inheritance;

public class Worker extends Person {
    private int salary;

    public Worker() {
    }

    public Worker(int age, String phone, String name, int salary) {
        super(age, phone, name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
