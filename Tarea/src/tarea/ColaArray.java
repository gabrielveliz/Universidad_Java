/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import javax.swing.JOptionPane;
public class ColaArray {
    private int MAX;private String[]COLA;private int FRENTE;private int FINAL;

public ColaArray(int MAX)
{
this.MAX=MAX;
this.FRENTE=0;this.FINAL=0;
this.COLA=new String[this.MAX+1];
}

public void EliminaCola()
{if(this.FRENTE==this.FINAL)
  {
   JOptionPane.showMessageDialog(null,"la cola esta vacia");
  }
else{ for(int i=FRENTE;i<FINAL-1;i++)
      {
          COLA[i]=COLA[i+1];
      }FINAL--;
    }
} 
public boolean IsColaLlena()
{
if(this.FINAL==this.MAX)
{return true;}
else
{return false;}
}
public boolean IsColaVacia()
{
if(this.FRENTE==this.FINAL)
{return true;}
else
{return false;}
}
public void InsertarCola(String aux)
{if(this.IsColaLlena())
{
JOptionPane.showMessageDialog(null,"La cola esta llena");
}else{String ITEM;
      ITEM=aux;
      this.FINAL++;
      this.COLA[FINAL]=ITEM;
}


}
public void MostrarCola()
{ if(this.IsColaVacia())
 {
 JOptionPane.showMessageDialog(null,"la cola esta vacia \n no hay datos que mostrar",
         "mostrar datos",JOptionPane.WARNING_MESSAGE);
 }
else
{String MOSTRAR="";
    for (int i = FRENTE+1; i <=FINAL; i++) {
        MOSTRAR=MOSTRAR+COLA[i]+"\n";
    }
    JOptionPane.showMessageDialog(null,"total es : "+this.FINAL+"\n"+"los datos son : "+
            "\n"+MOSTRAR," mostrar datos",JOptionPane.INFORMATION_MESSAGE);
}
}
public void VaciarCola()
{
FRENTE=0;
FINAL=0;
}



}
