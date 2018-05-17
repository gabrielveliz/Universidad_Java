/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class T3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    { int f,multi;
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("ingrese numero por favor");
    int x = teclado.nextInt();
    multi=0;f=0;
    //for(int co = 1;co<=x;co++) System.out.print(co+"  ");
    for(int c = 1;c<=x;c++)
   {   System.out.println(c+"  ");
       for( f=1; f<=x;f++)
         {
         System.out.print(f+"  ");
         }
       
       
       
   } 
    
    
    
    
    
    
    }
}
