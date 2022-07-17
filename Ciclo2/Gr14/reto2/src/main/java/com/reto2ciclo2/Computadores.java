package com.reto2ciclo2;

public class Computadores{
    
    protected final static Integer PESO_BASE = 5;
    private final static Character CONSUMO_W_BASE = 'F';
    private final static Double PRECIO_BASE = 100.0;
    private int peso;
    private char consumoW;
    private double precioBase;

    public Computadores(double precioBase, int peso, char consumoW){
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
    
    }
    public Computadores(double precioBase, int peso){
        this.peso = peso;
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase = precioBase; 
    }
    public Computadores(){
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W_BASE; 
    }

    //getters
    public int getPESO_BASE(){
        return PESO_BASE;
    }
    public char getCONSUMO_W_BASE() {
        return CONSUMO_W_BASE;
    }
    public double getPRECIO_BASE() {
        return PRECIO_BASE;
    }
    public int getPeso() {
        return peso;
    }
    public char getConsumoW() {
        return consumoW;
    }
    public double getPrecioBase() {
        return precioBase;
    }

    //s

    double adicion = 0.0;
  
    public double calcularConsumoW_peso(){
        adicion = 0.0;
        switch(consumoW){
            case 'A':
                adicion += 100.0;
                break;
            case 'B':
                adicion += 80.0;
                break;
            case 'C':
                adicion += 60.0;
                break;
            case 'D':
                adicion += 50.0;
                break;
            case 'E':
                adicion += 30.0;
                break;
            case 'F':
                adicion += 10.0;
            default:
                break;
        }
        if(peso >= 0 && peso < 19){
            adicion += 10;
        }else if(peso >= 20 && peso < 49){
            adicion += 50;
        }else if(peso >= 50 && peso <= 79){
            adicion += 80;
        }else{
            adicion += 100;
        }
        return adicion;
    }

    public double calcularPrecio(){

        adicion = calcularConsumoW_peso() + precioBase; // <-----------error: suma precio base 2 veces
    
        return adicion;
    }

    
}
