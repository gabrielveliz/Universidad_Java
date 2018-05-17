/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author Gabriel
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor=0;
        
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                valor+=(i*j)+(i-j);
            }
            
        }
        System.out.println(valor);
    }
    
}
