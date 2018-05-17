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
public class Ej1 {
    
   
    public void Ingresa(LinkedList<Integer> l)
    {Scanner t = new Scanner(System.in);
     System.out.println("Ingrese Elemento");
     int f =t.nextInt();
     l.add(f);
    }
    
    public void Mostrar(LinkedList<Integer> l)
    {
        if(l.size()==0){System.out.println("La lista esta vacia");}
        else{for(int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
            }}
    }
    
    public void borrarelemento(LinkedList <Integer> l)
    { Scanner t = new Scanner (System.in);int el;int cont=0;
        if(l.size()==0)
    {System.out.println("La lista esta vacia");}
    else{ System.out.println("Ingrese el elemento que desea buscar y eliminar (se eliminaran todos los elementos iguales al ingresado)");
          el = t.nextInt();
    for(int i = 0; i < l.size(); i=i) {
         if(el==l.get(i))
         { 
           l.remove(i);
           cont++;
         }
         else{i++;}
          }
    if(cont>0)
    {System.out.println("Los elementos han sido eliminados");}
    else{System.out.println("Este elemento no se encuentra en la lista");}
    
      
    }
    }
            
}
