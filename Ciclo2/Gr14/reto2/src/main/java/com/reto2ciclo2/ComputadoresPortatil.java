package com.reto2ciclo2;

public class ComputadoresPortatil extends Computadores{
    
    private final static Integer PULGADAS_BASE = 20;
    private int pulgadas;
    private boolean camaraITG;

    public ComputadoresPortatil(double precioBase, int peso, char consumoW, int pulgadas, boolean camaraITG){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }
    public ComputadoresPortatil(double precioBase, int peso){
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }
    public ComputadoresPortatil(){
        super();
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }


    public double calcularPrecio(){
        double adicion = super.calcularPrecio();
        if(pulgadas > 40){
            adicion += getPrecioBase()*0.3;
        }/* else{
            adicion += PULGADAS_BASE;
        } */
        if(camaraITG == true){
            adicion += 50.0;
        }
        
        //adicion += getPrecioBase();
        return adicion;
    }
}
