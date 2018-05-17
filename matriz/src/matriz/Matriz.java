/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author 184786486
 */
import java.util.Scanner;
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,e,cont = 0,prom = 0,suma=0;
        int [][] m = new int[3][3];
       Scanner teclado = new Scanner(System.in);
       
        for( i=0;i<3;i++)
        {   for( e=0;e<3;e++)
              {   System.out.print("ingrese numero : ");
                  m[i][e]=teclado.nextInt();
                  cont=+1;
                  suma=+m[i][e];
              }
        }
        prom=suma/cont;
        System.out.println("el promedio es : "+ prom);
        System.out.println("la matriz es :");
        for( i=0;i<3;i++)
        {   for( e=0;e<3;e++)
              {   System.out.print(m[i][e]+"  ");
                  }System.out.println(" ");
        }
        
       
        System.out.println("diagonal principal : ");
        for( i=0;i<3;i++)
        {   for( e=0;e<3;e++)
              {   
                 if(e==i)
                 {System.out.print(m[i][e]+"  ");}
                 if(e!=i){System.out.print("   ");
                            }
                          }System.out.println(" ");
        }
        
        System.out.println("diagonal secundaria : ");
        for( i=0;i<3;i++)
        {   for( e=0;e<3;e++)
              {   
                 if(e+i==2)
                 {System.out.print(m[i][e]+"  ");}
                 if(e+i!=2){System.out.print("   ");
                            }
                          }System.out.println(" ");
        }
    }
}
