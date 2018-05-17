/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 184786486
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i,par,impar,cont,v[]; 
      par=0;impar=0;cont=0;
      v=new int[10];
     Scanner teclado = new Scanner(System.in);
       
        for(i=0;i<=9;i++)
        {
           System.out.println("ingrese nº : ");
           v[i]=teclado.nextInt();
         
           if(v[i]%2==0 && v[i]!=0)
           { 
               par=par+1;
           }
           if(v[i]%2>0)
           {
              impar=1+impar;           
           }
          if(v[i]>10 && v[i]<100)
           { 
          cont=cont+1;
           }
        } 
        
        System.out.println("los numeros pares son : "+par);
        System.out.println("los numeros impares son : "+impar);
        System.out.println("los numeros mayores a 10 y menores a 100 son : "+cont);
        
        
    }
}
