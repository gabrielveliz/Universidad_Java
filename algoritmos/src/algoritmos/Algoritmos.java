package algoritmos;
import java.util.*;
public class Algoritmos {

    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void ordenacionInsercion(int[] v) {
        final int N = v.length;
        for (int i = 1; i < N; i++) {
            int j = i;
            while (j > 0 && v[j] < v[j - 1]) {
                int tmp = v[j];
                v[j] = v[j - 1];
                v[j - 1] = tmp;
                j--;
            }
        }
    }

    public static void ordenacionShell(int[] v) {
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j] < v[j - incremento]) {
                        int tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    }

     public static void ordenacionShell(String v[]) {

        int largo = v.length;

        int grupo = largo;
        do {
            grupo = grupo / 2;
            for (int k = 0; k < grupo; k++) {
                for (int i = grupo + k; i < largo; i += grupo) {
                    int j = i;
                    while (v[i].compareToIgnoreCase(v[j - grupo]) >= 0 && v[j].compareToIgnoreCase(v[j - grupo]) < 0) {
                        String tmp = v[j];
                        v[j] = v[j - grupo];
                        v[j - grupo] = tmp;
                        j = j - grupo;
                    }
                }
            }
        } while (grupo > 1);
    }
    public static void quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = A[i];                  // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            quicksort(A, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der); // ordenamos subarray derecho
        }
    }

    public static int busquedaBinaria(int  vector[], int dato){
  int n = vector.length;
  int centro,inf=0,sup=n-1;
   while(inf<=sup){
     centro=(sup+inf)/2;
     if(vector[centro]==dato) return centro;
     else if(dato < vector [centro] ){
        sup=centro-1;
     }
     else {
       inf=centro+1;
     }
   }
   return -1;
 }

public int busquedaSecuencial(int []arreglo,int dato)
{ 
     int posicion = -1; 
     for(int i = 0; i < arreglo.length; i++)
     {   		       //recorremos todo el arreglo 
          if(arreglo[i] == dato)  
          { 		      //comparamos el elemento en el 
		     //arreglo con el buscado 
               posicion = i;    //Si es verdadero guardamos la 
		     //posicion 
	break;            //Para el ciclo 
           } 
      } 
      return posicion; 
} 


public static void busquedaFuerzaBruta(String texto, String patron)
	{
		int n=texto.length();
		int m=patron.length();
		int k=0;
		int j=0;
		while (k<n)
		{
			while(j<m && j+k<n &&texto.charAt(k+j)==patron.charAt(j))
		  	{
		  		if (j==m-1)
		  		{
		  			System.out.println("calce entre "+(k-j+1)+" y "+k);
		  			break;
		  		}
		  		j++;
		  	}
		  	j=0;
		  	k++;
		}
	}
  


    public static void main(String[] args) {
   Scanner t = new Scanner(System.in);
   String v[]= new String [10];
        
        
        
        for (int i = 0; i < 10; i++) {
         System.out.println("Ingrese "+(i+1)+"° dato del vector");
         v[i]=t.next();
        }
        
        for (int i = 1; i < v.length; i++) {
            String aux=v[i];
            for (int j = i-1; j>=0 && v[j].compareToIgnoreCase(aux)>0; j--) {
                
                v[j+1]=v[j];
                v[j]=aux;        
                
            }
          }
        
        for (String v1 : v) {
            System.out.print("[" + v1 + "]"); 
        }
        
       
        
        }
        
    }


