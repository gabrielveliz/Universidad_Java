package laboratorio03;

import java.util.Scanner;

public class Laboratorio03 {

    public class Aeronave {

        public void Volar() {
            int altitud = 19812;
            int velocidad = 1340;
            System.out.println("Altitud : " + altitud + " metro de altura ");
            System.out.println("velocidad : " + velocidad + " km/h ");
        }

        public void Volar2() {
            int altitud = 1500;
            int velocidad = 400;
            System.out.println("Altitud : " + altitud + " metro de altura ");
            System.out.println("velocidad : " + velocidad + " km/h ");
        }

        public void Aterrizar() {
            System.out.println("Aterrizaje perfecto, se presenta aeronave sin novedad.");
        }
    }

    static class Avion extends Aeronave {

        public void Piloto() {
            System.out.println("Piloto : Listo para servicio");
        }
        public void ultra()
        {
            System.out.println("velocidad: 2.410 km/h");
        }

        public void Combustible() {
            System.out.println("Combustible: Tanque lleno");
        }

        public void Misiles() {
            System.out.println("Misiles listos para usar");
            System.out.println("Localizando enemigo........ ¡FUEGO!");

        }
    }

    static public class Helicoptero extends Aeronave {

        public void Rotores() {
            System.out.println("Rotores funcionando sin problemas");
        }
        
        public void velocidad()
        {
            System.out.println("velocidad: 294 km/h");
        }

    }

    static public class Comercial extends Aeronave {

        public void Asiento() {
            System.out.println("hay 163 asientos");
        }

        public void Tamaño() {
            System.out.println("Soy uno de los aviones mas grandes ");
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        Avion F16 = new Avion();
        Avion F22 = new Avion();
        Comercial Airbus380 = new Comercial();
        Helicoptero Bell412 = new Helicoptero();
        Helicoptero UH60 = new Helicoptero();
        
        
        int opc;
        String salir = "no salir";
        do {
            System.out.println("Ingrese Opcion");
            System.out.println("1- F-16");
            System.out.println("2- Airbus 380");
            System.out.println("3- Bell 412");
            System.out.println("4- F-22");
            System.out.println("5- UH-60");
            System.out.println("6- Salir");
            opc = t.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("F16 FALCON");
                    F16.Piloto();
                    F16.Combustible();
                    F16.Volar();
                    F16.Misiles();
                    F16.Aterrizar();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Airbus 380");
                    Airbus380.Asiento();
                    Airbus380.Tamaño();
                    Airbus380.Volar();
                    Airbus380.Aterrizar();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Bell 412");
                    Bell412.Rotores();
                    Bell412.Volar2();
                    Bell412.Aterrizar();
                    break;
                 case 4:
                    System.out.println("F22 RAPTOR");
                    F22.Piloto();
                    F22.Combustible();
                    F22.Volar();
                    F22.ultra();
                    F22.Misiles();
                    F22.Aterrizar();
                    System.out.println(" ");
                    break;
                 
                case 5:
                    System.out.println("UH-60 Black Hawk");
                    UH60.Rotores();
                   
                    UH60.velocidad();
                    UH60.Aterrizar();
                    System.out.println(" ");
                    break;
                 
                
                
                case 6:
                    salir = "salir";
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        } while (salir.equals("no salir"));

    }
}
