package estudio;

import java.util.*;

public class Estudio {
static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        String elemento;
        String elemento2;
        String opc;
        String opc2;
        String opc3;
        LinkedList lista = new LinkedList();
        Stack pila = new Stack();

        do {
            System.out.println("Menu opciones Principal");
            System.out.println("(1) Menu PILA");
            System.out.println("(2) Menu LISTA");
            System.out.println("(3) Salir Programa");
            opc = t.next();
            switch (opc) {
                case "1":
                    do {
                        System.out.println("Menu de opciones 'PILA'");
                        System.out.println("(1) Añadir elemento");
                        System.out.println("(2) Eliminar elemento");
                        System.out.println("(3) Ordenar pila de menor a mayor");
                        System.out.println("(4) Mostrar elementos de pila");
                        System.out.println("(5) Salir de este menu");
                        System.out.println("Ingrese una opcion: ");
                        opc3 = t.next();

                        switch (opc3) {
                            case "1":
                                System.out.println("");
                                System.out.println("Inserte el dato");
                                elemento2 = t.next();
                                pila.push(elemento2);

                                System.out.println("");
                                break;
                            case "2":
                                System.out.println("");
                                if (pila.empty()) {
                                    
                                } else {
                                    System.out.println("Se borrara el ultimo elemento que ingreso a la pila");
                                    pila.pop();
                                }
                                System.out.println("");
                                break;
                            case "3":
                                System.out.println("");

                                int largo = pila.size();
                                String vec[] = new String[largo];
                                if(pila.empty())
                                {System.out.println("La pila esta vacia");}
                                else{for (int i = 0; i < largo; i++) {

                                    vec[i] = (String) pila.get(i);
                                }
                                System.out.println("");
                                for (int i = 0; i < largo; i++) {
                                    String aux = vec[i];

                                    for (int j = i - 1; j >= 0 && vec[j].compareToIgnoreCase(aux) > 0; j--) {
                                        vec[j + 1] = vec[j];
                                        vec[j] = aux;
                                    }

                                }
                                while (pila.empty() == false) {
                                    pila.pop();
                                }
                                for (int i = 0; i < largo; i++) {
                                    pila.push(vec[i]);
                                }
                                System.out.println("La pila fue ordenada");}
                                
                                System.out.println("");
                                break;
                            case "4":
                                System.out.println("");
                                if (pila.empty() == true) {
                                    System.out.println("La pila esta vacia");
                                } else {
                                    System.out.println("los elementos de la pila son:");
                                    pila.stream().forEach((pila1) -> {
                                        System.out.println("--> " + pila1);
                                    });
                                }
                                System.out.println("");
                                break;

                        }
                    } while (!"5".equals(opc3));
                    break;

                case "2":
                    do {
                        System.out.println("Menu de opciones 'LISTA'");
                        System.out.println("(1) Añadir elemento");
                        System.out.println("(2) Borrar lista");
                        System.out.println("(3) Borrar elemento");
                        System.out.println("(4) Traspasar elementos a un arreglo");
                        System.out.println("(5) mostrar elementos lista");
                        System.out.println("(6) Borrar por posicion");
                        System.out.println("(7) Salir de este menu");
                        System.out.println("Ingrese una opcion: ");
                        opc2 = t.next();

                        switch (opc2) {
                            case "1":
                                System.out.println("");
                                System.out.println("Inserte el dato");
                                elemento = t.next();
                                lista.addFirst(elemento);
                                System.out.println("");
                                break;
                            case "2":
                                System.out.println("");
                                System.out.println("Se borraran todos los elementos");
                                lista.clear();
                                System.out.println("");
                                break;

                            case "3":
                                System.out.println("");
                                System.out.println("Se borrara el primer elemento");
                                lista.removeFirst();
                                System.out.println("");
                                break;
                            case "4":
                                System.out.println("");
                                String vlista[] = new String[lista.size()];
                                if (lista.size() == 0) {
                                    System.out.println("La lista esta vacia");
                                } else {
                                    System.out.println("El arreglo es :");
                                    for (int i = 0; i < lista.size(); i++) {
                                        vlista[i] = (String) lista.get(i);
                                    }
                                    for (String vlista1 : vlista) {
                                        System.out.print("[" + vlista1 + "]");
                                    }
                                }
                                System.out.println("");
                                break;
                            case "5":
                                System.out.println("");
                                System.out.println("los elementos de la lista son:");
                                lista.stream().forEach((lista1) -> {
                                    System.out.println("--> " + lista1);
                                });
                                System.out.println("");
                                break;
                            case "6":
                                System.out.println("");
                                System.out.println("Ingrese numero de posicioon que desea eliminar(las posiciones comienzan en 0--> 0,1,2,3,...)");

                                int el = t.nextInt();
                                if (el >= lista.size() && lista.size() != 0) {
                                    System.out.println("Esta posicion no existe; el tamaño de la lista es : " + lista.size());
                                }
                                if (lista.size() == 0) {
                                    System.out.println("La lista esta vacia");
                                }
                                if (el < lista.size()) {
                                    lista.remove(el);
                                }
                                System.out.println("");
                                break;

                        }
                    } while (!"7".equals(opc2));
                    break;

            }

        } while (!"3".equals(opc));
        System.err.println("Programa Finalizado");
    }
}
