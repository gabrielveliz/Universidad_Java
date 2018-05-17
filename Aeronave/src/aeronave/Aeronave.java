package aeronave;
import java.util.Scanner;
public class Aeronave{
Scanner t=new Scanner(System.in);
    
public class Helicoptero extends Avion
{ 
    public void Rotores()
    {
        System.out.println("Rotores funcionando sin problemas");
    }
    
}
    
public class avion extends Avion
{
 
     public  void Misiles()
     {
         System.out.println("Misiles listos para usar");   
         System.out.println("Desea utilizar misiles? (si) o (no)");
         String res=t.next();
         if(res.equalsIgnoreCase("si")){
         System.out.println("Localizando enemigo........ ¡FUEGO!");}
         else{System.out.println("Opcion ingresada no valida, se cancela peticion de misiles");}
     }
   }
   
   public class Comercial
   {
    public void Asiento()
    { System.out.println("hay 163 asientos");}
   }

   public class Carga
   {
   public void suministros()
   {
       System.out.println("Suministros sin problemas");
   }
           
   
}
    public static void main(String[] args) {
        Aeronave F16= new Aeronave();
        Aeronave C130=new Aeronave();
        Aeronave Bell412 = new Aeronave();
        
        Avion a = new Avion();
       
        
    }
    
}
