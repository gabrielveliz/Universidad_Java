/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoclases;

import java.util.*;

/**
 *
 * @author Gabriel
 */
public class TrabajoClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkedList <Integer> l = new LinkedList <Integer>();
      Scanner t = new Scanner(System.in);
      Ej1 li= new Ej1();
      String op;
      Stack <Integer>p= new Stack <Integer>();
      
      
      
      do{System.out.println("Ejercicio 1, ingrese opcion");
         System.out.println("(1)-Añadir elemento ");
         System.out.println("(2)-borrar elemento ");
         System.out.println("(3)-Mostrar lista ");
         System.out.println("(4)-Salir ");
         op=t.next();
      switch(op){
          case "1":li.Ingresa(l);
              break;
          case "2":li.borrarelemento(l);
              break;
          case "3":li.Mostrar(l);
              break;
          case "4":System.out.println("Acaba de salir");
              break;
          default: System.out.println("El elemento ingresado no es valido");break;
    }
      }while(!op.equalsIgnoreCase("4"));
      
      
    
      
      
      
      
    }
    
}
