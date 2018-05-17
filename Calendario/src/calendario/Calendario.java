/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calendario;

public class Calendario {
   public void ImprimeTrimestre ( int Año,
                                  String MesIzq, int DurMesIzq, int InicioSemanaMesIzq,
                                  String MesCentro, int DurMesCentro, int InicioSemanaMesCentro,
                                  String MesDer, int DurMesDer, int InicioSemanaMesDer)
   {
      System.out.print(MesIzq + " "+Año);
      System.out.print("                           "+MesCentro + " "+Año);
      System.out.print("                              "+MesDer + " "+Año+"\n");
      System.out.print("LU  MA  MI  JU  VI  SA  DO");
      System.out.print("           LU  MA  MI  JU  VI  SA  DO");
      System.out.print("             LU  MA  MI  JU  VI  SA  DO"+"\n");
       
       int dia1 = 1;
       int dia2 = 1;
       int dia3 = 1;
       
       for (int aux = 1; aux <= 7 ; aux ++)
       {
           if ( InicioSemanaMesIzq<= aux)
           {
               System.out.print(" " + dia1 + "  ");
               dia1++;
           }    
           else
           {
               System.out.print("    ");
           }
        }
           System.out.print("         ");
        for (int aux2 = 1; aux2 <= 7 ; aux2 ++)
            {
                if (InicioSemanaMesCentro <= aux2)
                {
               System.out.print(" " + dia2 + "  ");
               dia2++;
                 }    
                else
                 {
               System.out.print("    ");
                  }
           }
        System.out.print("           ");
            for (int aux3 = 1; aux3 <= 7 ; aux3 ++)
           {         

                if (InicioSemanaMesDer <= aux3)
                 {
               System.out.print(" " + dia3 + "  ");
               dia3++;
                  }    
                  else
                  {
                System.out.print("    ");
                 }
            }
       System.out.print("\n");

      
       for (int semana=1;semana<=6 ; semana++)
          { 
            
          for (int aux = 1; aux <= 7 ; aux ++)
          {
              if (dia1 < 10)
              {
                 System.out.print(" " + dia1 + "  ");
              }     
              if (dia1>=10 && dia1<= DurMesIzq)
              {
                 System.out.print( dia1 + "  ");
              }
              if(dia1>DurMesIzq) System.out.print("    ");
              dia1++;
           
               } 
         
        
          System.out.print("         ");
         
          for (int aux2 = 1; aux2 <= 7 ; aux2 ++)
          {
              if (dia2 < 10 )
              {
                 System.out.print(" " + dia2 + "  ");
              }     
              if(dia2>=10 && dia2<=DurMesCentro)
              {
                 System.out.print( dia2 + "  ");
              }
              if (dia2>DurMesCentro) System.out.print("    ");
              dia2++;
             }
       
          System.out.print("           ");
       
          for (int aux3 = 1; aux3 <= 7 ; aux3 ++)
          {
              if (dia3 < 10)
              {
                 System.out.print(" " + dia3 + "  ");
              }     
              if(dia3>= 10 && dia3 <= DurMesDer)
              {
                 System.out.print( dia3 + "  ");
              }
             if (dia3>DurMesDer) System.out.print("    ");
              dia3++;
            }
         
         
          System.out.print("\n");
         
         
        } 
       }
    
    public static void main(String[] args) 
    {
        Calendario Pepito = new Calendario();
        Calendario gabo = new Calendario();
        
        gabo.ImprimeTrimestre(2013, "Enero", 31, 2 , "Febrero", 28, 5 , "Marzo", 31, 5);
        gabo.ImprimeTrimestre(2013, "Abril", 30, 1 , "Mayo", 31, 3 , "Junio", 30, 6);
        gabo.ImprimeTrimestre(2013, "Julio", 31, 1 , "Agosto", 31, 4 , "Septiembre", 30, 7);
        gabo.ImprimeTrimestre(2013, "Octubre", 31, 2 , "Noviembre", 30, 5 , "Diciembre", 31, 7);
         
    }
    
}