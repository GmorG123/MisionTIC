package com.reto2ciclo2;


public class App 
{
    public static void main( String[] args )
    {
        Computadores computadores[] = new Computadores[6];
        computadores[0] = new Computadores(150.0, 70, 'A');
        computadores[1] = new ComputadoresMesa(70.0, 40);
        computadores[2] = new ComputadoresPortatil(600.0,70,'D',50,false);
        computadores[3] = new Computadores();
        computadores[4] = new Computadores(500.0, 60, 'A');
        computadores[5] = new Computadores(700.0, 50, 'D');
        
        PrecioTotal solucion1 = new PrecioTotal(computadores);
        solucion1.mostrarTotales();
        System.out.println();
        //System.out.println("test: " + computadores[0].getPRECIO_BASE() + " " + computadores[0].getPESO_BASE() + " " + computadores[0].getCONSUMO_W_BASE());
    }
}
