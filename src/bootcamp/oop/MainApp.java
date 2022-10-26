package bootcamp.oop;

public class MainApp {

    /**
     * private abstract, encapsulation
     */
    public static void main(String[] args) {
        // Instancia de persona
        Persona persona = new Persona();

        // set de los valores
        persona.setEdad(19);
        persona.setNombre("Juan Jose");
        persona.setTelefono("321321312312");

        // mostrando la informacion por medio de los getters
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}
