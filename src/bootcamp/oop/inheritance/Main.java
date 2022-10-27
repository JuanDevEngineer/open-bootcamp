package bootcamp.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setAge(49);
        client1.setPhone("312312313");
        client1.setName("Jhon Cena");
        client1.setCredit(10000);
        System.out.println("show first client: ");
        System.out.println("age: " + client1.getAge());
        System.out.println("phone number: " + client1.getPhone());
        System.out.println("names: " + client1.getName());
        System.out.println("credit: " + client1.getCredit());

        System.out.println("\n");

        Client client2 = new Client(29, "313494094", "Juan Carlos", 40000);
        System.out.println("show second client: ");
        System.out.println("age: " + client2.getAge());
        System.out.println("phone number: " + client2.getPhone());
        System.out.println("names: " + client2.getName());
        System.out.println("credit: " + client2.getCredit());

        System.out.println("\n");

        Worker worker1 = new Worker();
        worker1.setAge(23);
        worker1.setPhone("329329393");
        worker1.setName("Paul Walker");
        worker1.setSalary(2000);
        System.out.println("show first worker: ");
        System.out.println("age: " + worker1.getAge());
        System.out.println("phone number: " + worker1.getPhone());
        System.out.println("names: " + worker1.getName());
        System.out.println("current salary: " + worker1.getSalary());

        System.out.println("\n");

        Worker worker2 = new Worker(35, "4124234234", "Ruben Almeida", 41000);
        System.out.println("show second worker: ");
        System.out.println("age: " + worker2.getAge());
        System.out.println("phone number: " + worker2.getPhone());
        System.out.println("names: " + worker2.getName());
        System.out.println("current salary: " + worker2.getSalary());
    }
}