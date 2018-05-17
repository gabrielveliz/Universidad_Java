/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 * // 
 * @author gabriel
 */  // esta clase simula una caja registradora de venta
import java.util.Scanner;

public class Cajero {
   
   
           
    public int iIngresarventa ()
    { //ingresa N precios y al final devuelve la suma de ellos
       Scanner leer = new Scanner (System.in);
        int isuma=0, iprecio;
    do
    {
        System.out.println("ingresa valor del producto");
        iprecio = leer.nextInt ();
        isuma += iprecio;
    }
    while (iprecio>0);// se repite solo si se ingresa valor
    return isuma;
    }
     
    
    
    
    
    public int icualcularvuelto( int itotal, int ipago)
    { // resta el total y el pago efectivo y devuelve el vuelto
        //int ivuelto = ipago - itotal;
       // return ivuelto;
     
        return (ipago - itotal) ;
    
    }

    
    
    public int irecibepago ()
    {
    Scanner leer = new Scanner (System.in);
    System.out.print("Ingresar pago : ");
    return leer.nextInt();    
    }
    





} 

