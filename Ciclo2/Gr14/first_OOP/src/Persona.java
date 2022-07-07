/**
 * Persona
 */
public class Persona {
    //Atributos
    private String nombre;
    private String apellido;

    //metodo Constructor
    public Persona(String nombre, String apellido){
        // this.nombre -> referencia al atributo "nombre" de la clase
        // nombre referencia a el parametro del constructor
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Hola personA, mi nombre es: " + nombre +" " + apellido);
    }
}