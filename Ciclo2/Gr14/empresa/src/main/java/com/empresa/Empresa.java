package com.empresa;

import java.util.Scanner;


public class Empresa {
    //Atributos
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String nit;
    private Carro[] carros; //relacion entre las dos clases

    //Constructores
    //sobrecarga de metodos
    public Empresa(String nombre, String telefono, String direccion, String email, String nit){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nit = nit;
        carros = new Carro[50]; //inicializar arreglo de tamaño 50
    }

    public Empresa(String nombre, String direccion, String nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = ""; //inicializamos variables en el constructor
        this.email = "";
        carros = new Carro[50]; //inicializar arreglo de tamaño 50
    }
    public Empresa(){
        inicializar();//metodo diferente
    }

    public void inicializar(){
        nombre = " ";
        telefono = " ";
        direccion = " ";
        email = " ";
        nit = " ";
        carros = new Carro[50];//inicializar arreglo de tamaño 50
    }

    //Consultores
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEmail() {
        return email;
    }
    public String getNit() {
        return nit;
    }
    public Carro[] getCarros(){
        return carros; //return arreglo completo
    }
    public Carro getCarros(int pos){
        return carros[pos]; //return carro deseado
    }

    //Modificadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public void setCarro(int pos, Carro carro){
        carros[pos] = carro;
    }


    //ACCIONES
    

    public void fabricar_carro(String placa, String modelo){
        Carro carro_i = new Carro(modelo, placa);
        for(int i=0; i < this.carros.length; i++){
            if(this.carros[i] == null){
                this.carros[i] = carro_i;
                break;
            }
        }
    }
    public void fabricar_carro(String color, double vel_maxima, String modelo, String placa){
        Carro carro_i = new Carro(color, vel_maxima, modelo, placa);
        for(int i=0; i < this.carros.length; i++){
            if(this.carros[i] == null){
                this.carros[i] = carro_i;
                break;
            }
        }
    }

    public void solicitar_datos_carro(Scanner sc){
        
            System.out.print("Ingresar modelo del vehiculo: ");
            String modelo = sc.nextLine();

            System.out.print("Ingresar placa del vehiculo: ");
            String placa = sc.nextLine();

            System.out.print("Ingresar Color deseado del vehiculo: ");
            String color = sc.nextLine();

            System.out.print("Ingresar velocidad maxima del vehiculo: ");
            double vel_maxima  = sc.nextDouble();

            fabricar_carro(color, vel_maxima, modelo, placa);
    }

    public void mostrar_carros(){
        for(int i=0; i<carros.length; i++){
            if(carros[i] != null){
                System.out.println(carros[i]);
            }
        }
    }

    public void mostrar_carro_x_placa(String placa){
        boolean car_found = false;
        for(int i=0; i < carros.length; i++){
            if(carros[i] != null && carros[i].getPlaca().equalsIgnoreCase(placa)){
                System.out.println(carros[i]);
                car_found = true;
                break;
            }
        }
        if(car_found == false){
            System.out.println("No existe un carro con la placa ingresada");
        }
    }



    public void menu(){

        String mensaje = "--------------------------------FABRICA DE AUTOS--------------\n";
        mensaje += "1) Fabricar un carro\n";
        mensaje += "2) Mostrar todos los carros\n";
        mensaje += "3) Mostrar carros por placa\n";
        mensaje += "-1) Salir\n";
        mensaje += ">>>";

        try(Scanner sc = new Scanner(System.in)){

            int opcion = 0;

            do{
                System.out.print(mensaje);
                opcion = sc.nextInt();
                sc.nextLine();
                //evaluar opcion
                switch(opcion) {
                    case 1:
                        solicitar_datos_carro(sc);
                        break;
                    case 2:
                        mostrar_carros();
                        break;
                    case 3:
                        System.out.print("Ingresar la placa del vehiculo: ");
                        String placa = sc.nextLine();
                        mostrar_carro_x_placa(placa);
                        break;
                    case -1:
                        break;
                    default:
                        System.out.println("ingresar una opcion valida");
                }
            }while(opcion != -1);

        } catch (Exception error) {
            System.err.println(error.getMessage());
        }
    } 
    
}
