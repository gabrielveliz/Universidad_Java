/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;

public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)        {
      int n,salir,veinte,diez,cinco,dos,mil;
      Scanner teclado=new Scanner(System.in);
    do{
      System.out.println("Bienvenidos al cajero del banco la juanita");
      System.out.println("ingrese el monto de dinero que desea retirar");
      n=teclado.nextInt();
           while (n<1000 || n>200000 || n%1000>0)
           { if(n<1000){
            System.out.println("Monto ingresado no es valido ingrese un monto superior o igual a 1000");
            n=teclado.nextInt();}
        
            if(n>200000) 
            {
            System.out.println("Monto ingresado no es valido ingrese un monto inferior o igual a 200000");   
            n=teclado.nextInt();   
            }
            if(n%1000>0)
            {
            System.out.println("El monto ingresado debe ser multiplo de 1000, ingrese monto nuevamente");
            n=teclado.nextInt();
            }
           }
       //fin validador monto//
          
        veinte=n/20000;
        n=n%20000;
        diez=n/10000;
        n=n%10000;
        cinco=n/5000;
        n=n%5000;
        dos=n/2000;
        n=n%2000;
        mil=n/1000;
        
        if(veinte>0){System.out.println("entregando : "+veinte+" billetes de 20 mil");}
        if(diez>0){System.out.println("entregando : "+diez+" billetes de 10 mil");}
        if(cinco>0){System.out.println("entregando : "+cinco+" billetes de 5 mil");}
        if(dos>0){System.out.println("entregando : "+dos+" billetes de 2 mil");}
        if(mil>0){System.out.println("entregando : "+mil+" billetes de mil");}
     
     System.out.println("retire su dinero");
     System.out.println("¿Desea realizar otro giro de dinero?");
     System.out.println(" -presione 0 para salir");
     System.out.println(" -presione cualquier numero para volver a retirar dinero");
     salir=teclado.nextInt();
    }while(salir!=0);
    
    }}