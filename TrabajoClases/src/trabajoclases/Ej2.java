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
public class Ej2 {
    
    public void Remplazar(Stack<Integer> p)
    {   Stack<Integer>p2 = new Stack<Integer>();
        Scanner t = new Scanner(System.in);
        int Nuevo,Viejo;
        if (p.empty()==true) {
            System.out.println("La pila esta vacia");
        }else{
        System.out.println("Ingrese valor que desea buscar");
        Viejo = t.nextInt();
        System.out.println("Ingrese el valor que Remplazara");
        Nuevo = t.nextInt(Viejo);
        
        
        }
        
        
        
    }
    
    
}
