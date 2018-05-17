/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestra;
import java.util.Scanner; 

/**
 *
 * @author Gabriel
 */
public class Muestra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  Scanner t =new Scanner(System.in);
        
    System.out.println("ejercicio 3");
   
   System.out.println("Sucecion de FIBONACCI");
   System.out.println("Introduzca N° entre 2 y 100");
   int n = t.nextInt();
   if (n<2 || n>100)
           {
           System.out.println("ERROR: SE INTRODUJO NUMERO FUERA DE RANGO ");
           }
   else
   {
   System.out.println("0");
   System.out.println("1");
   int v [] = new int [n];
   v[0]=0;
   v[1]=1;
  for(int c=2;c<n;c++)
      {
          int aux1=c-1;
          int aux2=c-2;
          v[c]= v[aux1]+v[aux2];
          System.out.println(v[c]);
  
  }
   }
    }
    
}
