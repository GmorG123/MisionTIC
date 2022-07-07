public class App {
    public static void main(String[] args) throws Exception {
        
        //crear - instanciar objeto
        Persona P1 = new Persona("Gian","Morales");
        //acceder a nombre y apellido
        String name_persona = P1.getNombre();
        String lastname_persona = P1.getApellido();

        System.out.println("Nombre: "+name_persona+ "\nApellido: "+ lastname_persona);
        
        Persona P2 = new Persona("Emanuel", "Gonzalez");
        System.out.println(P2.getNombre() +" "+ P2.getApellido());
        P2.setNombre("Pablo");
        P2.setApellido("Montoya");
        System.out.println(P2.getNombre() +" "+ P2.getApellido());
    
        //asignar edad P1 Y P2
        P1.setEdad(22);
        P2.setEdad(25);

        //calcular num suerte
        int n_suerte1 = P1.calc_num_suerte(10, 2);
        int n_suerte2 = P2.calc_num_suerte(30, 3);
        System.out.println("num suerte de " + P1.getNombre() + " es " + n_suerte1);
        System.out.println("num suerte de " + P2.getNombre() + " es " + n_suerte2);
    }
}
