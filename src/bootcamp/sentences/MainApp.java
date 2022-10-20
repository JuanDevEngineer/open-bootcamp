package bootcamp.sentences;

public class MainApp {
    public static void main(String[] args) {

        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIf = -1;
        if(numeroIf > 0) {
            System.out.println("el numero es positivo: " + numeroIf);
        } else if (numeroIf < 0) {
            System.out.println("el numero es negativo: " + numeroIf);
        } else {
            System.out.println("el numero es igual a cero: " + numeroIf);
        }

        /*
        * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        * el bloque de código que tendrá el bucle deberá:
        * * Incrementar el valor de la variable en uno cada vez que se ejecute.
        * * Mostrarlo por pantalla cada vez que se ejecute.
        */
        var numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        var numeroDoWhile = 2;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

        /*
         * Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
         * que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y
         * deberá mostrarse por pantalla.
         */
        for (var numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        String estacion = "summer";

        switch (estacion) {
            case "spring":
                System.out.println("estacion actual: "+ estacion);
                break;
            case "summer":
                System.out.println("estacion actual: "+ estacion);
                break;
            case "autumn":
                System.out.println("estacion actual: "+ estacion);
                break;
            case "winter":
                System.out.println("estacion actual: "+ estacion);
                break;
            default:
                System.out.println("estacion incorrecta");
        }
    }
}
