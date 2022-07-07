/**
 * Persona
 */
public class Persona {
    //Atributos (generalmente privados)
    private String nombre;
    private String apellido;
    private int edad;

    //metodo Constructor
    public Persona(String nombre, String apellido){
        // this.nombre -> referencia al atributo "nombre" de la clase
        // nombre referencia a el parametro del constructor
        this.nombre = nombre;
        this.apellido = apellido;
        //System.out.println("Hola personA, mi nombre es: " + nombre +" " + apellido);
    }

    //metodos consultores (generalmente publicos)
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido; 
    }
    public int getEdad(){
        return edad;
    }

    //metodos modificadores
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    //Acciones - Comportamientos
    public int calc_num_suerte(int dia, int mes){
        int num_suerte = (edad * mes) / dia;
        return num_suerte; 
    }
}