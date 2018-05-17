package entrena;

public class jugadorcancha extends jugador {

    public jugadorcancha(String nombre, int numero, int edad, String club, String paisclub, int estatura, int peso, int calzado, int habilidad, int cont) {
       
        super(nombre, numero, edad, club, paisclub, estatura, peso, calzado, habilidad, cont);

    }

    
    public void ordenar(jugador j1,jugador j2,jugador j3)
    {
       if(j1.habilidad>j2.habilidad && j1.habilidad>j3.habilidad)
        {   }
       if(j2.habilidad>j1.habilidad && j2.habilidad>j3.habilidad)
        {   }
       if(j3.habilidad>j1.habilidad && j3.habilidad>j2.habilidad)
        {   }
    }
    public void trenscon() {
        if (v[2].equalsIgnoreCase("opcion")) {

            this.habilidad = habilidad + 2;
            v[2] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el preparador");
        }

    }

    public void trenssin() {
        System.out.println("Trabajando tren superior");
        this.habilidad = habilidad + 1;
    }

    public void tiroarcocon() {
        if (v2[1].equalsIgnoreCase("opcion")) {
            this.habilidad = habilidad + 4;
            System.out.println("Practicando tiros al arco");
            v2[1] = "listo";
        } else {
            System.out.println("Esta opcion ya fue utilizada con el entrenador");
        }
    }

    public void tiroarcosin() {
        System.out.println("Practicando tiros al arco");
        this.habilidad = habilidad + 2;
    }
}
