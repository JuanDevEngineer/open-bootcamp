package bootcamp.oop.inheritance;

public class Person {
    private int age;
    private String name;
    private String phone;

    public Person() {
    }

    public Person(int age, String phone, String name) {
        this.age = age;
        this.phone = phone;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
