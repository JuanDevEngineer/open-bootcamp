package bootcamp.functions;

class MainApp {

    public static void main(String[] args) {
        System.out.println("// print sum of three values and a function");
        var result = sumValues(1,3,4);
        System.out.println("sum values: "+result);

        System.out.println("\n// print doors number that have one car");
        Car car = new Car();

        car.addDoors(); // add one door
        car.addDoors(); // add two doors
        car.addDoors(); // add three doors
        car.addDoors(); // add four doors
        car.addDoors(); // add five door
        System.out.println("added doors: " + car.getDoors());
    }

    public static int sumValues(int a, int b, int c) {
        return a + b + c;
    }
}