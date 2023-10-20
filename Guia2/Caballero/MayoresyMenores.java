package Guia2.Caballero;

import java.util.Scanner;

/*Dame los mayores y los menores : Dado un arreglo con valores enteros, realice la
búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre
por pantalla que no lo encontró. */
public class MayoresyMenores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = { 45, 58, 35, 25, 14, 19, 35 };
        System.out.println("Ingrese un numero para controlar si se encuentra en la lista");
        int eleccion = sc.nextInt();

        for (int numero : numeros) {
            if (eleccion == numero) {
                System.out.println(" El Numero :" + eleccion + " se encuentra en la lista");
                
                sc.close();
                return;
            }
        }
        System.out.println(" El Numero que eligio, no se encunetra en la lista");
        sc.close();
    }

}
