package guia_ejercicios;

import java.util.*;
public class Guia_ejercicios {

   
    public void ejercicio1()
    {
         int n;
        Scanner t=new Scanner(System.in);
       int v[]=new int [10];
       
       System.out.println("Comienzo primer ejercicio");
       /*---------------------------------------------*/
       for(int i=0;i<10;i++)
        {
            n=i+1;
            System.out.println("Ingrese "+n+"° numero --> : ");
            v[i]=t.nextInt();
              
        }
        System.out.print("el vector ingresado es --> :v["+v[0]+"]");
        for(int i=1;i<10;i++){System.out.print("["+v[i]+"]");}
       /*---------------------------------------------*/
        System.out.println(" ");
        System.out.println("Fin primer ejercicio");
        System.out.println(" ");
    }
    
    
    
     public void ejercicio2()
    {  System.out.println("Comienzo ejercicio 2 ");
       String va = "a";String ve = "e";String vi = "i";String vo = "o";String vu = "u";
       String v[]=new String [10];
       Scanner t=new Scanner(System.in);
       int n;
       int cont=0;
       
        for (int i = 0; i < 10; i++) 
        {n=i+1;
            System.out.println("Ingrese "+n+"° letra ---> :");
            v[i]=t.next();
            if(v[i].equalsIgnoreCase(va) || v[i].equalsIgnoreCase(ve) || v[i].equalsIgnoreCase(vi) || v[i].equalsIgnoreCase(vo) ||v[i].equalsIgnoreCase(vu)){cont++;}
        }
        System.out.print("el vector ingresado es --> :v["+v[0]+"]");
        for(int i=1;i<10;i++){System.out.print("["+v[i]+"]");}
        System.out.println(" ");
        
        System.out.println("hay "+cont+" vocales");
        System.out.println(" ");
        System.out.println("Fin ejercicio 2");
        System.out.println(" ");
              
         }
    

    
    
    public void ejercicio3()
   {System.out.println("Comienzo ejercicio 3 ");
   Scanner t=new Scanner(System.in);
   int n;
   int v[]=new int [10];
       System.out.println("En este programa los numeros ingresados deben ser positivos ");
       for (int i = 0; i < 10; i++) 
       {n=i+1;
        
        System.out.println("Ingrese "+n+"° numero --> : ");
        v[i]=t.nextInt();
        while(v[i]<1)
        {
        System.err.println("ERROR:numero NEGATIVO - Ingrese "+n+"° numero --> : ");
        v[i]=t.nextInt();
        }}
        System.out.print("el vector ingresado es --> :v["+v[0]+"]");
        for(int i=1;i<10;i++){System.out.print("["+v[i]+"]");}
        System.out.println(" ");
        
        System.out.print("las psociones impares del vector son --> :v["+v[1]+"]");
        for(int e=3;e<10;e++){if(e%2>0){System.out.print("["+v[e]+"]");}}
       
        System.out.println(" ");
        System.out.println("Fin ejercicio 3 ");
        System.out.println(" ");}
   
   
   
   public void ejercicio4()
   {   System.out.println("Comienzo ejercicio 4 ");
       
       int n,cont,primo;
       int v[]=new int [10];
       cont=0;primo=0;
       
       for (int i = 2; i < 100; i++) 
       {   for (int j = 1; j < 100; j++) 
            {
                if(i%j==0){primo++;}
            }
       
           if(primo==2 && cont<10){v[cont]=i; cont++;}
           
           primo=0;}
        
       System.out.print("el vector primo es  --> :vecprimo["+v[0]+"]");
       for(int e=1;e<10;e++){System.out.print("["+v[e]+"]");}
       
       System.out.println(" ");
       System.out.println("Fin ejercicio 4 ");
       System.out.println(" ");}
   
   public void ejercicio5()
   {
       System.out.println("Comienzo ejercicio 5 ");
   Scanner t=new Scanner(System.in);
   int n;
   int v[]=new int [10];
       for (int i = 0; i < 10; i++) 
       {n=i+1;
        System.out.println("Ingrese "+n+"° numero --> : ");
        v[i]=t.nextInt();}
        System.out.print("el vector ingresado es --> :v["+v[0]+"]");
        for(int i=1;i<10;i++){System.out.print("["+v[i]+"]");}
        System.out.println(" ");
        int w=v[0]+4;
        System.out.print("las psociones impares del vector son --> :v["+w+"]");
        for(int e=1;e<10;e++){
            int u=v[e]+4;
            System.out.print("["+u+"]");}
       
        System.out.println(" ");
        System.out.println("Fin ejercicio 5 ");
        System.out.println(" ");
   }
  
   public void ejercicio6()
   {   System.out.println("Comienzo ejercicio 6 ");
       Scanner t=new Scanner(System.in);
       float promedio,prom;
       int n;
       prom=0;
       int v[]=new int [10];
       System.out.println("Los numeros ingresados deben ser positivos ");
       for (int i = 0; i < 10; i++) 
       {n=i+1;
        
        System.out.println("Ingrese "+n+"° numero --> : ");
        v[i]=t.nextInt();
        while(v[i]<1)
        {
        System.err.println("ERROR:NUMERO NEGATIVO - Ingrese "+n+"° numero --> : ");
        v[i]=t.nextInt();
        }
       prom=prom+v[i];
       }
       promedio=prom/10;
       
       System.out.println("el promedio del vector ingresado es : "+promedio);
        System.out.println(" ");
        System.out.println("Fin ejercicio 6 ");
        System.out.println(" ");
   }
    
