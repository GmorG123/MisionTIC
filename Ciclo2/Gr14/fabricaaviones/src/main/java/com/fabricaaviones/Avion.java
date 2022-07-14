package com.fabricaaviones;

public class Avion {

    //Atributos
    private String color;
    private double tamano;

    //Constructor
    public Avion(String color, double tamano){
        this.color = color;
        this.tamano = tamano;
    }

    
    //consultores
    public String getColor(){
        return color;
    }
    public double getTamano(){
        return tamano;
    }

    //modificadores
    public void setColor(String color){
        this.color = color;
    }
    
    //Acciones
    public void despegar(){
        System.out.println("despegando...");
    }
    public void aterrizar(){
        System.out.println("aterrizando...");
    }
    public void frenar(){
        System.out.println("frenando...");
    }
}
