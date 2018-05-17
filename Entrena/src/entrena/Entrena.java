package entrena;

import java.util.*;

public class Entrena {

    static String sal ;
    static int indice;
    static Scanner t = new Scanner(System.in);
    //arqueros
    static jugadorarco j1 = new jugadorarco("claudio bravo", 1, 25, "barcelona", "españa", 160, 74, 45, 15, 0);
    static jugadorarco j2 = new jugadorarco("paulo garces", 2, 30, "colo-colo", "chile", 160, 74, 45, 10, 0);
    static jugadorarco j3 = new jugadorarco("rene galarce", 3, 35, "universidad catolica", "chile", 160, 74, 45, 10, 0);
    //jugadores de cancha
    static jugadorcancha j4 = new jugadorcancha("alexis sanchez", 4, 23, "Arsenal FC", "inglaterra", 160, 74, 45, 15, 0);
    static jugadorcancha j5 = new jugadorcancha("gary medel", 5, 28, "FC Internazionale Milano", "italia", 160, 74, 45, 15, 0);
    static jugadorcancha j6 = new jugadorcancha("mauricio pinilla", 6, 32, "Atalanta Bergamasca Calcio", "italia", 160, 74, 45, 15, 0);
    static jugadorcancha j7 = new jugadorcancha("arturo vidal", 7, 25, "juventus FC", "italia", 160, 74, 45, 15, 0);
    static jugadorcancha j8 = new jugadorcancha("mark gonzalez", 8, 26, "universidad catolica", "chile", 160, 74, 45, 10, 0);
    static jugadorcancha j9 = new jugadorcancha("miko albornoz", 9, 24, "Hannover 96 ", "alemania", 160, 74, 45, 15, 0);
    static jugadorcancha j10 = new jugadorcancha("Jean Beausejour ", 10, 25, "colo-colo", "chile", 160, 74, 45, 10, 0);
    static jugadorcancha j11 = new jugadorcancha("matias fernandez", 11, 27, "fiorentina", "italia", 160, 74, 45, 15, 0);
    static jugadorcancha j12 = new jugadorcancha("Jorge Valdivia ", 12, 30, "palmeiras", "brasil", 160, 74, 45, 10, 0);
    static jugadorcancha j13 = new jugadorcancha("charles aranguiz", 13, 45, "Sport Club Internacional", "brasil", 160, 74, 45, 10, 0);
    static jugadorcancha j14 = new jugadorcancha("mauricio isla", 14, 48, "Queens Park Rangers FC ", "inglaterra", 160, 74, 45, 15, 0);
    static jugadorcancha j15 = new jugadorcancha("marco medel", 15, 23, "Santiago Wanderers", "chile", 160, 74, 45, 10, 0);
    static jugadorcancha j16 = new jugadorcancha("juan cornejo", 16, 24, "audax italiano", "chile", 160, 74, 45, 10, 0);
    static jugadorcancha j17 = new jugadorcancha("fernando meneses", 17, 25, "Tiburones Rojos de Veracruz", "mexico", 160, 74, 45, 10, 0);
    static jugadorcancha j18 = new jugadorcancha("carlos carmona", 18, 21, "Atalanta Bergamasca Calcio", "italia", 160, 74, 45, 15, 0);
    static jugadorcancha j19 = new jugadorcancha("marcelo diaz", 19, 29, "Hamburg SV", "alemania", 160, 74, 45, 15, 0);
    static jugadorcancha j20 = new jugadorcancha("edson puch ", 20, 27, "Club Atlético Huracán", "argentina", 160, 74, 45, 10, 0);
    static jugadorcancha j21 = new jugadorcancha("felipe gutierrez", 21, 24, "FC Twente", "holanda", 160, 74, 45, 15, 0);
    static jugadorcancha j22 = new jugadorcancha("gonzalo jara", 22, 23, "FSV Mainz 05", "alemania", 160, 74, 45, 15, 0);
    static jugadorcancha j23 = new jugadorcancha("angelo henriquez", 23, 25, "GNK Dinamo Zagreb", "croacia", 160, 74, 45, 15, 0);

