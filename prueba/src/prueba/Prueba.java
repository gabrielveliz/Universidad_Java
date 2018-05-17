package prueba;

import java.util.Scanner;  

public class Prueba {
Scanner t;

   
   public void prueba()
   {
   t = new Scanner(System.in);
   }
   
   
   
   public void ejercicio1()
   {
   System.out.println("ejercicio 1 ");
   
   int [][] m;
   m = new int [8][8];
   System.out.println("+---+---+---+---+---+---+---+---+");
   for(int i = 0 ; i<8 ; i++)
   {
       for(int j = 0; j<8;j++)
      { if(i%2==0)
              {if(j%2==0)
      {
      System.out.print("|   ");}
      else
      {System.out.print("|***");}
              }
       
       if(i%2>0)
       {
           if(j%2>0)
      {
      System.out.print("|   ");}
      else
      {System.out.print("|***");}
       
       }
       }
       System.out.println("|  "); 
      System.out.println("+---+---+---+---+---+---+---+---+");
   }
    
   
   
   System.out.println("final ejercicio 1 ");
   }

   
 
   
   
   public void ejercicio2()
   {
   System.out.println("ejercicio 2");
   
   
   
  String n;
  int cont = 0;
  double [] v; 
  double no;
  v = new double[30];
  do
  {System.out.println("Introduzca nombre del alumno(Para finalizar introduzca fin) ");
   n=t.next();
   if(!"fin".equals(n))
   {
   System.out.println("Introduzca nota del alumno ");
   no=t.nextDouble();
   v[cont]=no;}
   
   cont++;
  }
  while(!"fin".equals(n));
  int cont1=cont-1;
  System.out.println("se ingresaron "+cont1+" alumnos");
  int c1 = 0;
  int c2 = -1;
  double pro=0;
  for(int c=0;c<cont;c++)
  { if(v[c]>=4.0){c1++;}
    else{c2++;}
    pro= v[c]+ pro;
    
  }
  double prom= pro/cont1;
 
  System.out.println(c1+" alumnos APROBARON");
  System.out.println(c2+" alumnos REPROBARON");
  System.out.println("El promedio el curso fue : "+prom); 
   System.out.println("final ejercicio 2");
   }
   
   
   
   
   public void ejercicio3()
   {
   System.out.println("ejercicio 3");
   
   System.out.println("Sucecion de FIBONACCI");
   System.out.println("Introduzca N° entre 2 y 100");
   int n = t.nextInt();
   if (n<2 || n>100)
           {
           System.out.println("ERROR: SE INTRODUJO NUMERO FUERA DE RANGO ");
           }
   else
   {
   System.out.println("0");
   System.out.println("1");
   int v [] = new int [n];
   v[0]=0;
   v[1]=1;
  for(int c=2;c<n;c++)
      {
          int aux1=c-1;
          int aux2=c-2;
          v[c]= v[aux1]+v[aux2];
          System.out.println(v[c]);
  
  }
   }
   System.out.println("final ejercicio 3");
   }
   
           
    public static void main(String[] args)
    {
     Prueba c2=new Prueba();
     
     System.out.println("Gabriel Veliz Z");
     
     c2.ejercicio1();
     c2.ejercicio2();
     c2.ejercicio3();
        
        
    }
    
}
