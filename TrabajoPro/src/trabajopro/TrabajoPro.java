/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopro;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class TrabajoPro {
static Scanner t = new Scanner(System.in);
static int m[][]=new int [4][4];
static int v[]=new int [16];

    public static void ordenacionSeleccion()
    {
        int largo = v.length;
        for(int i=0; i<largo; i++) {
            int menor = i;
            for(int j=i+1; j<largo; j++) {
                if(v[j]<v[menor]) menor=j;
            }
            if(menor!=i) {
                int tmp     = v[i];
                v[i]        = v[menor];
                v[menor] = tmp;
            }
        }
    }

    public static void ordenacionInsercion()
    {
       int largo = v.length;
        for(int i=1; i<largo; i++) 
        {int j=i;
            while(j>0 && v[j]<v[j-1] ){
                int tmp = v[j];
                v[j]    = v[j-1];
                v[j-1]  = tmp;
                j--;
            }
     }
    
    }

    public static void ordenacionShell() {
        int largo = v.length;
        int grupo = largo;
        do {
            grupo = grupo / 2;
            for (int k = 0; k < grupo; k++) {
                for (int i = grupo + k; i < largo; i += grupo) {
                    int j = i;
                    while (j - grupo >= 0 && v[j] < v[j - grupo]) {
                        int tmp = v[j];
                        v[j] = v[j - grupo];
                        v[j - grupo] = tmp;
                        j = j - grupo;
                    }
                }
            }
        } while (grupo > 1);
    }

      public static void ordenacionRapida(int[] v) {
        int largo = v.length;
        quickSort(v,0,largo-1);
    }
 
      public static void quickSort(int[] v, int inicio, int fin) {
        if(inicio>=fin) return ;
        int pivote = v[inicio];
        int izq    = inicio+1;
        int der    = fin;
        while(izq<=der) {
            while(izq<=fin   && v[izq]< pivote) izq++;
            while(der>inicio && v[der]>=pivote) der--;
            if(izq<der) {
                int tmp = v[izq];
                v[izq]  = v[der];
                v[der]  = tmp;
            }
        }
        if(der>inicio) {
            int tmp  = v[inicio];
            v[inicio]= v[der];
            v[der]   = tmp;
        }
        quickSort(v,inicio, der-1);
        quickSort(v, der+1, fin);
        }

    public static void busquedaFuerzabruta()
    {

    }

    public static void busquedaBmh()
    {

    }

    public static void busquedaBinaria()
    {

    }

    public static void busquedaSecuencial()
    {

    }

    public static void main(String[] args){
        int opc;
        System.out.println("Trabajo de Ordenamiento y Busqueda");
        System.out.println("Escoja una opcion");
        opc=t.nextInt();
    switch( opc ){
    
       

       } 
        
        
        
    
    
    
    }

}
