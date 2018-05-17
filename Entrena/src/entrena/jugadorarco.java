package entrena;

public class jugadorarco extends jugador {

    public jugadorarco(String nombre, int numero, int edad, String club, String paisclub, int estatura, int peso, int calzado, int habilidad, int cont) {
        super(nombre, numero, edad, club, paisclub, estatura, peso, calzado, habilidad, cont);

    }

    public void trenscon() {
        if (v[2].equalsIgnoreCase("opcion")) {

            this.habilidad = habilidad + 4;
            v[2] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el preparador");
        }

    }

    public void trenssin() {
        System.out.println("Trabajando tren superior");
        this.habilidad = habilidad + 2;
    }

    public void atajarcon() {
        if (v2[1].equalsIgnoreCase("opcion")) {
            this.habilidad = habilidad + 4;
            System.out.println("Practicando atajar tiros al arco");
            v2[1] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el entrenador");
        }
    }

    public void atajarsin() {
        System.out.println("Practicando atajar tiros al arco");
        this.habilidad = habilidad + 2;
    }
}