   public void ejercicio7()
   {    System.out.println("Comienzo ejercicio 7 ");
       int n,cont;
       Scanner t=new Scanner(System.in);
       int v1[]=new int [5];
       int v2[]=new int [10];
       int v3[]=new int [15];
       cont=0;
       for(int i=0;i<5;i++)
        {
            n=i+1;
            System.out.println("Ingrese "+n+"° numero del 1°vector --> : ");
            v1[i]=t.nextInt();
            v3[cont]=v1[i];
            cont++;
        }
        for(int i=0;i<10;i++)
        {
            n=i+1;
            System.out.println("Ingrese "+n+"° numero del 2°vector --> : ");
            v2[i]=t.nextInt();
            v3[cont]=v2[i];
            cont++;
        }
        System.out.print("el primer vector ingresado es --> :v["+v1[0]+"]");
        for(int i=1;i<5;i++){System.out.print("["+v1[i]+"]");} System.out.println(" ");
        
        System.out.print("el segundo vector ingresado es --> :v["+v2[0]+"]");
        for(int i=1;i<10;i++){System.out.print("["+v2[i]+"]");} System.out.println(" ");
        
        System.out.print("el vector combinando vector 1 y vector 2 es --> :v["+v3[0]+"]");
        for(int i=1;i<15;i++){System.out.print("["+v3[i]+"]");}
        System.out.println(" ");
        System.out.println("Fin ejercicio 7 ");
        System.out.println(" ");
        }
   
   public void ejercicio8()
   {    System.out.println("Comienzo ejercicio 8 ");
        int n,cont,primo,conta,contab,suma;
        Scanner t=new Scanner(System.in);
        int v[]=new int [10];
        int va[]=new int [10];
        int vb[]=new int [10];
        primo=0;conta=0;contab=0;
        
        //-----------------------------------------------------------//
        for(int i=0;i<10;i++)
        { 
        n=i+1;
        System.out.println("Ingrese "+n+"° numero --> : ");
        v[i]=t.nextInt();
       
        suma=0;
        for (int j = 1; j <= v[i]; j++) 
           {
              if(v[i]%j==0){primo++;}
           }
        
        for (int j = 1; j < v[i]; j++) 
           {
              if(v[i]%j==0){suma=j+suma;}
           }
           
        if(suma==v[i]){vb[contab]=v[i]; contab++;}
           if(primo==2){va[conta]=v[i]; conta++;}
           primo=0;}
       //--------------------------------------------------------------//  
        System.out.print("el vector ingresado es --> :v["+v[0]+"]");
        for(int i=1;i<10;i++){System.out.print("["+v[i]+"]");} System.out.println(" ");
        
        if(conta>0){System.out.print("el vector primo es  --> :["+va[0]+"]");
        for(int e=1;e<conta;e++){System.out.print("["+va[e]+"]");}System.out.println(" ");}
        
        
        if(contab>0){System.out.print("el vector perfecto es  --> :["+vb[0]+"]");
        for(int e=1;e<contab;e++){System.out.print("["+vb[e]+"]");}System.out.println(" ");}
        
        
        System.out.println("Fin ejercicio 7 ");
        System.out.println(" ");
        
   }
   
   public void ejercicio9()
   {   System.out.println("Comienzo ejercicio 8 ");
    System.out.println(" ");
       int v[]=new int [100];int par;int suma;par=0;suma=0;
       for (int i = 0; i < 100; i++)
       {
           v[i]=i*3;
           if(v[i]%2==0){par++;}
           else{suma=v[i]+suma;}
       }
        System.out.print("el vector es --> :v["+v[0]+"]");
        for(int i=1;i<100;i++){System.out.print("["+v[i]+"]");} System.out.println(" ");
        System.out.println("hay "+par+" elementos pares y la suma de los elementos impares es "+suma);
        System.out.println(" ");
        System.out.println("Fin ejercicio 8 ");
       System.out.println(" ");
   }
   
   public void ejercicio10()
   {System.out.println("Comienzo ejercicio 10");
    Scanner t =new Scanner(System.in);
    int v[]=new int [100];
    int n,x,me,ma;
       for (int i = 0; i < 100; i++) 
       {n=i+1;
          System.out.println("Ingrese "+n+"° numero");   
          v[i]=t.nextInt();
       }
       
       System.out.print("el vector ingresado es --> :v["+v[0]+"]");
       for(int i=1;i<100;i++){System.out.print("["+v[i]+"]");} System.out.println(" ");
        
       for(int i=0;i<100;i++)
       {for (int j =i+1; j < 100; j++)
        {
         if(v[j]<v[i])
         {x=v[i];
          v[i]=v[j];
          v[j]=x;}  
         }
       }
   
        
        
        System.out.print("el vector ordenado es --> :v["+v[0]+"]");
        for(int i=1;i<100;i++){System.out.print("["+v[i]+"]");} System.out.println(" ");
        
       System.out.println("Fin ejercicio 10");}
   
   public static void main(String[] args) {
        
      Guia_ejercicios a=new Guia_ejercicios();  
       
       a.ejercicio1();
       a.ejercicio2();
       a.ejercicio3();
       a.ejercicio4();
       a.ejercicio5();
       a.ejercicio6();
       a.ejercicio7();
       a.ejercicio8();
       a.ejercicio9();
       a.ejercicio10();
  
       
       
       
   }
    
}
