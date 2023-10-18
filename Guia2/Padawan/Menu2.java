/*Realice un menú de opciones con bucle WHILE, donde
la opción se guarde en una variable (Sin pedir por teclado), muestre la opción
elegida y fuerce su salida bucle. */

//import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
         //Scanner sc = new Scanner(System.in);
        int eleccion=0;
        System.out.println("  Menu 2 ");
        do  {
            System.out.println(" Elija una Opcion ");
            System.out.println("Introduzca 1 para sumar");
            System.out.println("Introduzca 2 para restar");
            System.out.println("Introduzca 3 para multiplicar");
            System.out.println("Introduzca 4 para Salir");
            eleccion = eleccion+1;
            //eleccion =sc.nextInt();
            System.out.println("Usted eligio la opcion: "+ eleccion);


          }while( eleccion != 4 );
          System.out.println("Saliendo"); 
          // sc.close();
    }
}
