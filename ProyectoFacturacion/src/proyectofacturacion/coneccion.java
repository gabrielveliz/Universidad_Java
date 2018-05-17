/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofacturacion;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.DefaultListModel;
import java.awt.HeadlessException;
import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import java.util.logging.Level;
//import java.util.logging.Logger;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
/**
 *
 * @author Gabo
 */
public class coneccion {
    private String driver="com.mysql.jdbc.Driver";
    private String cadenaConeccion="jdbc:mysql://192.168.43.2/facturacion";
    private String usuario="gabriel";
    private String contraseña="gabriel";
    public Connection con;
    
    public coneccion ()
    {try{
        Class.forName(driver);
        con=DriverManager.getConnection(cadenaConeccion,usuario,contraseña);
        //JOptionPane.showMessageDialog(null,"coneccion Exitosa");
    }catch(ClassNotFoundException | SQLException | HeadlessException e)
    {
        JOptionPane.showMessageDialog(null,"coneccion fallida"+e.getMessage());
    }
    
    
    }
     public void getValues(int id) {
         
         int cont=0;
         String nombre="",ape="",dire="",prod="";
         int rut=0,id_fac=0,pre=0,canti=0;
         DefaultListModel lista_id=new DefaultListModel();
         DefaultListModel lista_rut=new DefaultListModel();
         DefaultListModel lista_nombre=new DefaultListModel();
         DefaultListModel lista_apellido=new DefaultListModel();
         DefaultListModel lista_item=new DefaultListModel();
         DefaultListModel lista_precio=new DefaultListModel();
         DefaultListModel lista_impo=new DefaultListModel();
         DefaultListModel cantidad=new DefaultListModel();
         DefaultListModel vacia=new DefaultListModel();
         ItemFactura cal= new ItemFactura();
         int total_pre=0;
         double total_iva=0;
         
        try {
            String Query = "SELECT * FROM factura,cliente where factura.rut_cliente=cliente.rut and factura.id_factura="+id+";";
            Statement st = con.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            
            while (resultSet.next()) {
            rut=resultSet.getInt("cliente.rut");
            nombre=resultSet.getString("cliente.nombre");
            ape=resultSet.getString("cliente.apellidos");
            id_fac=resultSet.getInt("factura.id_factura");
            lista_id.addElement(id_fac);
            lista_rut.addElement(rut);
            lista_nombre.addElement(nombre+" "+ape);
            lista_apellido.addElement(ape);
            cont++;
            
            
            }
            
           String Query2 = "select nombre,precio,item_factura.id_producto,count(item_factura.id_producto) as 'cantidad' from item_factura,producto where id_factura="+id+" and producto.id_producto=item_factura.id_producto group by item_factura.id_producto order by item_factura.id_producto;";
           resultSet = st.executeQuery(Query2);
            
           while (resultSet.next()) {
            prod=resultSet.getString("producto.nombre");
            canti=resultSet.getInt("cantidad");
            pre=resultSet.getInt("producto.precio") * canti;
            
            
            
            total_pre=pre+total_pre;
            
            lista_impo.addElement(cal.CalcularImporte(pre));
            
            lista_item.addElement(canti+" "+prod);
            lista_precio.addElement(pre);

            }
           total_iva=total_pre*0.19;
           
            String pas = String.valueOf(cont);
            String to1= String.valueOf(total_pre);
            String to2= String.valueOf(total_iva);
            
            if(cont>0){
                    ventana.contador.setText("Factura Encontrada");
                    ventana.lista.setModel(lista_id);
                    ventana.lista2.setModel(lista_rut);
                    ventana.lista3.setModel(lista_nombre);
                   
                    ventana.lista5.setModel(lista_item);
                    ventana.listaa6.setModel(lista_precio);
                    ventana.lista7.setModel(lista_impo);
                    ventana.total_precio.setText(to1);
                    ventana.total_iva.setText(to2);
            }
              if (cont==0) {
                   vacia.addElement("-- Sin datos --");
                    ventana.contador.setText("No se encontro Factura");
                    ventana.lista.setModel(vacia);
                    ventana.lista2.setModel(vacia);
                    ventana.lista3.setModel(vacia);

                    ventana.listaa6.setModel(vacia);
                    ventana.lista7.setModel(vacia);
                    ventana.total_precio.setText("0");
                    ventana.total_iva.setText("0.0");
                }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        
    }
       public void traerclientes() {
        
        try {
            String Query = "SELECT * FROM cliente;";
            Statement st = con.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                int d = resultSet.getInt("rut");
                
                String rut= String.valueOf(d);
                VentanaFactura.combo1.addItem(rut);
            }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        
    }
       public void traerproducto() {
        
        try {
            String Query = "SELECT * FROM producto;";
            Statement st = con.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                String d = resultSet.getString("nombre");
                VentanaFactura.combo2.addItem(d);
            }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        
    }
       
     public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    
      public void InsertarCliente(String rut_cliente,String nombre,String apellido,String direccion,String comuna,String ciudad,String region) {
           int r;
           r=Integer.parseInt(rut_cliente);
           System.out.println(r+" "+nombre+" "+apellido+" "+direccion+" "+comuna+" "+ciudad+" "+region);
          try {
            String Query = "INSERT INTO cliente VALUES("+r+",'"+nombre+"','"+apellido+"');";
            String Query2 = "INSERT INTO direccion VALUES("+r+",'"+direccion+"','"+comuna+"','"+ciudad+"','"+region+"');";
            
            Statement st = con.createStatement();
            st.executeUpdate(Query);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
      public void InsertarProdcuto() {
           int r;
           r=Integer.parseInt(VentanaProducto.text_precio.getText());
           String g= VentanaProducto.text_producto.getText();
          try {
            String Query = "INSERT INTO producto(nombre,precio) VALUES('"+g+"',"+r+");";
            
            
            Statement st = con.createStatement();
            st.executeUpdate(Query);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
    public void InsertarFactura(int id,int rut_cliente) {
        try {
            String Query = "INSERT INTO factura VALUES("+id+","+rut_cliente+");";
            Statement st = con.createStatement();
            st.executeUpdate(Query);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
      public int ID_ultima_factura()
      {   int a=0;
             try {
            String Query = "SELECT * FROM factura;";
            Statement st = con.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                a = resultSet.getInt("id_factura");
            }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
          return a;
      }
      public int ID_producto(String nombre)
      {   int a=0;
             try {
            String Query = "SELECT * FROM producto where nombre='"+nombre+"';";
            Statement st = con.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                a = resultSet.getInt("id_producto");
            }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
           return a;
      }
      
      public void InsertarItem(int id_factura,int id_producto) {
        try {
            String Query = "INSERT INTO item_factura VALUES("+id_producto+","+id_factura+");";
            
            Statement st = con.createStatement();
            st.executeUpdate(Query);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
      
      public void exportar(int id)throws FileNotFoundException, DocumentException
    { 
         
         
         ArrayList <String> producto = new ArrayList();
         ArrayList <Integer> precio = new ArrayList();
         ArrayList <Double> IVA = new ArrayList();
        
        
        int cont=0;
         String nombre="",ape="",dire="",comuna="",ciudad="",region="",prod="",nombre_empresa="",direcion_empresa="";
         int rut=0,id_fac=0,pre=0,rut_empresa=0,canti=0;
         ItemFactura cal= new ItemFactura();
         int total_pre=0;
         double total_iva=0;
         
        try {
            String Query = "SELECT * FROM factura,cliente where factura.rut_cliente=cliente.rut and factura.id_factura="+id+";";
            Statement st = con.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            
            while (resultSet.next()) {
            rut=resultSet.getInt("cliente.rut");
            nombre=resultSet.getString("cliente.nombre");
            ape=resultSet.getString("cliente.apellidos");
            id_fac=resultSet.getInt("factura.id_factura");
            
            cont++;

            }
         
           String Query2 = "select nombre,precio,item_factura.id_producto,count(item_factura.id_producto) as 'cantidad' from item_factura,producto where id_factura="+id+" and producto.id_producto=item_factura.id_producto group by item_factura.id_producto order by item_factura.id_producto;";
           resultSet = st.executeQuery(Query2);
            
           while (resultSet.next()) {
            prod=resultSet.getString("producto.nombre");
            canti=resultSet.getInt("cantidad");
            pre=resultSet.getInt("producto.precio") * canti;
            
            
            
            total_pre=pre+total_pre;
            
            IVA.add(cal.CalcularImporte(pre));
            
            producto.add(canti+" "+prod);
            precio.add(pre);

            }
           total_iva=total_pre*0.19;
           
            String pas = String.valueOf(cont);
            String to1= String.valueOf(total_pre);
            String to2= String.valueOf(total_iva);
            
            String Query3 = "SELECT * FROM direccion where rut_cliente="+rut+";";
            resultSet = st.executeQuery(Query3);
            
           while (resultSet.next()) {
            dire=resultSet.getString("direccion");
            comuna=resultSet.getString("comuna");
            ciudad=resultSet.getString("ciudad");
            region=resultSet.getString("region");
            total_pre=pre+total_pre;
            IVA.add(cal.CalcularImporte(pre));
            producto.add(prod);
            precio.add(pre);

            }
           
           String Query4 = "SELECT * FROM empresa;";
            resultSet = st.executeQuery(Query4);
            
           while (resultSet.next()) {
            rut_empresa=resultSet.getInt("rut");
            nombre_empresa=resultSet.getString("nombre");
            direcion_empresa=resultSet.getString("direccion");
            }
            
            
            
            
            
            if(cont>0){
           FileOutputStream archivo = new FileOutputStream("C:\\Users\\Gabo\\Desktop\\Proyecto Facturacion\\Factura N°"+id+".pdf");
         Document documento = new Document();
         PdfPTable  tabla = new PdfPTable(3);
         PdfWriter.getInstance(documento, archivo);
          documento.open();
      documento.add(new Paragraph("Numero de factura: "+id_fac));
      documento.add(new Paragraph("-----------Datos Empresa---------"));
      documento.add(new Paragraph("RUT: "+rut_empresa));
      documento.add(new Paragraph("Nombre: "+nombre_empresa));
      documento.add(new Paragraph("Direccion: "+direcion_empresa));
      documento.add(new Paragraph("                      "));
      documento.add(new Paragraph("-----------Datos Cliente---------"));
      documento.add(new Paragraph("Nombre: "+nombre+" "+ape+"      RUT: "+rut));
      documento.add(new Paragraph("Direccion: "+dire));
      documento.add(new Paragraph("Comuna: "+comuna));
      documento.add(new Paragraph("Ciudad: "+ciudad));
      documento.add(new Paragraph("Region: "+region));
      documento.add(new Paragraph("    "));
      documento.add(new Paragraph("Lista Productos"));
      documento.add(new Paragraph("    "));
                    tabla.addCell("Nombre");
                    tabla.addCell("Precio");
                    tabla.addCell("IVA");
                    tabla.addCell("  ");
                    tabla.addCell("  ");
                    tabla.addCell("  ");
                for(int i=0;i<producto.size();i++) {   
                    tabla.addCell(producto.get(i));
                    tabla.addCell(String.valueOf(precio.get(i)));
                    tabla.addCell(String.valueOf(IVA.get(i)));
                   
                }
                tabla.addCell("  ");
                tabla.addCell("  ");
                tabla.addCell("  ");
                tabla.addCell("TOTAL");
                tabla.addCell(to1);
                tabla.addCell(to2);
      documento.add(tabla);
      documento.close();   
      JOptionPane.showMessageDialog(null, "Archivo generado Exitosamente, Ubicacion C:\\Users\\Gabo\\Desktop\\Proyecto Facturacion", "Exportacion", JOptionPane.PLAIN_MESSAGE);
            }
              if (cont==0) {
     JOptionPane.showMessageDialog(null, "Error generando archivo, ID no encontrado", "ERROR", JOptionPane.PLAIN_MESSAGE);
                }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }

     
    }

       
}
