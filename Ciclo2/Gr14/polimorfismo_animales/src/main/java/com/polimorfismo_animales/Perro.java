package com.polimorfismo_animales;

public class Perro extends Animal{
    private String raza;

    //Constructor
    public Perro(double tamano, double edad, boolean mamifero, String color, double peso, String raza){
        super(tamano, edad, mamifero, color, peso);
        this.raza = raza;
    }

    //getters
    public String getRaza(){
        return raza;
    }

    
    //A
    public void ladrar(){
        System.out.println("woof...");
    }

    //POLIMORFISMO
    @Override
    public void desplazar() {
        System.out.println("corriendo...");
    }
}
