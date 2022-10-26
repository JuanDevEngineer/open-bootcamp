package bootcamp.errors;

public class MainErrors {

    public static void main(String[] args) {
        int[][] numbers = {
                {12, 32, 33},
                {31, 32, 33}
        };

        for (int[] number : numbers) {
            for (int i : number) {
                System.out.println(i);
            }
        }
    }
}
