/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 184786486
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int neg[],pos[],v[],contpos,contneg,num;
        neg= new int [10];
        pos= new int [10];
        v  = new int [10];
       Scanner teclado = new Scanner(System.in);
        contpos=0;contneg=0;
        for(int i=0;i<10;i++)
        { System.out.println("ingrese numero : ");
          v[i] = teclado.nextInt() ;
           if(i>0)
           {
           pos[contpos]=v[i];
           contpos=+1;}
           if(i<0)
           {
           neg[contneg]=v[i];
           contneg=+1;}
        } 
           for(int i=0;i<10;i++){
           System.out.println("vector : "+v[i]);
           }
           for(int i=0;i<contpos;i++){
           System.out.println("vector positivo: "+pos[i]);
                             }
           for(int i=0;i<contneg;i++){
           System.out.println("vector negativo : "+neg[i]);
                             }
        
    /**
 *
 * falta revisar y terminar:
 * declarar y poblar vector de largo 10 con numeros y luego 
 * dejar en un vector a los elementos postivos y en otro vector los negativos
 * mostrar los tres vectores sin mostrar espacios en blanco
 */
    
    
    
    }
}
