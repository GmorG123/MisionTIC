package HOLAmundo;

public class Clase2 {
    public static void main(String[] args) {
        String mensaje = "Jello mundo";
        String Upper = mensaje.toUpperCase();
        String Lower = mensaje.toLowerCase();
        System.out.println("Mayus: " + Upper + " Minus: " + Lower);

        //capturar un caracter a apartir de su posicion
        char chr = mensaje.charAt(4);
        System.out.println("caracter en pos 4: " + chr);
    }
}
