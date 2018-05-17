/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

public class vehiculo extends Estacionamiento {

    String patente;
    String marca;
    String color;
    String modelo;
    Integer c;

    public vehiculo(String patente, String marca, String color, String modelo, int c) {
        this.patente = patente;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.c = 0;
    }
}
