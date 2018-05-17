package entrena;

import java.util.Scanner;

public class jugador {

    String v[] = {"opcion", "opcion", "opcion", "opcion"};
    String v2[] = {"opcion", "opcion", "opcion", "opcion"};
    String sal = "si";
    Scanner t = new Scanner(System.in);
    String nombre;
    int numero;
    int edad;
    String club;
    String paisclub;
    int estatura;
    int peso;
    int calzado;
    int habilidad;
    int cont;

    public jugador(String nombre, int numero, int edad, String club, String paisclub, int estatura, int peso, int calzado, int habilidad, int cont) {
        this.nombre = nombre;
        this.numero = numero;
        this.edad = edad;
        this.club = club;
        this.paisclub = paisclub;
        this.estatura = estatura;
        this.peso = peso;
        this.calzado = calzado;
        this.habilidad = habilidad;
        this.cont = cont;

    }

    public void trotarcon() {
        if (v[0].equalsIgnoreCase("opcion")) {
            this.habilidad = habilidad + 2;
            System.out.println("Utilizando Trotadora");
            v[0] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el preparador");
        }
    }

    public void trotarsin() {
        this.habilidad = habilidad + 1;
        System.out.println("Utilizando Trotadora");
    }

    public void trenicon() {
        if (v[1].equalsIgnoreCase("opcion")) {
            this.habilidad = habilidad + 4;
            System.out.println("Trabajando tren inferior");
            v[1] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el preparador");
        }
    }

    public void trenisin() {
        this.habilidad = habilidad + 2;
        System.out.println("Trabajando tren inferior");
    }

    public void abdomencon() {
        if (v[3].equalsIgnoreCase("opcion")) {
            this.habilidad = habilidad + 3;
            System.out.println("Trabajando Abdomen");
            v[3] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el preparador");
        }
    }

    public void abdomensin() {
        System.out.println("Trabajando Abdomen");
        this.habilidad = habilidad + 1;

    }

    public void pasescon() {
        if (v2[0].equalsIgnoreCase("opcion")) {
            this.habilidad = habilidad + 2;
            System.out.println("Practicando pases");
            v2[0] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el entrenador");
        }
    }

    public void pasessin() {
        System.out.println("Practicando pases");
        this.habilidad = habilidad + 1;
    }

    public void penalescon() {
        if (v2[2].equalsIgnoreCase("opcion")) {
            this.habilidad = habilidad + 2;
            System.out.println("Practicando penales");
            v2[2] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el entrenador");
        }
    }

    public void penalessin() {
        System.out.println("Practicando penales");
        this.habilidad = habilidad + 1;
    }

    public void quitecon() {
        if (v2[3].equalsIgnoreCase("opcion")) {
            this.habilidad = habilidad + 2;
            System.out.println("Practicando penales");
            v2[3] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el entrenador");
        }
    }

    public void quitesin() {
        System.out.println("Practicando quites del balon");
        this.habilidad = habilidad + 3;
    }
   
    public void equipoa()
    {
    
    this.habilidad = habilidad + 5;
    }
    public void equipob()
    {
    
    this.habilidad = habilidad + 10;
    }
    public void restablecer()
    {
        for (int i = 0; i < 4; i++) {
            v[i] = "opcion";
            v2[i] = "opcion";    
        }
        
    }
}
