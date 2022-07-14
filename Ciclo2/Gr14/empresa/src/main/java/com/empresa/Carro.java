package com.empresa;

public class Carro {
    private String color;
    private double vel_maxima;
    private String modelo;
    private String placa;

    //constructor todos los parametros
    public Carro(String color, double vel_maxima, String modelo, String placa){
        this.color = color;
        this.vel_maxima = vel_maxima;
        this.modelo = modelo;
        this.placa = placa;
    }
    //constructos solo modelo y placa
    public Carro(String modelo, String placa){
        this.color = "";
        this.vel_maxima = 0.0;
        this.modelo = modelo;
        this.placa = placa;
    }

    //sobreescribir metodo
    @Override
    public String toString() {
        String info = "---------------- Carro ----------------";
        info += "\nPlaca: " + placa;
        info += "\nModelo: " + modelo;
        info += "\nVelocidad maxima: " + vel_maxima;
        info += "\nColor: " + color;
        info += "\n----------------------------------------------";
        return info;
    }
    
    //consultores
    public String getColor() {
        return color;
    }
    public double getVel_maxima() {
        return vel_maxima;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }

    //modificadores
    public void setColor(String color) {
        this.color = color;
    }
    public void setVel_maxima(double vel_maxima) {
        this.vel_maxima = vel_maxima;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }    
    

    public void acelerar(){
        System.out.println("acelerando...");
    }
    public void frenar(){
        System.out.println("frenando..."); 
    }
    public void girar_dere(){
        System.out.println("derecha...");
    }
    public void girar_izq(){
        System.out.println("izquierda...");
    }
}
