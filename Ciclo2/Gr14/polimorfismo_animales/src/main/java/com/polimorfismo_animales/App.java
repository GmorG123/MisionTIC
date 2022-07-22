package com.polimorfismo_animales;


public class App 
{
    public static void main( String[] args )
    {
        Animal[] animals = new Animal[3];

        animals[0] = new Rana(20, 1, false, "verde", 800, true);
        animals[1] = new Pez(30, 2, false, "naranja", 500);
        animals[2] = new Perro(50, 4, true, "cafe", 3000, "criollo ");
        
        //animal es objeto del arreglo animals
        for (Animal animal : animals) {
            animal.desplazar();
        }
    }
}