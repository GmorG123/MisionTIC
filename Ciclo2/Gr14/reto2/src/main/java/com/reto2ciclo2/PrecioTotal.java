package com.reto2ciclo2;

public class PrecioTotal {

    private double totalComputadores = 0.0;
    private double totalComputadoresMesa = 0.0;
    private double totalComputadoresPortatiles = 0.0;
    private Computadores[] listaComputadores;

    public PrecioTotal(Computadores[] listaComputadores){
        this.listaComputadores = listaComputadores;
    }

    public void mostrarTotales(){

        //codigo
        for(int i=0; i<listaComputadores.length; i++){
            if(listaComputadores[i] instanceof Computadores){
                totalComputadores += listaComputadores[i].calcularPrecio();
            }
            if(listaComputadores[i] instanceof ComputadoresMesa){
                totalComputadoresMesa += listaComputadores[i].calcularPrecio();
            }
            if(listaComputadores[i] instanceof ComputadoresPortatil){
                totalComputadoresPortatiles += listaComputadores[i].calcularPrecio();
            }
        } 
        //resultados
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.println("La suma del precio de los computadores de portátiles es de " + totalComputadoresPortatiles);
    }
}