    public static void main(String[] args) {
        LinkedList<jugadorarco> arq = new LinkedList(); //lista arqueros
        LinkedList<jugadorcancha> seleccion = new LinkedList(); //lista jugadores
        LinkedList<jugador> titulares = new LinkedList<>();//lista equipo a
        LinkedList<jugador> reservas = new LinkedList<>();//lista equipo b
        
        

        arq.add(j1);
        arq.add(j2);
        arq.add(j3);
        seleccion.add(j4);
        seleccion.add(j5);
        seleccion.add(j6);
        seleccion.add(j7);
        seleccion.add(j8);
        seleccion.add(j9);
        seleccion.add(j10);
        seleccion.add(j11);
        seleccion.add(j12);
        seleccion.add(j13);
        seleccion.add(j14);
        seleccion.add(j15);
        seleccion.add(j16);
        seleccion.add(j17);
        seleccion.add(j18);
        seleccion.add(j19);
        seleccion.add(j20);
        seleccion.add(j21);
        seleccion.add(j22);
        seleccion.add(j23);

        
        
        
        
        String v[] = {"sabado", "lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Lunes", "Martes", "Miercoles", "Jueves", "viernes"};
        String ju;
        int cont;// comprobar iteracion obligatria gym
        int cont2;//comprobar iteracion obligatoria cancha
        int conta;//lista de jugadores

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//comienzo programa
//menu principal
        System.err.println("LEA BIEN LAS INSTRUCCIONES (ingrese un caracter para continuar)");
        System.out.println("Este programa fue diseñado para Medir las habilidades de los jugadores de la seleccion chilena \n"
                + "y entregar una posible nomina de los 11 jugadores titulares y sus respectivas habilidades acumuladas \n"
                + "INSTRUCCIONES\n"
                + "-Los jugadores deben usar al menos una vez cada dependencia en forma individual\n"
                + "-En equipo solo se podra utilizar la cancha como maximo 3 veces\n"
                + "-La opcion pasar dia se liberara una vez que los jugadores hayan realizado sus entrenamientos obligatorios\n"
                + "-La seleccion solo podra entrenar en equipo una vez que sus jugadores se hayan entrenado individualmente\n"
                + "-Ud escojera los jugadores titulares y los entrenara en equipo, al final del programa se mostraran el equipoa A(que ud escogio)\n"
                + "y el equipo B y sus respectivas habilidades, de forma que en la vida real tome una reconsideracion antes de escojer sus titulares\n"
                + "puede que su equipo B sea la mejor opcion, SUERTE");
         System.out.println("Ingrese un caracter para continuar");
         String a=t.next();
        

        System.out.println("Lista de jugadores : ");
        
        conta = 0;
       
        
        for (int j = 0; j < 23; j++) {
            
            if (j <= 2) {
                System.out.println(" - (" + j + ") " + arq.get(j).nombre + "; Club: " + arq.get(j).club + "; Pais que juega: " + arq.get(j).paisclub);
            }
            if (j > 2) {
                System.out.println(" - (" + j + ") " + seleccion.get(conta).nombre + "; Club: " + seleccion.get(conta).club + "; Pais que juega: " + seleccion.get(conta).paisclub);
                conta++;
            }
        }

          for (int i = 1; i <= 10 && i>24; i = i) { // ciclo 10 dias
            
              
        for (int e = 0; e < 23; e=e) { // ciclo jugadores
            sal="no";
            cont2=0;
            cont = 0;
            
            
           
         
            indice = e;
            
            if (indice <= 2) {
                System.out.println("Entrenando a :" + arq.get(indice).nombre);
                arq.get(indice).restablecer();

            }
            if (indice > 2) {

                System.out.println("Entrenando a :" + seleccion.get(indice - 3).nombre);
                seleccion.get(indice-3).restablecer();
            }

          
          
               do{
                System.out.println("Dia : "+i+" - " + v[i]);
                System.out.println("Escoja dependencia");
                System.out.println("(1)Cancha");
                System.out.println("(2)Gimnasio");
                System.out.println("(3)Mostrar jugadores");
                System.out.println("(4)Mostrar habilidades de los jugadores");
                System.out.println("(5)Pasar al siguiente Jugador");
                String opc = t.next();

              switch (opc) {//menu principal
         case "1": 
         
                        System.out.println("Menu CANCHA");
                        if (cont2 < 1) {

                            if (indice <= 2) {
                                arq.get(indice);
                                cont2++;
                            }
                            if (indice > 2) {
                                seleccion.get(indice - 3);
                                cont2++;
                            }

                            for (int j = 1; j < 5; j = j) {

                                System.out.println("Entrenamiento individual con supervicion del Entrenador");
                                System.out.println("(1) Pases");
                                System.out.println("(2) Tiros al arco(jugadores de cancha)/ Atajar tiros al arco(Arqueros)");
                                System.out.println("(3) Penales");
                                System.out.println("(4) Quite de balon");
                                String op = t.next();

                                switch (op) {
                                    case "1":

                                        if (indice <= 2) {
                                            arq.get(indice).pasescon();
                                            j++;
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).pasescon();
                                            j++;
                                        }

                                        break;
                                    case "2":

                                        if (indice <= 2) {
                                            arq.get(indice).atajarcon();
                                            j++;
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).tiroarcocon();
                                            j++;
                                        }

                                        break;
                                    case "3":
                                        if (indice <= 2) {
                                            arq.get(indice).penalescon();
                                            j++;
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).penalescon();
                                            j++;
                                        }

                                        break;
                                    case "4":
                                        if (indice <= 2) {
                                            arq.get(indice).quitecon();
                                            j++;
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).quitecon();
                                            j++;
                                        }
                                        break;
                                }

                                do {
                                    if (j > 2 && j < 5) {
                                        System.out.println("¿Desea Seguir utilizando la cancha?(si) o (no)");
                                        sal = t.next();
                                        if (sal.equalsIgnoreCase("si")) {
                                            System.out.println("El jugador saldra automaticamente una vez haya entrnado lo suficiente");
                                        }
                                        if (sal.equalsIgnoreCase("no")) {
                                            System.out.println("este jugador Podra ingresar cuando quiera a la cancha pero sin entrenador");
                                            j = 10;
                                        }
                                    }
                                } while (!sal.equalsIgnoreCase("si") && !sal.equalsIgnoreCase("no") && i < 5);

                            }
                        } else {
                            if (indice <= 2) {
                                arq.get(indice);
                            }
                            if (indice > 2) {
                                seleccion.get(indice - 3);
                            }

                            System.out.println("Como maximo podra estar 8 horas en la cancha, despues tendra que tomarse un descanso");
                            for (int j = 0; j < 8; j++) {
                                System.out.println("Horas en dentro de la cancha :" + j + " HRS");

                                System.out.println("Entrenamiento sin supervision del Entrenador ");
                                System.out.println("(1) Pases");
                                System.out.println("(2) Tiros al arco(jugadores de cancha)/ Atajar tiros al arco(Arqueros)");
                                System.out.println("(3) Penales");
                                System.out.println("(4) Quite de balon");
                                System.out.println("(5) Salir de la cancha");
                                String op = t.next();

                                switch (op) {
                                    case "1":
                                        if (indice <= 2) {
                                            arq.get(indice).pasessin();
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).pasessin();
                                        }
                                        break;
                                    case "2":
                                        if (indice <= 2) {
                                            arq.get(indice).atajarsin();
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).tiroarcosin();
                                        }
                                        break;
                                    case "3":
                                        if (indice <= 2) {
                                            arq.get(indice).penalessin();
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).penalessin();
                                        }
                                        break;
                                    case "4":
                                        if (indice <= 2) {
                                            arq.get(indice).quitesin();
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).quitesin();
                                        }
                                        break;
                                    case "5":
                                        j = 10;
                                        break;
                                }

                            }
                            System.out.println("A tomar un descanso ");
                        }

                        break;

           case "2":                                
           

                        System.out.println("Menu GYM");
                        
                        if (cont < 1) {

                            if (indice <= 2) {
                                arq.get(indice);
                                cont++;
                            }
                            if (indice > 2) {
                                seleccion.get(indice - 3);
                                cont++;
                            }

                            for (int j = 1; j < 5; j = j) {

                                System.out.println("Escoja que maquinas desea utilizar con el preparador fisico");
                                System.out.println("(1) Maquinas para trotar");
                                System.out.println("(2) Maquinas para el tren inferior");
                                System.out.println("(3) Maquinas para el tren superior");
                                System.out.println("(4) Abdominales");
                                String op = t.next();

                                switch (op) {
                                    case "1":

                                        if (indice <= 2) {
                                            arq.get(indice).trotarcon();
                                            j++;
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).trotarcon();
                                            j++;
                                        }

                                        break;
                                    case "2":

                                        if (indice <= 2) {
                                            arq.get(indice).trenicon();
                                            j++;
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).trenicon();
                                            j++;
                                        }

                                        break;
                                    case "3":
                                        if (indice <= 2) {
                                            arq.get(indice).trenscon();
                                            j++;
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).trenscon();
                                            j++;
                                        }

                                        break;
                                    case "4":
                                        if (indice <= 2) {
                                            arq.get(indice).abdomencon();
                                            j++;
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).abdomencon();
                                            j++;
                                        }
                                        break;
                                }

                                do {
                                    if (j > 2 && j < 5) {
                                        System.out.println("¿Desea Seguir utilizando el gimnasio?(si) o (no)");
                                        sal = t.next();
                                        if (sal.equalsIgnoreCase("si")) {
                                            System.out.println("El jugador saldra automaticamente una vez que haya usado todas las maquinas");
                                        }
                                        if (sal.equalsIgnoreCase("no")) {
                                            System.out.println("este jugador Podra ingresar cuando quiera al gimnasio pero sin preparador fisico");
                                            j = 10;
                                        }
                                    }
                                } while (!sal.equalsIgnoreCase("si") && !sal.equalsIgnoreCase("no") && i < 5);

                            }
                        } else {
                            if (indice <= 2) {
                                arq.get(indice);
                            }
                            if (indice > 2) {
                                seleccion.get(indice - 3);
                            }

                            System.out.println("Como maximo podra estar 8 horas en el gimnasio, despues tendra que tomarse un descanso");
                            for (int j = 0; j < 8; j++) {
                                System.out.println("Horas en el gimnasio :" + j + " HRS");

                                System.out.println("Escoja que maquinas desea utilizar ");
                                System.out.println("(1) Maquinas para trotar");
                                System.out.println("(2) Maquinas para el tren inferior");
                                System.out.println("(3) Maquinas para el tren superior");
                                System.out.println("(4) Abdominales");
                                System.out.println("(5) Salir del gimnasio");
                                String op = t.next();

                                switch (op) {
                                    case "1":
                                        if (indice <= 2) {
                                            arq.get(indice).trotarsin();
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).trotarsin();
                                        }
                                        break;
                                    case "2":
                                        if (indice <= 2) {
                                            arq.get(indice).trenisin();
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).trenisin();
                                        }
                                        break;
                                    case "3":
                                        if (indice <= 2) {
                                            arq.get(indice).trenssin();
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).trenssin();
                                        }
                                        break;
                                    case "4":
                                        if (indice <= 2) {
                                            arq.get(indice).abdomensin();
                                        }
                                        if (indice > 2) {
                                            seleccion.get(indice - 3).abdomensin();
                                        }
                                        break;
                                    case "5":
                                        j = 10;
                                        break;
                                }

                            }
                            System.out.println("A tomar un descanso ");
                        }

                        break;

        case "3":
                        System.out.println("Lista de jugadores : ");
                        conta = 0;
                        for (int j = 0; j < 23; j++) {
                            if (j <= 2) {
                                System.out.println(" - (" + j + ") " + arq.get(j).nombre + "; Club: " + arq.get(j).club + "; Pais que juega: " + arq.get(j).paisclub);
                            }
                            if (j > 2) {
                                System.out.println(" - (" + j + ") " + seleccion.get(conta).nombre + "; Club: " + seleccion.get(conta).club + "; Pais que juega: " + seleccion.get(conta).paisclub);
                                conta++;
                            }
                        }
                        break;
        case "4":
                        conta = 0;
                        for (int j = 0; j < 23; j++) {
                            if (j <= 2) {
                                System.out.println(arq.get(j).nombre + "; Habilidad : " + arq.get(j).habilidad);
                            }
                            if (j > 2) {
                                System.out.println(seleccion.get(conta).nombre + "; Habilidad : " + seleccion.get(conta).habilidad);
                                conta++;
                            }
                        }
                        break;
        case "5":
            if(cont>0 && cont2>0){          
              sal="si";}
            
              else{System.out.println("Le falta ingresar al gimnasio o a la cancha");}
                   
            break;

              }    
            }while(sal.equalsIgnoreCase("no")); e++;cont=0;cont2=0;
           
        }i++;
        
        
        

        }
          
          
        System.out.println("Ahora que los jugadores han sido entrenados individualmente podemos escojer los equipos titulares y reserva para entrenar en equipo");
        
        int elegir;
        
        System.out.println("Escojeremos el equipo A");
        do {
            for (int j = 0; j < 3; j++) {

                System.out.println(" - (" + j + ") " + arq.get(j).nombre + "; Habilidad: " + arq.get(j).habilidad);
            }
            System.out.println("Escoja un arquero (Se solicita estrictamente utilizar los numeros de indices) :");
            elegir = t.nextInt();
            titulares.add(arq.get(elegir));
            arq.remove(elegir);
        } while ((elegir > 2 && elegir < 0) || titulares.size() == 0);

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < seleccion.size(); i++) {

                System.out.println(" - (" + i + ") " + seleccion.get(i).nombre + "; Habilidad: " + seleccion.get(i).habilidad);
            }
            do {
                System.out.println("Escoja un jugador (Se solicita estrictamente utilizar 'NUMEROS') por su indice:");
                elegir = t.nextInt();
                titulares.add(seleccion.get(elegir));
                seleccion.remove(elegir);
            } while ((titulares.size() == j));
        }
        reservas.add(arq.get(0));
        arq.remove(0);
        reservas.add(arq.get(0));

        for (int i = 0; i < seleccion.size(); i++) {
            reservas.add(seleccion.get(i));
        }

        cont = 1;
        cont2 = 1;
        while (cont2 <= 3) {
            System.out.println("Escoja una opcion");
            System.out.println("(1) - Entrenar en Equipos (Equipa A vs Equipo B)");
            System.out.println("(2) - Ver Equipo A");
            System.out.println("(3) - Ver Equipo B");
            System.out.println("(4) - Salir del menu");
            String opc = t.next();
            switch (opc) {
                case "1":
                    if (cont < 4) {
                        for (int i = 0; i < titulares.size(); i++) {
                            titulares.get(i).equipoa();
                        }
                    }
                    if (cont < 4) {
                        for (int i = 0; i < reservas.size(); i++) {
                            reservas.get(i).equipob();
                        }
                    }
                    cont2++;
                    break;

                case "2":
                    for (int i = 0; i < titulares.size(); i++) {
                        System.out.println(" - (" + i + ") " + titulares.get(i).nombre + "; Habilidad: " + titulares.get(i).habilidad);
                    }
                    break;
                case "3":
                    for (int i = 0; i < reservas.size(); i++) {
                        System.out.println(" - (" + i + ") " + reservas.get(i).nombre + "; Habilidad: " + reservas.get(i).habilidad);
                    }
                    break;
                case "4":
                    cont2 = 5;
                    break;
                default:
                    System.out.println("Esta opcion no existe ");
                    break;
            }
            
        }
        

     
        System.out.println("Esta es la lista que ud escogio como titulares y sus habilidades");
        for (int i = 0; i < titulares.size(); i++) {
            System.out.println("Camiseta : "+titulares.get(i).numero+" - "+titulares.get(i).nombre+" - habilidad : "+titulares.get(i).habilidad);    
        }
        System.out.println(" ");
        System.out.println("Esta es la lista del equipo reserva");
        for (int i = 0; i < reservas.size(); i++) {
            System.out.println("Camiseta : "+reservas.get(i).numero+" - "+reservas.get(i).nombre+" - habilidad : "+reservas.get(i).habilidad);    
        }
         
        System.out.println("Observe bien sus habilidades y nombres, y vuelva a a ejecutar este programa para obtener una buen nomina de jugadores titulares");
        System.err.println("Muchas gracias por utilizar nuestros servicios");
        
        
     
           
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
