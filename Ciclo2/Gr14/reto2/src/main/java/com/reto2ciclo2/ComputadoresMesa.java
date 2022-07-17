package com.reto2ciclo2;

public class ComputadoresMesa extends Computadores{

    private final static int ALMACENAMIENTO_BASE = 50;
    private int almacenamiento;

    public ComputadoresMesa(double precioBase, int peso, char consumoW, int almacenamiento){
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;

    }
    public ComputadoresMesa(double precioBase, int peso){
        super(precioBase, peso); 
        this.almacenamiento = ALMACENAMIENTO_BASE; 
    }
    public ComputadoresMesa(){
        super();
    }


    public int getAlmacenamiento(){
        return almacenamiento;
    }

    public double calcularPrecio(){
        double adicion = super.calcularPrecio();

        if(almacenamiento > 100.0){
            adicion += 50.0;
        }/* else{
            adicion += ALMACENAMIENTO_BASE;
        } */
        return adicion;
    }
}

