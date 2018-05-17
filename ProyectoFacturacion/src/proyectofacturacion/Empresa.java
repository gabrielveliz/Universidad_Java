
package proyectofacturacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabo
 */
public class Empresa {
    int rut;
    String nombre;
    Direccion em = new Direccion();
    Factura a = new Factura();
    

public void buscar()
{
 
 coneccion con = new coneccion();
    if("".equals(ventana.campo1.getText()))
    {JOptionPane.showMessageDialog(null, "ERROR: Introduzca un ID", "ERROR", JOptionPane.PLAIN_MESSAGE);
    }
    else{
        if(con.isNumeric(ventana.campo1.getText()))
        {
        int val=Integer.parseInt(ventana.campo1.getText());
        con.getValues(val);
        
        }
        else{
        JOptionPane.showMessageDialog(null, "ERROR: Introduzca un ID de factura valido", "Advertencia", JOptionPane.PLAIN_MESSAGE);
        }
    
    }
    
    
}

}

