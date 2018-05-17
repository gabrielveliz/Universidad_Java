/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 *
 * @author Gabo
 */
public class CursoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    System.out.println("Ciclo For");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    System.out.println("Ciclo While");
        
        int j=1;
        while (j<11) {            
            System.out.println(j);
            j++;
        }
    System.out.println("Numeros Naturales Impares");
         int i=1;
         int cont=0;
         boolean x=true;
        while(x) {
            if (i%2!=0) {
                System.out.println(i);
                cont++;
            }
        i++;
        if(cont==50)
        {x=false;}
        }

    }
    
}
