package com.empresa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //arreglo
        /* int[] numeros = {0,1,2,3,4,5,6,7,8,9};
        double decimales[] = new double[10];
        decimales[0] = 0.1;
        decimales[1] = 0.2; 
        decimales[2] = 0.3; */
        
        Empresa company_tesla = new Empresa("Tesla", "Calle falsa 123", "1354884");
        company_tesla.menu();

        /* Carro c1 = new Carro("56465", "ABC231");
        System.out.println(c1.getPlaca());
        System.out.println(c1.getModelo()); */

        //ciclos();
    }











    public static void ciclos(){
        //WHILE
        int contador = 0;
        while(contador < 10){
            System.out.println("iteracion " + contador + " dentro de while");
            contador++;
        }

        System.out.println("***********************************************");
        contador = 0;
        //DO-WHILE 
        do{
            System.out.println("iteracion " + contador + " dentro de do-while");
            contador++; 
        }while(contador < 10);

        System.out.println("***********************************************");

        //FOR
        for(int i = 0; i<contador; i++){
            System.out.println("iteracion " + i + " dentro de for");
        }

    }
}
