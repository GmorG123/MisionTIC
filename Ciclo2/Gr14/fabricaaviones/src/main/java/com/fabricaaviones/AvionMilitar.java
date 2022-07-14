package com.fabricaaviones;


public class AvionMilitar extends Avion{
    
    private int misiles;

    //constructor
    public AvionMilitar(String color, double tamano, int misiles){
        super(color, tamano);
        this.misiles = misiles;
    }

    //getters
    public int getMisiles(){
        return misiles;
    }

    //setters
    public void setMisiles(int misiles){
        this.misiles = misiles;
    }


    //acciones
    private void disparar(){
        if(misiles > 0){
            System.out.println("disparando misiles...");
            misiles -= 1;
        }else{
            System.out.println("no hay misiles");
        }
        
    }
    public void identificar_objetivo(boolean objetivo){
        if(objetivo){
            disparar();
        }else{
            System.out.println("abortar");
        }
    }

}
