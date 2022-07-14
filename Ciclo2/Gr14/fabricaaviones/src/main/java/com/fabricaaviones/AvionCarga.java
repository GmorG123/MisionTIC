package com.fabricaaviones;

public class AvionCarga extends Avion{
    
    //constructor
    public AvionCarga(String color, double tamano){
        super(color, tamano);
    }

    //acciones
    public void cargar(){
        System.out.println("carregando...");
    }
    public void descargar(){
        System.out.println("descargando...");
    }
}
