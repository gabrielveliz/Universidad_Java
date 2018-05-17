/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofacturacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabo
 */
public class Cliente {
    
    public void NuevoCliente()
    {
    coneccion n = new coneccion();
    String no,ape,dir,co,ci,re,rut;
    
    rut=VentanaCliente.caja_rut.getText();
    no=VentanaCliente.caja_nombres.getText();
    ape=VentanaCliente.caja_apellidos.getText();
    dir=VentanaCliente.caja_direccion.getText();
    co=VentanaCliente.caja_comuna.getText();
    ci=VentanaCliente.caja_ciudad.getText();
    re=VentanaCliente.caja_region.getText();
    
   
    
    
        
        
        if(n.isNumeric(VentanaCliente.caja_rut.getText()))
        {n.InsertarCliente(rut,no, ape, dir, co, ci, re);
         
        }
        else{JOptionPane.showMessageDialog(null, "ERROR: Introduzca un RUT valido (Solo numeros)", "Advertencia", JOptionPane.PLAIN_MESSAGE);}
    
    
    
    }
    
}
