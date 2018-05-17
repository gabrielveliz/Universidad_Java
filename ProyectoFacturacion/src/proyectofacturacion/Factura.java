/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofacturacion;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;



/**
 *
 * @author Gabo
 */
public class Factura {
   
   String a,b;
   
   
   public String InsertarItem()
   {
    b=(String) VentanaFactura.combo2.getSelectedItem();
    return b;
   }
   
   public void generar() throws FileNotFoundException, DocumentException
{
 
 coneccion con = new coneccion();
    if("".equals(ventana.campo1.getText()))
    {JOptionPane.showMessageDialog(null, "ERROR: Introduzca un ID", "ERROR", JOptionPane.PLAIN_MESSAGE);
    }
    else{
        if(con.isNumeric(ventana.campo1.getText()))
        {
        int val=Integer.parseInt(ventana.campo1.getText());
        con.exportar(val);
        
        
        }
        else{
        JOptionPane.showMessageDialog(null, "ERROR: Introduzca un ID de factura valido", "Advertencia", JOptionPane.PLAIN_MESSAGE);
        }
    
    }
    
    
}
   
   
}
