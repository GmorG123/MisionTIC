package com.polimorfismo_animales;

public class Pez extends Animal{
    public Pez(double tamano, double edad, boolean mamifero, String color, double peso){
        super(tamano, edad, mamifero, color, peso);
    }

    //POLIMORFISMO
    @Override
    public void desplazar() {
        System.out.println("nadando...");
    }
}
