package HOLAmundo;

import java.util.Scanner;


public class Clase2 {
    public static void main(String[] args) {
        String mensaje = "Jello mundo";
        String Upper = mensaje.toUpperCase();
        String Lower = mensaje.toLowerCase();
        System.out.println("Mayus: " + Upper + " Minus: " + Lower);

        //capturar un caracter a apartir de su posicion
        char chr = mensaje.charAt(4);
        System.out.println("caracter en pos 4: " + chr);

        
        math_library();
        eje1_num_suerte();
    }

    public static void math_library(){
        double square_root = Math.sqrt(2);
        System.out.println("raiz cuadrada: " + square_root);

        //power
        double potencia = Math.pow(4, 10);
        System.out.println("4 a la 10: " + potencia);

         
    }

    public static void eje1_num_suerte(){
        System.out.println("Ingrese su fecha de nacimiento:");
        Scanner sc = new Scanner(System.in);
        //Scanner mes = new Scanner(System.in);
        //Scanner year = new Scanner(System.in);
        
        System.out.print("dia: ");
        int dia = sc.nextInt();
        System.out.print("mes: ");
        int mes = sc.nextInt();
        System.out.print("anio: ");
        int anio = sc.nextInt();

        sc.close();

        int suma = dia + mes + anio;

        String s = Integer.toString(suma);
        //String s = String.valueOf(suma);

        int[] num_array = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            num_array[i] = s.charAt(i) - '0';
        }
        suma = 0;
        for(int i=0; i< num_array.length; i++){
            suma += num_array[i];
        }

        System.out.println(suma);
        
        /*
         * Solution 2 con una funcion y trucazos de strings
        */
        
        //suma fecha nacimiento
        String suma_str = "" +(dia + mes + anio); 
        
        //CharAt(i) -> retorna carater de la pos i
        int num_suerte = 0;
        //num_suerte = str_to_int(suma_str.charAt(0)) + str_to_int(suma_str.charAt(1)) + str_to_int(suma_str.charAt(2)) + str_to_int(suma_str.charAt(3));
        for(int i=0; i<suma_str.length(); i++){
            num_suerte += str_to_int(suma_str.charAt(i));
        }
        System.out.println("el numero de suerte es: " + num_suerte);
    }

    public static int str_to_int(char caracter){
        return Integer.parseInt(""+ caracter);
    }
}
