package com.polimorfismo_animales;

public class Animal {
    //Atributos
    private double tamano;
    private double edad;
    private boolean mamifero;
    private String color;
    private double peso;

    //constructor
    public Animal(double tamano, double edad, boolean mamifero, String color, double peso) {
        this.tamano = tamano;
        this.edad = edad;
        this.mamifero = mamifero;
        this.color = color;
        this.peso = peso;
    }

    //getters
    public double getTamano() {
        return tamano;
    }
    public double getEdad() {
        return edad;
    }
    public boolean isMamifero() {
        return mamifero;
    }
    public String getColor() {
        return color;
    }


    //setters
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    public void setEdad(double edad) {
        this.edad = edad;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    //Acciones
    public void comer(){
        System.out.println("comiendo...");
    }
    public void dormir(){
        System.out.println("durmiendo...");
    }
    public void desplazar(){
        System.out.println("desplazandose");
    }
    
    
}
