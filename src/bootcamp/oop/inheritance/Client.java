package bootcamp.oop.inheritance;

public class Client extends Person {
    private int credit;

    public Client() {
    }

    public Client(int age, String phone, String name, int credit) {
        super(age, phone, name);
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
