package divisas;


import java.util.*;
public class Divisas  {

static public Scanner t = new Scanner(System.in);
static double euro,dolar,argentino,monto,valor1,valor2,valor3,divisa;
static int opcion;


public void opcion1()
{   dolar=0.0016;euro=0.0015;argentino=0.0141;
   
   
    System.out.println("Ingrese monto que desea tranformar");  
    monto=t.nextDouble();
    valor1=dolar*monto;valor2=euro*monto;valor3=argentino*monto;
    System.out.println("es/son "+valor1+" Dolar/es Estadounidense/s");
    System.out.println("es/son "+valor2+" Euro/s");
    System.out.println("es/son "+valor3+" Peso/s Argentino/s");
    System.out.println(" ");
}

public void opcion2()
{   String nombre;
    System.out.println("Ingrese monto en pesos chilenos");
    monto=t.nextDouble();
    System.out.println("Ingrese nombre de la divisa a utilizar");
    nombre=t.next();
    System.out.println("Ingrese valor de la divisa EJ dolar = $640 (el monto solo deben ser digitos, sin caracteres)");
    valor1=t.nextDouble();
    valor2=monto/valor1;
    System.out.println("Monto en pesos chilenos : "+monto);
    System.out.println("Nombre de la divisa : "+nombre);
    System.out.println("Valor de la divisa : "+valor1);
    System.out.println("Resultado de la transformacion : "+valor2);
    System.out.println(" ");
}

    public static void main(String[] args) {
    
     Divisas a = new Divisas();
     String salir;
     
     System.out.println("CALCULADORA DE DIVISAS.");  
     
  
       do{ 
        System.out.println("Ingrese una opcion: ");
        System.out.println(" 1 - si desea obtener el valor en dolar Estado Unidense, Euro y peso Argentino.");
        System.out.println(" 2 - si desea obtener el valor en una divisa ingresada por teclado");
        System.out.println(" 3 - si desea salir del programa");
        try{opcion =t.nextInt();
        switch(opcion){
            case 1:a.opcion1();
                break;
            case 2 :a.opcion2();
                break;
            case 3 :System.out.println("¿Esta seguro/a que desea Salir? si o no");
                    salir=t.next();
                    if(salir.equalsIgnoreCase("si")){opcion=3;}
                    else{opcion=0;}
            break;
            default:System.out.println("La opcion ingresada no es valida vuelva a ingresar la opcion");
                    System.out.println(" ");
            break;
                      }}catch(Exception e){System.out.println("--¡¡Error!! ha ingresado un caracter no valido, el programa finalizo--- ");
            break;
                      }
        }while(opcion!=3);
      
        
        System.out.println("Gracias por utilizar nuestros servicios");
    }}
    

