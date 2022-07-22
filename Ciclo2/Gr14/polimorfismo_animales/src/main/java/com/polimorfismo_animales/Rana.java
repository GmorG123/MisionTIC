package com.polimorfismo_animales;

public class Rana extends Animal{
    private boolean venenosa;

    //constructor
    public Rana(double tamano, double edad, boolean mamifero, String color, double peso, boolean venenosa){
        super(tamano, edad, mamifero, color, peso);
        this.venenosa = venenosa;
    }

    //consultor 
    public boolean getVenenosa(){
        return venenosa;
    }

    //modificador
    public void setVenenosa(boolean venenosa){
        this.venenosa = venenosa;
    }

    //POLIMORFISMO
    @Override
    public void desplazar() {
        System.out.println("saltando...");
    }
}
