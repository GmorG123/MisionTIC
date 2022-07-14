package com.fabricaaviones;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("-------------Avion de Carga-------------");
        AvionCarga av_ca1 = new AvionCarga("Azul" ,50);
        
        System.out.println(">>>> Atributos del avion <<<<");
        System.out.println("Color: "+ av_ca1.getColor());
        System.out.println("Tamaño: " + av_ca1.getTamano());

        System.out.println("--------------------------");
        av_ca1.cargar();
        av_ca1.despegar();
        av_ca1.aterrizar();
        av_ca1.frenar();
        av_ca1.descargar();
        System.out.println("----------------------------------");

        System.out.println("-------------Avion pasajeros-------------");
        AvionPasajeros av_pa1 = new AvionPasajeros(160, "Rojo", 120);

        av_pa1.despegar();
        av_pa1.servir();
        av_pa1.aterrizar();
        av_pa1.frenar();

        System.out.println("------------------------------------");


        System.out.println("-------------Avion pasajeros-------------");
        AvionMilitar av_mi1 = new AvionMilitar("Azul", 90, 2);

        av_mi1.despegar();
        av_mi1.identificar_objetivo(false);
        av_mi1.identificar_objetivo(true);
        av_mi1.identificar_objetivo(true);
        av_mi1.identificar_objetivo(true);
        av_mi1.aterrizar();
        av_mi1.frenar();
    }
}
