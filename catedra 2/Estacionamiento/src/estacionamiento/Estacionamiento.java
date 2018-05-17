package estacionamiento;

import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Estacionamiento {

    public static void main(String[] args) {

        Stack<vehiculo> p = new Stack();
        LinkedList<vehiculo> list = new LinkedList<>();

        Estacionamiento e = new Estacionamiento();
        vehiculo uno = new vehiculo("BA7658", "Suzuky", "rojo", "sx4", 0);
        vehiculo dos = new vehiculo("BC5423", "toyota", "azul", "yaris", 0);
        vehiculo tres = new vehiculo("BC5426", "Suzuky", "gris", "switch", 0);
        vehiculo cuatro = new vehiculo("BC5429", "Great wall", "azul", "hover", 0);
        vehiculo cinco = new vehiculo("BC5430", "toyota", "azul", "hilux", 0);
        vehiculo seis = new vehiculo("BC5431", "ford", "azul", "sport", 0);
        vehiculo siete = new vehiculo("BC5432", "mitsubishi", "azul", "lancer", 0);
        vehiculo ocho = new vehiculo("BC5433", "toyota", "azul", "hammer", 0);
        p.add(uno);
        p.add(dos);
        p.add(tres);
        p.add(cuatro);
        p.add(cinco);
        p.add(seis);
        p.add(siete);
        p.add(ocho);
        e.menu(p);



    }

    public void menu(Stack<vehiculo> p) {

        int conta;
        conta = p.size();
        for (int i = 0; i < p.size(); i++) {
            conta--;
            System.out.println("opcion " + conta + " " + p.get(i).patente + " movimientos " + p.get(i).c);



        }
        for (int i = 0; i < p.size(); i++) {
        }

        System.out.println("opcion 9 Salir");
        String op = JOptionPane.showInputDialog("Que vehículo desea mover :");

        while (!op.matches("[0-9].*")) {
            op = JOptionPane.showInputDialog("Que vehículo desea mover :");
        }
        if (op.equals("9")) {
            System.exit(0);
        } else {
            int opcion = Integer.parseInt(op);
            vehiculo v[] = new vehiculo[opcion];
            for (int i = 0; i < opcion; i++) {

                vehiculo aux = p.get(i);
                v[i] = aux;
                p.pop();


            }
            p.pop();

            for (int i = 0; i < v.length; i++) {
                p.push(v[i]);
            }
            menu(p);
        }



    }
}
