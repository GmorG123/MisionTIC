package HOLAmundo;

public class holamundo{
    public static void main(String[] args) {
        System.out.println("hola mundo");
        System.out.println("segundo commit");
        // variables
        int num = 1;
        double dec = 1.5;
        boolean flag = true;
        String str = "cadena de texto";
        System.out.println("numero: " + num + " decimal: " +dec+ " boolean: " +flag+ " string: " + str);

        // operaciones basicas
        int n1 = 33;
        int n2 = 44;
        int suma = n1 + n2;
        suma += 10;
        int resta = n1 - n2;
        int mult = n1 * n2;
        double division = n1 / n2;
        System.out.println("*********************Funciones\n");

        //llamado de funciones
        sumar();
        restar(138, 50);
        mult = multiplicar();
        System.out.println(mult);
        division = dividir(6.48, 468.15);
        System.out.println(division);
        System.out.printf("limitacion decimal: %.4f", division);
    }
    /********
     * Funciones
     **********/

    //funcion sin parametros y sin retorno
    public static void sumar(){
        int n1 = 12;
        int n2 = 20;
        int suma = n1 + n2;
        System.out.println("suma es: " + suma);
    }

    //funcion con parametro y sin retorno
    public static void restar(double n1, double n2){
        double ans = n1 - n2;
        System.out.println("la resta es: " + ans);
    }

    // funcion sin parametros y con retorno
    public static int multiplicar(){
        int n1 = 10;
        int n2 = 11;
        return(n1 * n2);
    }

    // funcion con parametros y con retorno
    public static double dividir(double n1, double n2){
        double res = n1 / n2;
        return(res);
    }
}