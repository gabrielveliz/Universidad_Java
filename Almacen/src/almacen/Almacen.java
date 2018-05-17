/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author gabriel
 */
public class Almacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {   System.out.println("Bienvenido");
        // TODO code application logic here
        Cajero micaja = new Cajero ();
        
       int itotalventa = micaja.iIngresarventa( );
        System.out.println("Total de esta venta : " + itotalventa);
        int ipagocliente =0, ivuelto;
    do
    {  
        ipagocliente = ipagocliente + micaja.irecibepago();
        ivuelto = micaja.icualcularvuelto(itotalventa, ipagocliente);
        if (ivuelto < 0)System.out.println("Sorry, con eso no le alcanza");
    } while (ivuelto < 0);
        System.out.println (" Gracias!, no olvide su vuelto = $" + ivuelto );
         
    } //end main
} //end class
