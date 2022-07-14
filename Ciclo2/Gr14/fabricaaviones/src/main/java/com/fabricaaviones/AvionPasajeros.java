package com.fabricaaviones;

public class AvionPasajeros extends Avion{
    
    private int pasajeros;

    //constructor
    public AvionPasajeros(int pasajeros, String color, double tamano){
        super(color, tamano);
        this.pasajeros = pasajeros;
    }

    //getters
    public int getPasajeros(){
        return pasajeros;
    }

    //setters
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }


    //acciones
    public void servir(){
        System.out.println("Sirviendo alimentos a pasajeros...");
    }
}
