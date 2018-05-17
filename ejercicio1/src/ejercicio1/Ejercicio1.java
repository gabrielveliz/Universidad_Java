/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Gabriel
 */

import java.util.*;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
        Scanner t=new Scanner(System.in);
       int v[]=new int [10];
       
        for(int i=0;i<10;i++)
        {
            n=i+1;
            System.out.println("Ingrese "+n+"° numero --> : ");
            v[i]=t.nextInt();
              
        }
        System.out.print("el vector ingresado es --> :v["+v[0]+"]");
        for(int i=1;i<10;i++){System.out.print("["+v[i]+"]");}     
        
    }
    
}
